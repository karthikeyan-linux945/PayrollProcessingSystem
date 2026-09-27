package com.mentorbridge.payroll;

public class ContractEmployee extends Employee {

    private double contractBonus;

    public ContractEmployee(
            String employeeId,
            String employeeName,
            double basicSalary,
            double contractBonus) {

        super(employeeId, employeeName, basicSalary);

        this.contractBonus = contractBonus;
    }

    public double getContractBonus() {
        return contractBonus;
    }

    @Override
    public double calculateGrossSalary() {
        return getBasicSalary() + contractBonus;
    }

    @Override
    public double calculateDeduction() {
        return calculateGrossSalary() * 0.05;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();

        System.out.println("Contract Bonus : €" + contractBonus);
    }
}