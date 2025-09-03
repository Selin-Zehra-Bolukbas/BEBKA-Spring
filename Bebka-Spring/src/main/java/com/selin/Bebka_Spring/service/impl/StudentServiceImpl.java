package com.selin.Bebka_Spring.service.impl;

import com.selin.Bebka_Spring.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentServiceImpl {

    Student save(Student student);
    List<Student> findAll();
    Page<Student> getStudents(Pageable pageable);
}
