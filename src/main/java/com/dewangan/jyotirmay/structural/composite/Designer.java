package com.dewangan.jyotirmay.structural.composite;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class Designer implements Employee {
    private int empId;
    private int salary;
    private String name;
    private String role;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Designer(int empId, int salary, String name){
        this.empId = empId;
        this.salary = salary;
        this.name = name;
        this.role = "Software Designer";
    }

    public void printEmpDetails(){
        System.out.println("["+ "Id : " + empId +
                ", Name : " + name +
                ", Salary : " + salary +
                ", Role : " + role +
                "]");
    }
}
