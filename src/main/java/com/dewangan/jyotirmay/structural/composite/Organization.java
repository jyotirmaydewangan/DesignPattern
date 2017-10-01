package com.dewangan.jyotirmay.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class Organization {
    private List<Employee> employeeList;

    public Organization(){
        employeeList = new ArrayList<Employee>();
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public int netSalary(){
        int totalSalary = 0;

        for(Employee emp : employeeList){
            totalSalary += emp.getSalary();
        }

        return totalSalary;
    }
}
