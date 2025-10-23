package dev.rebeccarodriguez.autosysparser.model;

public class AutosysJob {
    private String jobName;
    private String jobType;
    private String boxName;
    private String command;
    private String machine;
    private String owner;
    private String permission;
    private boolean dateCondition;
    private String daysOfWeek;
    private String startTime;
    private String startMins;
    private String runWindow;
    private String condition;
    private String description;
    private String stdOutFile;
    private String stdErrFile;
    private String maxRunAlarm;
    private boolean alarmIfFail;
    private String profile;
    private String alarmIfTerminated;
    private String timezone;
    private String group;
    private String applicaiton;
    private boolean sendNotification;
    private String emailMessage;
    private String envvars;
    private String emailAddress;

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

    public boolean getDateCondition() {
        return dateCondition;
    }

    public void setDateCondition(String dateCondition) {
        this.dateCondition = Boolean.parseBoolean(dateCondition);
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

    public boolean getAlarmIfFail() {
        return alarmIfFail;
    }

    public void setAlarmIfFail(String alarmIfFail) {
        this.alarmIfFail = Boolean.parseBoolean(alarmIfFail);
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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

    public boolean isSendNotification() {
        return sendNotification;
    }

    public void setSendNotification(boolean sendNotification) {
        this.sendNotification = sendNotification;
    }

    public String getEnvvars() {
        return envvars;
    }

    public void setEnvvars(String envvars) {
        this.envvars = envvars;
    }
}
