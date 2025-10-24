package dev.rebeccarodriguez.autosysparser.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AutosysJob {
    private String jobName;
    private String jobType;
    private String boxName;
    private String command;
    private String feedID;
    private String machine;
    private String owner;
    private String permission;
    private String dateCondition;
    private String runCalendar;
    private String excludeCalendar;
    private String daysOfWeek;
    private String startTime;
    private String startMins;
    private String runWindow;
    private String condition;
    private String description;
    private String nRetrys;
    private String termRunTime;
    private String boxTerminator;
    private String stdOutFile;
    private String stdErrFile;
    private String maxRunAlarm;
    private String alarmIfFail;
    private String profile;
    private String alarmIfTerminated;
    private String timezone;
    private String group;
    private String applicaiton;
    private String sendNotification;
    private String emailMessage;
    private String envvars;
    private String watchFile;
    private String watchInterval;
    private List<String> emailAddress = new ArrayList<>();

    public AutosysJob() {

    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getBoxName() {
        return boxName;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getFeedID() {
        return feedID;
    }

    public void setFeedID(String feedID) {
        this.feedID = feedID;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getDateCondition() {
        return dateCondition;
    }

    public void setDateCondition(String dateCondition) {
        this.dateCondition = dateCondition;
    }

    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStdOutFile() {
        return stdOutFile;
    }

    public void setStdOutFile(String stdOutFile) {
        this.stdOutFile = stdOutFile;
    }

    public String getStdErrFile() {
        return stdErrFile;
    }

    public void setStdErrFile(String stdErrFile) {
        this.stdErrFile = stdErrFile;
    }

    public String getMaxRunAlarm() {
        return maxRunAlarm;
    }

    public void setMaxRunAlarm(String maxRunAlarm) {
        this.maxRunAlarm = maxRunAlarm;
    }

    public String getAlarmIfFail() {
        return alarmIfFail;
    }

    public void setAlarmIfFail(String alarmIfFail) {
        this.alarmIfFail = alarmIfFail;
    }

    public List<String> getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String email) {
        emailAddress.add(email);
    }

    public String getEmailMessage() {
        return emailMessage;
    }

    public void setEmailMessage(String emailMessage) {
        this.emailMessage = emailMessage;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getStartMins() {
        return startMins;
    }

    public void setStartMins(String startMins) {
        this.startMins = startMins;
    }

    public String getRunWindow() {
        return runWindow;
    }

    public void setRunWindow(String runWindow) {
        this.runWindow = runWindow;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getAlarmIfTerminated() {
        return alarmIfTerminated;
    }

    public void setAlarmIfTerminated(String alarmIfTerminated) {
        this.alarmIfTerminated = alarmIfTerminated;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getApplicaiton() {
        return applicaiton;
    }

    public void setApplicaiton(String applicaiton) {
        this.applicaiton = applicaiton;
    }

    public String getSendNotification() {
        return sendNotification;
    }

    public void setSendNotification(String sendNotification) {
        this.sendNotification = sendNotification;
    }

    public String getEnvvars() {
        return envvars;
    }

    public void setEnvvars(String envvars) {
        this.envvars = envvars;
    }

    public String getRunCalendar() {
        return runCalendar;
    }

    public void setRunCalendar(String runCalendar) {
        this.runCalendar = runCalendar;
    }

    public String getnRetrys() {
        return nRetrys;
    }

    public void setnRetrys(String nRetrys) {
        this.nRetrys = nRetrys;
    }

    public String getTermRunTime() {
        return termRunTime;
    }

    public void setTermRunTime(String termRunTime) {
        this.termRunTime = termRunTime;
    }

    public String getBoxTerminator() {
        return boxTerminator;
    }

    public void setBoxTerminator(String boxTerminator) {
        this.boxTerminator = boxTerminator;
    }

    public String getWatchFile() {
        return watchFile;
    }

    public void setWatchFile(String watchFile) {
        this.watchFile = watchFile;
    }

    public String getWatchInterval() {
        return watchInterval;
    }

    public void setWatchInterval(String watchInterval) {
        this.watchInterval = watchInterval;
    }

    public String getExcludeCalendar() {
        return excludeCalendar;
    }

    public void setExcludeCalendar(String excludeCalendar) {
        this.excludeCalendar = excludeCalendar;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("Job Name", getJobName());
        map.put("Job Type", getJobType());
        map.put("Box Name", getBoxName());
        map.put("Command", getCommand());
        map.put("Datapath Feed ID", getFeedID());
        map.put("Machine", getMachine());
        map.put("Owner", getOwner());
        map.put("Permission", getPermission());
        map.put("Date Conditions", getDateCondition());
        map.put("Run Calendar", getRunCalendar());
        map.put("Exclude Calendar", getExcludeCalendar());
        map.put("Days of the Week", getDaysOfWeek());
        map.put("Start Times", getStartTime());
        map.put("Start Mins", getStartMins());
        map.put("Run Window", getRunWindow());
        map.put("Condition", getCondition());
        map.put("Description", getDescription());
        map.put("N Retrys", getnRetrys());
        map.put("Term Run Time", getTermRunTime());
        map.put("Box Terminator", getBoxTerminator());
        map.put("Out File", getStdOutFile());
        map.put("Error File", getStdErrFile());
        map.put("Max Run Alarm", getMaxRunAlarm());
        map.put("Alarm If Fail", getAlarmIfFail());
        map.put("Profile", getProfile());
        map.put("Alarm If Terminated", getAlarmIfTerminated());
        map.put("Timezone", getTimezone());
        map.put("Group", getGroup());
        map.put("Application", getApplicaiton());
        map.put("Send Notification", getSendNotification());
        map.put("Notification Message", getEmailMessage());
        map.put("Envvars", getEnvvars());
        map.put("Watch File", getWatchFile());
        map.put("Watch Interval", getWatchInterval());
        String emails = String.join("; ", getEmailAddress());
        map.put("Email Address", emails);
        return map;
    }
}
