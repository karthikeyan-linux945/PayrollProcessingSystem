package com.mentorbridge.payroll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PayrollTest {

    private Payroll payroll;
    private Employee employee;

    @BeforeEach
    void setUp() {

        employee = new PermanentEmployee(
                "EMP101",
                "Arun",
                3000,
                500,
                200
        );

        payroll = new Payroll(employee);
    }

    @Test
    void shouldCreatePayroll() {
        assertNotNull(payroll);
    }

    @Test
    void payrollShouldContainEmployee() {
        assertEquals(employee, payroll.getEmployee());
    }

    @Test
    void shouldCalculateEmployeeNetSalary() {
        assertEquals(
                3330,
                payroll.getEmployee().calculateNetSalary(),
                0.001
        );
    }
}