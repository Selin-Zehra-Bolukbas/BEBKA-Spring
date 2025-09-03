package com.selin.Bebka_Spring.service.impl;

import com.selin.Bebka_Spring.model.Employee;

import java.util.List;

public interface EmployeeServiceImpl {

     Employee save(Employee employee);
     List<Employee> findAll();
     Employee findById(int id);
     Employee update(Long id,Employee updatedEmployee);
     void delete(Long id);
}
