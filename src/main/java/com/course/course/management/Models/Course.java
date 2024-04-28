package com.course.course.management.Models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import org.hibernate.mapping.Selectable;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    @ManyToOne
    @JoinColumn(name = "instructor_id", referencedColumnName = "id")
    private Instructor instructor;
    private Date startDate;
    private Date endDate;
    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public String getStartDate() {
        return startDate.toString();
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate.toString();
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
