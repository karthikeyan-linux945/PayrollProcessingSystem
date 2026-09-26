package com.mentorbridge.payroll;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee permanentEmployee =
                new PermanentEmployee(
                        "EMP101",
                        "Arun",
                        3000,
                        500,
                        200
                );

        Employee contractEmployee =
                new ContractEmployee(
                        "EMP102",
                        "Kumar",
                        3000,
                        400
                );

        Employee manager =
                new Manager(
                        "EMP103",
                        "Priya",
                        5000,
                        800,
                        300,
                        1000
                );

        // HAS-A relationship
        Payroll payroll = new Payroll(permanentEmployee);

        payroll.processPayroll();
        payroll.generatePayslip();

        System.out.println();
        System.out.println("========== POLYMORPHISM ==========");

        Employee employee;

        employee = permanentEmployee;
        System.out.println(
                "Permanent Gross: €" +
                        employee.calculateGrossSalary()
        );

        employee = contractEmployee;
        System.out.println(
                "Contract Gross: €" +
                        employee.calculateGrossSalary()
        );

        employee = manager;
        System.out.println(
                "Manager Gross: €" +
                        employee.calculateGrossSalary()
        );

        // Collection of different Employee objects
        List<Employee> employees = new ArrayList<>();

        employees.add(permanentEmployee);
        employees.add(contractEmployee);
        employees.add(manager);

        // Payroll Service
        PayrollService payrollService = new PayrollService();
        payrollService.processPayroll(employees);

        // Payroll Report
        PayrollReport payrollReport = new PayrollReport();
        payrollReport.generateReport(employees);
    }
}