package com.james.system.mapper;

import com.james.system.entity.PositionDict;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 位置字典 Mapper接口
 */
@Mapper
public interface PositionDictMapper {

    /**
     * 根据位置代码查询
     */
    PositionDict selectByCode(@Param("positionCode") String positionCode);

    /**
     * 查询所有位置
     */
    List<PositionDict> selectAll();

    /**
     * 新增位置
     */
    int insert(PositionDict positionDict);

    /**
     * 更新位置
     */
    int update(PositionDict positionDict);

    /**
     * 删除位置
     */
    int deleteByCode(@Param("positionCode") String positionCode);
}
