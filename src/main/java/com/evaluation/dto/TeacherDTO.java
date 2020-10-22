package com.evaluation.dto;

import com.evaluation.entity.TeacherEntity;
import lombok.Data;

/**
 * @author Wushiai
 * @date 2019/10/13 8:10
 */
@Data
public class TeacherDTO extends TeacherEntity {

    private Integer[] courseIds;

}
