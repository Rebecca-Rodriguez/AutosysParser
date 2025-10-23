package dev.rebeccarodriguez.autosysparser.parser;

import dev.rebeccarodriguez.autosysparser.model.AutosysJob;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JobParser {

    public List<AutosysJob> parseJilFile(String filePath) {
        List<AutosysJob> jobs = new ArrayList<>();
        AutosysJob currentJob = null;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty() || line.startsWith("/*") || line.startsWith("#")) {
                    continue;
                }

                if (line.startsWith("insert_job:")) {
                    if (currentJob != null) {
                        jobs.add(currentJob);
                    }
                    currentJob = new AutosysJob();

                    String[] parts = line.split("\\s+");
                    currentJob.setJobName(parts[1]);
                    if (line.contains("job_type:")) {
                        currentJob.setJobType(parts[3]);
                    }
                    continue;
                }

                if (currentJob != null && line.contains(":")) {
                    String[] kv = line.split(":", 2);
                    String key = kv[0].trim();
                    String value = kv[1].trim();

                    switch (key) {
                        case "box_name":
                            currentJob.setBoxName(value);
                            break;
                        case "description":
                            currentJob.setDescription(value);
                            break;
                        case "command":
                            currentJob.setCommand(value);
                            break;
                        case "owner":
                            currentJob.setOwner(value);
                            break;
                        case "machine":
                            currentJob.setMachine(value);
                            break;
                        case "condition":
                            currentJob.setCondition(value);
                            break;
                        case "date_conditions":
                            currentJob.setDateCondition(value);
                            break;
                        case "days_of_week":
                            currentJob.setDaysOfWeek(value);
                            break;
                        case "start_times":
                            currentJob.setStartTime(value);
                            break;
                        case "std_out_file":
                            currentJob.setStdOutFile(value);
                            break;
                        case "std_err_file":
                            currentJob.setStdErrFile(value);
                            break;
                        case "max_run_alarm":
                            currentJob.setMaxRunAlarm(value);
                            break;
                        case "alarm_if_fail":
                            currentJob.setAlarmIfFail(value);
                            break;
                        case "notification_emailaddress":
                            currentJob.setEmailAddress(value);
                            break;
                        case "notification_subject":
                            currentJob.setEmailMessage(value);
                            break;
                    }
                }
            }

            // Add last job
            if (currentJob != null) {
                jobs.add(currentJob);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return jobs;
    }
}
