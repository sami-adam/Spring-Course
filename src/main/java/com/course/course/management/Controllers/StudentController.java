package com.course.course.management.Controllers;

import com.course.course.management.Models.Student;
import com.course.course.management.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @DeleteMapping("/deleteStudent")
    public ResponseEntity<String> deleteStudent(@RequestParam Long id){
        return studentService.deleteStudent(id);
    }
}
