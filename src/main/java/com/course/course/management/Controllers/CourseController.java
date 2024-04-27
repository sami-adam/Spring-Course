package com.course.course.management.Controllers;

import com.course.course.management.Models.Course;
import com.course.course.management.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @PutMapping("/updateCourse")
    public Course updateCourse(@Param("id") Long id, @RequestBody Course course){
        return courseService.updateCourse(id, course);
    }

    @DeleteMapping("/deleteCourse")
    public Course deleteCourse(@Param("id") Long id){
        return courseService.deleteCourse(id);
    }
}
