package com.example.newcursovaya.ui.DataObshaga;

public class WeeklyUsage {
    private int studentId;
    private long weekStartDate;
    private int usedMachinesCount;

    public WeeklyUsage(int studentId, long weekStartDate, int usedMachinesCount) {
        this.studentId = studentId;
        this.weekStartDate = weekStartDate;
        this.usedMachinesCount = usedMachinesCount;
    }

    public int getStudentId() {
        return studentId;
    }

    public long getWeekStartDate() {
        return weekStartDate;
    }

    public int getUsedMachinesCount() {
        return usedMachinesCount;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setWeekStartDate(long weekStartDate) {
        this.weekStartDate = weekStartDate;
    }

    public void setUsedMachinesCount(int usedMachinesCount) {
        this.usedMachinesCount = usedMachinesCount;
    }
}
