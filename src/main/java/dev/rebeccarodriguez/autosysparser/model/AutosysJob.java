package dev.rebeccarodriguez.autosysparser.model;

public class AutosysJob {
    private String jobName;
    private String jobType;
    private String boxName;
    private String description;
    private String command;
    private String owner;
    private String machine;
    private String condition;
    private boolean dateCondition;
    private String daysOfWeek;
    private String startTime;
    private String stdOutFile;
    private String stdErrFile;
    private String maxRunAlarm;
    private boolean alarmIfFail;
    private String emailAddress;
    private String emailSubject;

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

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }
}
