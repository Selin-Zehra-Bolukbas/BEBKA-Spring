package com.selin.Bebka_Spring.service.impl;

import com.selin.Bebka_Spring.model.Student;
import com.selin.Bebka_Spring.repository.StudentRepository;
import com.selin.Bebka_Spring.service.StudentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
    @Override
    public Page<Student> getStudents(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }
}
