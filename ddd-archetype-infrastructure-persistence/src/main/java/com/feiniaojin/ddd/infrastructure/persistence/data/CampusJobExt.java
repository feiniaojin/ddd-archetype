package com.feiniaojin.ddd.infrastructure.persistence.data;

import lombok.Data;

/**
 * 校招信息扩展表，校招信息的content字段是富文本，用一张扩展表存
 */
@Data
public class CampusJobExt {

    /**
     * 数据库表的自增主键
     */
    private Long id;

    /**
     * 校招信息的唯一主键
     */
    private String campusJobId;

    /**
     * 校招信息的内容
     */
    private String content;
}
