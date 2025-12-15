package com.james.system.mapper;

import com.james.system.entity.NbaPlayer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * NBA球员 Mapper接口
 */
@Mapper
public interface NbaPlayerMapper {

    /**
     * 根据ID查询球员
     */
    NbaPlayer selectById(@Param("playerId") Integer playerId);

    /**
     * 查询所有球员
     */
    List<NbaPlayer> selectAll();

    /**
     * 根据姓名模糊查询
     */
    List<NbaPlayer> selectByName(@Param("playerName") String playerName);

    /**
     * 根据位置查询
     */
    List<NbaPlayer> selectByPosition(@Param("position") String position);

    /**
     * 查询名人堂球员
     */
    List<NbaPlayer> selectHallOfFamers();

    /**
     * 新增球员
     */
    int insert(NbaPlayer player);

    /**
     * 更新球员
     */
    int update(NbaPlayer player);

    /**
     * 删除球员
     */
    int deleteById(@Param("playerId") Integer playerId);
}
