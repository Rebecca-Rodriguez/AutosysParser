package dev.rebeccarodriguez.autosysparser;

import dev.rebeccarodriguez.autosysparser.model.AutosysJob;
import dev.rebeccarodriguez.autosysparser.output.ExcelWriter;
import dev.rebeccarodriguez.autosysparser.parser.JobParser;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        JobParser parser = new JobParser();
        List<AutosysJob> jobs = parser.parseJilFile("src/main/resources/JobDescriptions.jil");

        for (AutosysJob job : jobs) {
            System.out.println(job.getJobName() + " - " + job.getJobType() + " - " + job.getDescription());
        }
        ExcelWriter.writeJobsToExcel(jobs, "autosys_jobs.xlsx");
    }
}