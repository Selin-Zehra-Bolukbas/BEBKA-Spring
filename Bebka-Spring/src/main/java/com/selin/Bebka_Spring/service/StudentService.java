package com.selin.Bebka_Spring.service;

import com.selin.Bebka_Spring.model.Student;
import com.selin.Bebka_Spring.repository.StudentRepository;
import com.selin.Bebka_Spring.service.impl.StudentServiceImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    Student save(Student student);
    List<Student> findAll();
    Page<Student> getStudents(Pageable pageable);

}
