package com.selin.Bebka_Spring.service;

import com.selin.Bebka_Spring.model.Employee;
import com.selin.Bebka_Spring.repository.EmployeeRepository;
import com.selin.Bebka_Spring.service.impl.EmployeeServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    Employee save(Employee employee);
    List<Employee> findAll();
    Employee findById(int id);
    Employee update(Long id,Employee updatedEmployee);
    void delete(Long id);

}
