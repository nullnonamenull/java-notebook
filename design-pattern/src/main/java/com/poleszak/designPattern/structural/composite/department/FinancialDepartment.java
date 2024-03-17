package com.poleszak.designPattern.structural.composite.department;

public record FinancialDepartment(String name) implements Department {

    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

}
