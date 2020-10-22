package com.evaluation.entity;

/**
 * @author Wushiai
 * @date 2019/10/13 8:10
 */
public class CourseTeaEntity {
    private Integer id;

    private Integer courseId;

    private Integer teacherId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}