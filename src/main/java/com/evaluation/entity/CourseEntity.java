package com.evaluation.entity;

/**
 * @author Wushiai
 * @date 2019/10/13 8:10
 */
public class CourseEntity {
    private Integer id;

    private String courseName;

    private String courseScore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseScore() {
        return courseScore;
    }

    public void setCourseScore(String courseScore) {
        this.courseScore = courseScore;
    }
}