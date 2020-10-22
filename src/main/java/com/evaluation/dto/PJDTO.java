package com.evaluation.dto;

import lombok.Data;

/**
 * @author Wushiai
 * @date 2019/10/13 8:10
 */
@Data
public class PJDTO {

    private Integer id;

    //总分
    private Integer zongfen;

    //时间
    private String shijian;

    //教师姓名
    private String teacherName;

    //学生姓名
    private String studentName;

}
