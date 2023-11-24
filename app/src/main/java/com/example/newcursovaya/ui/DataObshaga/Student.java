package com.example.newcursovaya.ui.DataObshaga;

public class Student {
    private int studentId;
    private String name;
    private String email;
    private String otherDetails;

    public Student(int studentId, String name, String email, String otherDetails) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.otherDetails = otherDetails;
    }
    public Student(){

    }
    public Student(String name, String email, String otherDetails){

    }
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getOtherDetails() {
        return otherDetails;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }
}
