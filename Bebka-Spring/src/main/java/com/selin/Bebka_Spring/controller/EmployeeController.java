package com.selin.Bebka_Spring.controller;


import com.selin.Bebka_Spring.model.Employee;
import com.selin.Bebka_Spring.repository.EmployeeRepository;
import com.selin.Bebka_Spring.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeService employeeService, EmployeeRepository employeeRepository) {
        this.employeeService = employeeService;
        this.employeeRepository = employeeRepository;
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/search/name")
    public List<Employee> searchEmployeeByName(@RequestParam String name) {
        return employeeRepository.findByNameContaining(name);
    }

    @GetMapping("/search/department")
    public List<Employee> searchEmployeeByDepartment(@RequestParam String department) {
        return employeeRepository.findByDepartment(department);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
        return employeeService.update(id, employeeDetails);
    }

    @GetMapping("/search/salary")
    public List<Employee> getEmployeesWithSalaryGreater(@RequestParam Double amount) {
        return employeeRepository.findEmployeesWithSalaryGreaterThan(amount);
    }

    @GetMapping("/search/native-department")
    public List<Employee> getEmployeesByDepartmentNative(@RequestParam String dept) {
        return employeeRepository.findEmployeesByDepartmentNative(dept);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.delete(id);
    }
}
