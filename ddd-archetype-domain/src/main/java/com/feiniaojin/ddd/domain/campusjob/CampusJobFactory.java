package com.feiniaojin.ddd.domain.campusjob;

public interface CampusJobFactory {
    CampusJobEntity newInstance(String title, String content);
}
