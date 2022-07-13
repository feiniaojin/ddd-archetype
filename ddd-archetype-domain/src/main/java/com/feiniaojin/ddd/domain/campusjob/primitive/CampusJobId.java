package com.feiniaojin.ddd.domain.campusjob.primitive;

import com.feiniaojin.ddd.EntityId;

import java.util.Objects;

public class CampusJobId implements EntityId<String> {

    private final String value;

    public CampusJobId(String value) {
        Objects.requireNonNull(value, "CampusJobId构造方法不允许传入空值");
        this.value = value;
    }

    @Override
    public String getEntityIdValue() {

        return this.value;
    }
}
