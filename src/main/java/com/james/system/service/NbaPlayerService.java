package com.james.system.service;

import com.james.system.entity.NbaPlayer;
import com.james.system.mapper.NbaPlayerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * NBA球员 Service
 */
@Service
public class NbaPlayerService {

    @Autowired
    private NbaPlayerMapper nbaPlayerMapper;

    /**
     * 根据ID查询球员
     */
    public NbaPlayer getById(Integer playerId) {
        return nbaPlayerMapper.selectById(playerId);
    }

    /**
     * 查询所有球员
     */
    public List<NbaPlayer> getAll() {
        return nbaPlayerMapper.selectAll();
    }

    /**
     * 根据姓名模糊查询
     */
    public List<NbaPlayer> getByName(String playerName) {
        return nbaPlayerMapper.selectByName(playerName);
    }

    /**
     * 根据位置查询
     */
    public List<NbaPlayer> getByPosition(String position) {
        return nbaPlayerMapper.selectByPosition(position);
    }

    /**
     * 查询名人堂球员
     */
    public List<NbaPlayer> getHallOfFamers() {
        return nbaPlayerMapper.selectHallOfFamers();
    }

    /**
     * 新增球员
     */
    public int add(NbaPlayer player) {
        return nbaPlayerMapper.insert(player);
    }

    /**
     * 更新球员
     */
    public int update(NbaPlayer player) {
        return nbaPlayerMapper.update(player);
    }

    /**
     * 删除球员
     */
    public int delete(Integer playerId) {
        return nbaPlayerMapper.deleteById(playerId);
    }
}
