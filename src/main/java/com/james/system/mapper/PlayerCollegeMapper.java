package com.james.system.mapper;

import com.james.system.entity.PlayerCollege;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 球员-大学关联 Mapper接口
 */
@Mapper
public interface PlayerCollegeMapper {

    /**
     * 根据球员ID查询其大学
     */
    List<PlayerCollege> selectByPlayerId(@Param("playerId") Integer playerId);

    /**
     * 根据大学名称查询球员
     */
    List<PlayerCollege> selectByCollegeName(@Param("collegeName") String collegeName);

    /**
     * 新增记录
     */
    int insert(PlayerCollege playerCollege);

    /**
     * 删除记录
     */
    int deleteById(@Param("id") Integer id);

    /**
     * 根据球员ID删除所有关联
     */
    int deleteByPlayerId(@Param("playerId") Integer playerId);
}
