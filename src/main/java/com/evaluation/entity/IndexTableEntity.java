package com.evaluation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Wushiai
 * @date 2019/10/13 8:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndexTableEntity {
    private Integer id;

    private String indexname;

    private String weight;

    private String parentId;

    private String indexNum;

}