package com.selin.Bebka_Spring.service;


import com.selin.Bebka_Spring.model.Employee;
import com.selin.Bebka_Spring.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
    public Employee findById(int id) {
        return employeeRepository.findById(Long.valueOf(id)).orElse(null);
    }
    public Employee update(Long id,Employee updatedEmployee) {
        return employeeRepository.findById(id)
                .map(emp -> {
                    emp.setName(updatedEmployee.getName());
                    emp.setDepartment(updatedEmployee.getDepartment());
                    emp.setSalary(updatedEmployee.getSalary());
                    return employeeRepository.save(emp);
                })
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    }
    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}
