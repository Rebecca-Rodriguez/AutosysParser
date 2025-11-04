package dev.rebeccarodriguez.autosysparser;

import dev.rebeccarodriguez.autosysparser.model.AutosysJob;
import dev.rebeccarodriguez.autosysparser.output.ExcelWriter;
import dev.rebeccarodriguez.autosysparser.parser.JobParser;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        JobParser parser = new JobParser();
        List<String> targetJobs = loadTargetJobs("target_jobs.txt");
        List<AutosysJob> jobs = parser.parseJilFile("src/main/resources/JobDescriptions.jil", targetJobs);

        for (AutosysJob job : jobs) {
            System.out.println(job.getJobName() + " - " + job.getJobType() + " - " + job.getDescription());
        }
        ExcelWriter.writeJobsToExcel(jobs, "autosys_jobs.xlsx");
    }

    public static List<String> loadTargetJobs(String filePath) {
        try {
            if (!Files.exists(Paths.get(filePath))) {
                System.out.println("Target jobs file not found — parsing all jobs.");
                return Collections.emptyList(); // no filter
            }

            List<String> jobs = Files.readAllLines(Paths.get(filePath))
                    .stream()
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .toList();

            if (jobs.isEmpty()) {
                System.out.println("Target jobs file is empty — parsing all jobs.");
            }

            return jobs;
        } catch (IOException e) {
            System.err.println("Error reading target jobs file: " + e.getMessage());
            return Collections.emptyList(); // fallback
        }
    }
}