package com.james.system.service;

import com.james.system.entity.PositionDict;
import com.james.system.mapper.PositionDictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 位置字典 Service
 */
@Service
public class PositionDictService {

    @Autowired
    private PositionDictMapper positionDictMapper;

    /**
     * 根据位置代码查询
     */
    public PositionDict getByCode(String positionCode) {
        return positionDictMapper.selectByCode(positionCode);
    }

    /**
     * 查询所有位置
     */
    public List<PositionDict> getAll() {
        return positionDictMapper.selectAll();
    }

    /**
     * 新增位置
     */
    public int add(PositionDict positionDict) {
        return positionDictMapper.insert(positionDict);
    }

    /**
     * 更新位置
     */
    public int update(PositionDict positionDict) {
        return positionDictMapper.update(positionDict);
    }

    /**
     * 删除位置
     */
    public int delete(String positionCode) {
        return positionDictMapper.deleteByCode(positionCode);
    }
}
