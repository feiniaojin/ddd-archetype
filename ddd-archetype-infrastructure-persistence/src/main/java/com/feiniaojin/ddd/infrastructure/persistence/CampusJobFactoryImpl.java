package com.feiniaojin.ddd.infrastructure.persistence;

import com.feiniaojin.ddd.Entity;
import com.feiniaojin.ddd.EntityId;
import com.feiniaojin.ddd.domain.campusjob.CampusJobEntity;
import com.feiniaojin.ddd.domain.campusjob.CampusJobRepository;

public class CampusJobFactoryImpl implements CampusJobRepository {


    @Override
    public CampusJobEntity load(EntityId<String> entityId) {
        return null;
    }

    @Override
    public void save(Entity entity) {

    }
}
