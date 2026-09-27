package com.mentorbridge.payroll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PayrollServiceTest {

    private PayrollService payrollService;
    private List<Employee> employees;

    @BeforeEach
    void setUp() {

        payrollService = new PayrollService();

        employees = new ArrayList<>();

        employees.add(
                new PermanentEmployee(
                        "EMP101",
                        "Arun",
                        3000,
                        500,
                        200
                )
        );

        employees.add(
                new ContractEmployee(
                        "EMP102",
                        "Kumar",
                        3000,
                        400
                )
        );

        employees.add(
                new Manager(
                        "EMP103",
                        "Priya",
                        5000,
                        800,
                        300,
                        1000
                )
        );
    }

    @Test
    void shouldCreatePayrollService() {

        assertNotNull(payrollService);
    }

    @Test
    void shouldContainThreeEmployees() {

        assertEquals(3, employees.size());
    }

    @Test
    void shouldProcessPermanentEmployee() {

        Employee employee = employees.get(0);

        assertEquals(
                3700,
                employee.calculateGrossSalary()
        );

        assertEquals(
                3330,
                employee.calculateNetSalary()
        );
    }

    @Test
    void shouldProcessContractEmployee() {

        Employee employee = employees.get(1);

        assertEquals(
                3400,
                employee.calculateGrossSalary()
        );

        assertEquals(
                3230,
                employee.calculateNetSalary()
        );
    }

    @Test
    void shouldProcessManager() {

        Employee employee = employees.get(2);

        assertEquals(
                7100,
                employee.calculateGrossSalary()
        );

        assertEquals(
                6248,
                employee.calculateNetSalary()
        );
    }
}