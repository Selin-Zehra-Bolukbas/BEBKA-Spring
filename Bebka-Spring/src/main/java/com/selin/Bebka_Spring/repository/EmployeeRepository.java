package com.selin.Bebka_Spring.repository;


import com.selin.Bebka_Spring.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByNameContaining(String name);
    List<Employee> findByDepartment(String department);

    @Query("SELECT e FROM Employee e WHERE e.salary > :amount")
    List<Employee> findEmployeesWithSalaryGreaterThan(@Param("amount") Double amount);

    @Query(value = "SELECT * FROM employees WHERE department = :dept", nativeQuery = true)
    List<Employee> findEmployeesByDepartmentNative(@Param("dept") String dept);


}
