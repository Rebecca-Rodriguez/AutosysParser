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
                        case "command":
                            currentJob.setCommand(value);
                            if (currentJob.getCommand().toLowerCase().contains("keyword")) {
                                int chr = currentJob.getCommand().toLowerCase().indexOf("-f");
                                String feedID = currentJob.getCommand().substring(chr + 3);
                                currentJob.setFeedID(feedID);
                            }
                            break;
                        case "machine":
                            currentJob.setMachine(value);
                            break;
                        case "owner":
                            currentJob.setOwner(value);
                            break;
                        case "permission":
                            currentJob.setPermission(value);
                            break;
                        case "date_conditions":
                            currentJob.setDateCondition(value);
                            break;
                        case "run_calendar":
                            currentJob.setRunCalendar(value);
                            break;
                        case "exclude_calendar":
                            currentJob.setExcludeCalendar(value);
                            break;
                        case "days_of_week":
                            currentJob.setDaysOfWeek(value);
                            break;
                        case "start_mins":
                            currentJob.setStartMins(value);
                            break;
                        case "start_times":
                            currentJob.setStartTime(value);
                            break;
                        case "run_window":
                            currentJob.setRunWindow(value);
                            break;
                        case "condition":
                            currentJob.setCondition(value);
                            break;
                        case "description":
                            currentJob.setDescription(value);
                            break;
                        case "n_retrys":
                            currentJob.setnRetrys(value);
                            break;
                        case "term_run_time":
                            currentJob.setTermRunTime(value);
                            break;
                        case "box_terminator":
                            currentJob.setBoxTerminator(value);
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
                        case "profile":
                            currentJob.setProfile(value);
                            break;
                        case "alarm_if_terminated":
                            currentJob.setAlarmIfTerminated(value);
                            break;
                        case "timezone":
                            currentJob.setTimezone(value);
                            break;
                        case "group":
                            currentJob.setGroup(value);
                            break;
                        case "application":
                            currentJob.setApplicaiton(value);
                            break;
                        case "send_notification":
                            currentJob.setSendNotification(value);
                            break;
                        case "notification_msg":
                            currentJob.setEmailMessage(value);
                            break;
                        case "envvars":
                            currentJob.setEnvvars(value);
                            break;
                        case "watch_file":
                            currentJob.setWatchFile(value);
                            break;
                        case "watch_interval":
                            currentJob.setWatchInterval(value);
                            break;
                        case "notification_emailaddress":
                            currentJob.setEmailAddress(value);
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
