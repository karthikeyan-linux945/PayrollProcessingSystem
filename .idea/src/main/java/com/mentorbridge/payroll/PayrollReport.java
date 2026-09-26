package com.mentorbridge.payroll;

import java.util.List;

public class PayrollReport {

    public void generateReport(List<Employee> employees) {

        System.out.println();
        System.out.println("========== PAYROLL REPORT ==========");

        for (Employee employee : employees) {

            System.out.println(
                    employee.getEmployeeId()
                            + " | "
                            + employee.getEmployeeName()
                            + " | Gross: €"
                            + employee.calculateGrossSalary()
                            + " | Deduction: €"
                            + employee.calculateDeduction()
                            + " | Net: €"
                            + employee.calculateNetSalary()
            );
        }

        System.out.println("====================================");
    }
}