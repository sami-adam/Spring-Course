package com.course.course.management.Controllers;

import com.course.course.management.Models.Instructor;
import com.course.course.management.Services.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1")
@RestController
public class InstructorController {
    @Autowired
    private InstructorService instructorService;

    @PostMapping("/addInstructor")
    public Instructor addInstructor(@RequestBody Instructor instructor){
        return instructorService.addInstructor(instructor);
    }
}
