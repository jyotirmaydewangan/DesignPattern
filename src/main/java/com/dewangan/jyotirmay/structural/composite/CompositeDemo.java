package com.dewangan.jyotirmay.structural.composite;

/**
 * Created by jyotirmay.d on 30/09/17.
 */
public class CompositeDemo {

    public static void main(String[] arg){
        Employee developer = new Developer(1, 1600000, "Jyotirmay Dewangan");
        Employee designer  = new Designer (2, 1400000, "Deepak Dewangan");

        developer.printEmpDetails();
        designer.printEmpDetails();

        Organization org = new Organization();
        org.addEmployee(developer);
        org.addEmployee(designer);

        System.out.println("Net Salary = " + org.netSalary());

    }
}
