package com.course.course.management.Services;

import com.course.course.management.Models.Student;
import com.course.course.management.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student addStudent(Student student){
        studentRepository.save(student);
        return student;
    }

    public ResponseEntity<String> deleteStudent(Long id){
        studentRepository.deleteById(id);
        return ResponseEntity.ok("Student with id " + id + " deleted successfully");
    }
}
