package com.example.newcursovaya.ui.DataObshaga;

public class Reservation {
    private int reservationId;
    private int studentId;
    private int machineId;
    private String reservationTime;
    private String otherReservationDetails;

    public Reservation(int reservationId, int studentId, int machineId, String reservationTime, String otherReservationDetails) {
        this.reservationId = reservationId;
        this.studentId = studentId;
        this.machineId = machineId;
        this.reservationTime = reservationTime;
        this.otherReservationDetails = otherReservationDetails;
    }

    public int getReservationId() {
        return reservationId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getMachineId() {
        return machineId;
    }

    public String getReservationTime() {
        return reservationTime;
    }

    public String getOtherReservationDetails() {
        return otherReservationDetails;
    }
    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public void setReservationTime(String reservationTime) {
        this.reservationTime = reservationTime;
    }

    public void setOtherReservationDetails(String otherReservationDetails) {
        this.otherReservationDetails = otherReservationDetails;
    }
}
