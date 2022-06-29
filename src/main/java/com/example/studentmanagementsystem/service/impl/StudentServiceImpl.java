package com.example.studentmanagementsystem.service.impl;

import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.repository.StudentRespository;
import com.example.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRespository studentRespository;

    public StudentServiceImpl(StudentRespository studentRespository) {
        this.studentRespository = studentRespository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRespository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRespository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRespository.findById(id).get();
    }

    @Override
    public Student uptadeStudent(Student student) {
        return studentRespository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRespository.deleteById(id);
    }
}
