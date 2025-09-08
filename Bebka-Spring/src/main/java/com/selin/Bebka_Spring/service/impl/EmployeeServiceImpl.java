package com.selin.Bebka_Spring.service.impl;

import com.selin.Bebka_Spring.model.Employee;
import com.selin.Bebka_Spring.repository.EmployeeRepository;
import com.selin.Bebka_Spring.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

     private final EmployeeRepository employeeRepository;

     public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
          this.employeeRepository = employeeRepository;
     }
     @Override
     @Transactional(propagation = Propagation.REQUIRES_NEW)
     public Employee save(Employee employee) {
          return employeeRepository.save(employee);
     }
     @Override
     public List<Employee> findAll() {
          return employeeRepository.findAll();
     }
     @Override
     public Employee findById(int id) {
          return employeeRepository.findById(Long.valueOf(id)).orElse(null);
     }
     @Override
     @Transactional()
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
     @Override
     @Transactional
     public void delete(Long id) {
          employeeRepository.deleteById(id);
     }
}
