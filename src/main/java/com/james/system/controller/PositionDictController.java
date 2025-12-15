package com.james.system.controller;

import com.james.system.entity.PositionDict;
import com.james.system.service.PositionDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 位置字典 Controller
 */
@RestController
@RequestMapping("/api/positions")
public class PositionDictController {

    @Autowired
    private PositionDictService positionDictService;

    /**
     * 查询所有位置
     */
    @GetMapping
    public List<PositionDict> getAll() {
        return positionDictService.getAll();
    }

    /**
     * 根据位置代码查询
     */
    @GetMapping("/{positionCode}")
    public PositionDict getByCode(@PathVariable String positionCode) {
        return positionDictService.getByCode(positionCode);
    }

    /**
     * 新增位置
     */
    @PostMapping
    public int add(@RequestBody PositionDict positionDict) {
        return positionDictService.add(positionDict);
    }

    /**
     * 更新位置
     */
    @PutMapping
    public int update(@RequestBody PositionDict positionDict) {
        return positionDictService.update(positionDict);
    }

    /**
     * 删除位置
     */
    @DeleteMapping("/{positionCode}")
    public int delete(@PathVariable String positionCode) {
        return positionDictService.delete(positionCode);
    }
}
