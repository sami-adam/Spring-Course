package com.course.course.management.Services;

import com.course.course.management.Models.Course;
import com.course.course.management.Repositories.CourseRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    // Get All Courses
    public List<Course> getAllCourses() {
        List<Course> courses = courseRepository.findAll();
        return courses;
    }

    // Add New Course
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }
}
