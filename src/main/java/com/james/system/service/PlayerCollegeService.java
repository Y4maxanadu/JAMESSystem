package com.james.system.service;

import com.james.system.entity.PlayerCollege;
import com.james.system.mapper.PlayerCollegeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 球员-大学关联 Service
 */
@Service
public class PlayerCollegeService {

    @Autowired
    private PlayerCollegeMapper playerCollegeMapper;

    /**
     * 根据球员ID查询其大学
     */
    public List<PlayerCollege> getByPlayerId(Integer playerId) {
        return playerCollegeMapper.selectByPlayerId(playerId);
    }

    /**
     * 根据大学名称查询球员
     */
    public List<PlayerCollege> getByCollegeName(String collegeName) {
        return playerCollegeMapper.selectByCollegeName(collegeName);
    }

    /**
     * 新增记录
     */
    public int add(PlayerCollege playerCollege) {
        return playerCollegeMapper.insert(playerCollege);
    }

    /**
     * 删除记录
     */
    public int delete(Integer id) {
        return playerCollegeMapper.deleteById(id);
    }

    /**
     * 根据球员ID删除所有关联
     */
    public int deleteByPlayerId(Integer playerId) {
        return playerCollegeMapper.deleteByPlayerId(playerId);
    }
}
