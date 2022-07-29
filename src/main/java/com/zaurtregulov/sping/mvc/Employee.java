package com.zaurtregulov.sping.mvc;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;
    private String lastName;
    private String department;
    private int salary;

    private Map<String, String> departments;

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Employee() {
        departments = new HashMap<>();
        departments.put("It", "Information Tech");
        departments.put("HR", "Human resources");
        departments.put("OP", "Operation p");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
