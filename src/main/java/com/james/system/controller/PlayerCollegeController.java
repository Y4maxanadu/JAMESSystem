package com.james.system.controller;

import com.james.system.entity.PlayerCollege;
import com.james.system.service.PlayerCollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 球员-大学关联 Controller
 */
@RestController
@RequestMapping("/api/player-colleges")
public class PlayerCollegeController {

    @Autowired
    private PlayerCollegeService playerCollegeService;

    /**
     * 根据球员ID查询其大学
     */
    @GetMapping("/player/{playerId}")
    public List<PlayerCollege> getByPlayerId(@PathVariable Integer playerId) {
        return playerCollegeService.getByPlayerId(playerId);
    }

    /**
     * 根据大学名称查询球员
     */
    @GetMapping("/college")
    public List<PlayerCollege> getByCollegeName(@RequestParam String collegeName) {
        return playerCollegeService.getByCollegeName(collegeName);
    }

    /**
     * 新增记录
     */
    @PostMapping
    public int add(@RequestBody PlayerCollege playerCollege) {
        return playerCollegeService.add(playerCollege);
    }

    /**
     * 删除记录
     */
    @DeleteMapping("/{id}")
    public int delete(@PathVariable Integer id) {
        return playerCollegeService.delete(id);
    }
}
