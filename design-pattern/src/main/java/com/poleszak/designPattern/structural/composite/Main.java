package com.poleszak.designPattern.structural.composite;

import com.poleszak.designPattern.structural.composite.department.Department;
import com.poleszak.designPattern.structural.composite.department.FinancialDepartment;
import com.poleszak.designPattern.structural.composite.department.HeadDepartment;
import com.poleszak.designPattern.structural.composite.department.SalesDepartment;

public class Main {

    public static void main(String[] args) {
        Department salesDepartment = new SalesDepartment(
                "Sales department");
        Department financialDepartment = new FinancialDepartment(
                "Financial department");

        HeadDepartment headDepartment = new HeadDepartment(
        );

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();

        headDepartment.removeDepartment(salesDepartment);
        System.out.println("REMOVING...");
        headDepartment.printDepartmentName();
    }
}
