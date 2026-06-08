package com.example.Practice.Springboot.APIs8;


public class Employee {
    private String employeeId;
    private String employeeName;
    private String department;

    public Employee() {}
    public Employee(String employeeId, String employeeName, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }


    public String getEmployeeId() {
        return employeeId; }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId; }
    public String getEmployeeName() {
        return employeeName; }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName; }
    public String getDepartment() {
        return department; }
    public void setDepartment(String department) {
        this.department = department; }
}

