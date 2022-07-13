package com.feiniaojin.ddd.application.campusjob;

import com.feiniaojin.ddd.domain.campusjob.CampusJobEntity;
import com.feiniaojin.ddd.domain.campusjob.CampusJobFactory;
import com.feiniaojin.ddd.domain.campusjob.primitive.CampusJobId;

import java.util.UUID;

public class CampusJobFactoryImpl implements CampusJobFactory {

    @Override
    public CampusJobEntity newInstance(String title, String content) {
        CampusJobEntity jobEntity = new CampusJobEntity();
        jobEntity.setTitle(title);
        jobEntity.setContent(content);
        jobEntity.setCampusJobId(new CampusJobId(generateId()));
        return jobEntity;
    }

    /**
     * 生成唯一ID，未来在这个地方替换成基础设施的ID服务
     *
     * @return
     */
    private String generateId() {
        return UUID.randomUUID().toString();
    }
}
