package com.example.newcursovaya.ui.DataObshaga;

public class WashingMachine {
    private int machineId;
    private String machineName;
    private int availability;
    private String otherMachineDetails;

    public WashingMachine(int machineId, String machineName, int availability, String otherMachineDetails) {
        this.machineId = machineId;
        this.machineName = machineName;
        this.availability = availability;
        this.otherMachineDetails = otherMachineDetails;
    }

    public int getMachineId() {
        return machineId;
    }

    public String getMachineName() {
        return machineName;
    }

    public int getAvailability() {
        return availability;
    }

    public String getOtherMachineDetails() {
        return otherMachineDetails;
    }
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public void setOtherMachineDetails(String otherMachineDetails) {
        this.otherMachineDetails = otherMachineDetails;
    }
}

