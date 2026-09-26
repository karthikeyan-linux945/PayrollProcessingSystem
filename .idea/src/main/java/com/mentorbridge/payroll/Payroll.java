package com.mentorbridge.payroll;

public class Payroll {

    private Employee employee;

    public Payroll(Employee employee) {

        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void processPayroll() {

        System.out.println("========== PAYROLL PROCESSING ==========");

        employee.displayEmployeeDetails();

        System.out.println("Gross Salary : €" + employee.calculateGrossSalary());
        System.out.println("Deduction    : €" + employee.calculateDeduction());
        System.out.println("Net Salary   : €" + employee.calculateNetSalary());

        System.out.println("========================================");
    }

    public void generatePayslip() {

        System.out.println();
        System.out.println("*************** PAYSLIP ***************");

        System.out.println("Employee ID   : " + employee.getEmployeeId());
        System.out.println("Employee Name : " + employee.getEmployeeName());
        System.out.println("Gross Salary  : €" + employee.calculateGrossSalary());
        System.out.println("Deduction     : €" + employee.calculateDeduction());
        System.out.println("Net Salary    : €" + employee.calculateNetSalary());

        System.out.println("***************************************");
    }
}