package dev.rebeccarodriguez.autosysparser.output;

import dev.rebeccarodriguez.autosysparser.model.AutosysJob;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExcelWriter {

    public static void writeJobsToExcel(List<AutosysJob> jobs, String filePath) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Autosys Jobs");

            List<String> headers = new ArrayList<>();
            if (!jobs.isEmpty()) {
                headers.addAll(jobs.get(0).toMap().keySet());
            }
            Row headerRow = sheet.createRow(0);
            for (int i = 0; i < headers.size(); i++) {
                headerRow.createCell(i).setCellValue(headers.get(i));
            }

            int rowNum = 1;
            for (AutosysJob job : jobs) {
                Map<String, Object> data = job.toMap();
                Row row = sheet.createRow(rowNum++);
                int i = 0;

                for (String key : headers) {
                    Object value = data.get(key);
                    if (value instanceof Boolean b) {
                        row.createCell(i++).setCellValue(b);
                    } else if (value != null) {
                        row.createCell(i++).setCellValue(value.toString());
                    } else {
                        row.createCell(i++).setCellValue("");
                    }
                }
            }
            for (int i = 0; i < headers.size(); i++) {
                sheet.autoSizeColumn(i);
            }

            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
