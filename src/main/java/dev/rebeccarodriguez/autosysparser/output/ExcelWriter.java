package dev.rebeccarodriguez.autosysparser.output;

import dev.rebeccarodriguez.autosysparser.model.AutosysJob;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelWriter {

    public static void writeJobsToExcel(List<AutosysJob> jobs, String filePath) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Autosys Jobs");

            Row header = sheet.createRow(0);
            header.createCell(0).setCellValue("Job Name");
            header.createCell(1).setCellValue("Job Type");
            header.createCell(2).setCellValue("Box Name");
            header.createCell(3).setCellValue("Command");
            header.createCell(4).setCellValue("Machine");
            header.createCell(5).setCellValue("Owner");
            header.createCell(6).setCellValue("Date Conditions");
            int rowNum = 1;
            for (AutosysJob job : jobs) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(job.getJobName());
                row.createCell(1).setCellValue(job.getJobType());
                row.createCell(2).setCellValue(job.getBoxName());
                row.createCell(3).setCellValue(job.getCommand());
                row.createCell(4).setCellValue(job.getMachine());
                row.createCell(5).setCellValue(job.getOwner());
                row.createCell(6).setCellValue(String.valueOf(job.getDateCondition()));
            }

            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
