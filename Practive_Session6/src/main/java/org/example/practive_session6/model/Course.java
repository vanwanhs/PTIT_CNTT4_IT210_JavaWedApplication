package org.example.practive_session6.model;

import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

public class Course {

    private String code;
    private String name;
    private String level;
    private double fee;
    private String description;
    private String instructor;
    private int duration;
    private boolean full;
    private int studentCount;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    public Course(){}

    public Course(String code, String name, String level, double fee, String description, String instructor, int duration, boolean full, int studentCount, LocalDate startDate) {
        this.code = code;
        this.name = name;
        this.level = level;
        this.fee = fee;
        this.description = description;
        this.instructor = instructor;
        this.duration = duration;
        this.full = full;
        this.studentCount = studentCount;
        this.startDate = startDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}