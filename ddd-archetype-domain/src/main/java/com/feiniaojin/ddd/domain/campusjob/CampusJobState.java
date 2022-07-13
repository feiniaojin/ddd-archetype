package com.feiniaojin.ddd.domain.campusjob;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CampusJobState {
    TO_PUBLISH(1, "待发布"),
    PUBLISHED(2, "已发布"),
    ;
    private final Integer code;
    private final String msg;
}
