package com.james.system.controller;

import com.james.system.entity.NbaPlayer;
import com.james.system.service.NbaPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * NBA球员 Controller
 */
@RestController
@RequestMapping("/api/players")
public class NbaPlayerController {

    @Autowired
    private NbaPlayerService nbaPlayerService;

    /**
     * 查询所有球员
     */
    @GetMapping
    public List<NbaPlayer> getAll() {
        return nbaPlayerService.getAll();
    }

    /**
     * 根据ID查询球员
     */
    @GetMapping("/{playerId}")
    public NbaPlayer getById(@PathVariable Integer playerId) {
        return nbaPlayerService.getById(playerId);
    }

    /**
     * 根据姓名模糊查询
     */
    @GetMapping("/search")
    public List<NbaPlayer> getByName(@RequestParam String name) {
        return nbaPlayerService.getByName(name);
    }

    /**
     * 根据位置查询
     */
    @GetMapping("/position/{position}")
    public List<NbaPlayer> getByPosition(@PathVariable String position) {
        return nbaPlayerService.getByPosition(position);
    }

    /**
     * 查询名人堂球员
     */
    @GetMapping("/hall-of-fame")
    public List<NbaPlayer> getHallOfFamers() {
        return nbaPlayerService.getHallOfFamers();
    }

    /**
     * 新增球员
     */
    @PostMapping
    public int add(@RequestBody NbaPlayer player) {
        return nbaPlayerService.add(player);
    }

    /**
     * 更新球员
     */
    @PutMapping
    public int update(@RequestBody NbaPlayer player) {
        return nbaPlayerService.update(player);
    }

    /**
     * 删除球员
     */
    @DeleteMapping("/{playerId}")
    public int delete(@PathVariable Integer playerId) {
        return nbaPlayerService.delete(playerId);
    }
}
