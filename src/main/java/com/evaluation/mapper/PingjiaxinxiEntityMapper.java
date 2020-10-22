package com.evaluation.mapper;

import com.evaluation.entity.PingjiaxinxiEntity;
import com.evaluation.entity.PingjiaxinxiEntityExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author Wushiai
 * @date 2019/10/13 8:10
 */
public interface PingjiaxinxiEntityMapper {
    long countByExample(PingjiaxinxiEntityExample example);

    int deleteByExample(PingjiaxinxiEntityExample example);

    int deleteByPrimaryKey(Integer id);

    int insertBatch(List<PingjiaxinxiEntity> records);

    int insert(PingjiaxinxiEntity record);

    int insertSelective(PingjiaxinxiEntity record);

    PingjiaxinxiEntity selectOneByExample(PingjiaxinxiEntityExample example);

    List<PingjiaxinxiEntity> selectByExamplePaging(@Param("example") PingjiaxinxiEntityExample example, @Param("offset") int offset, @Param("limit") int limit);

    List<PingjiaxinxiEntity> selectByExample(PingjiaxinxiEntityExample example);

    PingjiaxinxiEntity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PingjiaxinxiEntity record, @Param("example") PingjiaxinxiEntityExample example);

    int updateByExample(@Param("record") PingjiaxinxiEntity record, @Param("example") PingjiaxinxiEntityExample example);

    int updateByPrimaryKeySelective(PingjiaxinxiEntity record);

    int updateByPrimaryKey(PingjiaxinxiEntity record);
}