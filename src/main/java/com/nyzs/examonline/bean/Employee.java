package com.nyzs.examonline.bean;


public class Employee {

    private Long id;
    private String employeeNum;
    private String employeeName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeNum='" + employeeNum + '\'' +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
