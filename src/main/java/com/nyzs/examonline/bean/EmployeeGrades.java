package com.nyzs.examonline.bean;

/**
 * @author ：RukiHuang
 * @description：TODO
 * @date ：2022/3/20 18:02
 */
public class EmployeeGrades {
    private int id;
    private String employeeNum;
    private String employeeName;
    private String examDate;
    private int grades;

    public EmployeeGrades(String employeeNum, String employeeName, String examDate, int grades) {
        this.employeeNum = employeeNum;
        this.employeeName = employeeName;
        this.examDate = examDate;
        this.grades = grades;
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "EmployeeGrades{" +
                "id=" + id +
                ", employeeNum=" + employeeNum +
                ", employeeName='" + employeeName + '\'' +
                ", examDate='" + examDate + '\'' +
                ", grades=" + grades +
                '}';
    }
}
