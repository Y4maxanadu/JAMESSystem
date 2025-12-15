package com.james.system.entity;

/**
 * 位置字典实体类
 * 对应数据库表: position_dict
 * 存储球员场上位置的代码、名称和描述
 */
public class PositionDict {

    /** 位置代码，主键（如: PG, SG, SF, PF, C） */
    private String positionCode;

    /** 位置名称（如: 控球后卫, 得分后卫） */
    private String positionName;

    /** 位置描述 */
    private String positionDesc;

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionDesc() {
        return positionDesc;
    }

    public void setPositionDesc(String positionDesc) {
        this.positionDesc = positionDesc;
    }
}
