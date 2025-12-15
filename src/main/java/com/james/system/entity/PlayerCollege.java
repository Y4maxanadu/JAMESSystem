package com.james.system.entity;

/**
 * 球员-大学关联实体类
 * 对应数据库表: player_colleges
 * 一个球员可能就读过多所大学
 */
public class PlayerCollege {

    /** 主键ID，自增 */
    private Integer id;

    /** 球员ID，关联nba_players表 */
    private Integer playerId;

    /** 大学名称 */
    private String collegeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
