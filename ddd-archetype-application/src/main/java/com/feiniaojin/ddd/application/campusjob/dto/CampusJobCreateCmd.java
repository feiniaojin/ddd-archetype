package com.feiniaojin.ddd.application.campusjob.dto;

import lombok.Data;

@Data
public class CampusJobCreateCmd {
    private String title;
    private String content;
}
