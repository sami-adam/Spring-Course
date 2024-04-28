package com.course.course.management.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String grade;
    @ManyToMany
    @JoinTable(name="course_student_rel", joinColumns = @JoinColumn(name="student_id"),
    inverseJoinColumns = @JoinColumn(name="course_id"))
    private List<Course> courses;

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public List<Course> getCourses(){
        return this.courses;
    }

    public void setCourses(List<Course> courses){
        this.courses = courses;
    }
}
