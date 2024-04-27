package com.course.course.management.Services;

import com.course.course.management.Models.Course;
import com.course.course.management.Repositories.CourseRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.Date;
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

    // Update Course
    public Course updateCourse(Long id, Course courseObj){
        Course course = courseRepository.findById(id).orElseThrow();
        course.setDescription(courseObj.getDescription());
        course.setTitle(courseObj.getTitle());
        courseRepository.save(course);
        return course;
    }

    // Delete Course
    public Course deleteCourse(Long id){
        Course course = courseRepository.findById(id).orElseThrow();
        courseRepository.delete(course);
        return course;
    }
}
