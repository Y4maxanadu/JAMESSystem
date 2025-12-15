package com.james.system.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * NBA球员实体类
 * 对应数据库表: nba_players
 */
public class NbaPlayer {

    /** 球员ID，主键自增 */
    private Integer playerId;

    /** 球员姓名 */
    private String playerName;

    /** 是否入选名人堂 */
    private Boolean isHallOfFame;

    /** NBA首秀年份 */
    private Integer nbaDebutYear;

    /** NBA最后一年 */
    private Integer nbaFinalYear;

    /** 场上位置代码 */
    private String position;

    /** 身高（英尺部分） */
    private Integer heightFt;

    /** 身高（英寸部分） */
    private Integer heightIn;

    /** 体重（磅） */
    private Integer weightLbs;

    /** 出生日期 */
    private LocalDate birthDate;

    /** 创建时间 */
    private LocalDateTime createdAt;

    /** 更新时间 */
    private LocalDateTime updatedAt;

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Boolean getIsHallOfFame() {
        return isHallOfFame;
    }

    public void setIsHallOfFame(Boolean isHallOfFame) {
        this.isHallOfFame = isHallOfFame;
    }

    public Integer getNbaDebutYear() {
        return nbaDebutYear;
    }

    public void setNbaDebutYear(Integer nbaDebutYear) {
        this.nbaDebutYear = nbaDebutYear;
    }

    public Integer getNbaFinalYear() {
        return nbaFinalYear;
    }

    public void setNbaFinalYear(Integer nbaFinalYear) {
        this.nbaFinalYear = nbaFinalYear;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getHeightFt() {
        return heightFt;
    }

    public void setHeightFt(Integer heightFt) {
        this.heightFt = heightFt;
    }

    public Integer getHeightIn() {
        return heightIn;
    }

    public void setHeightIn(Integer heightIn) {
        this.heightIn = heightIn;
    }

    public Integer getWeightLbs() {
        return weightLbs;
    }

    public void setWeightLbs(Integer weightLbs) {
        this.weightLbs = weightLbs;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
