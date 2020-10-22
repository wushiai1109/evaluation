package com.evaluation.dto;

import com.evaluation.entity.AdminEntity;
import lombok.Data;

/**
 * @author Wushiai
 * @date 2019/10/13 8:10
 */
@Data
public class AdminDTO extends AdminEntity {

    //页数
    private Integer page;

    //展示记录条数
    private Integer limit;

}
