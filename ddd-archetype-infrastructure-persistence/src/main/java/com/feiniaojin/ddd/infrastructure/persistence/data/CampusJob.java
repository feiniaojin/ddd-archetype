package com.feiniaojin.ddd.infrastructure.persistence.data;

import lombok.Data;

/**
 * 校招信息主表，校招信息的content字段是富文本，用一张扩展表存
 */
@Data
public class CampusJob {
    /**
     * 数据库表的自增主键，不用来做业务操作
     */
    private Long id;
    /**
     * 业务主键
     */
    private String campusJobId;
    /**
     * 校招信息标题
     */
    private String title;
}
