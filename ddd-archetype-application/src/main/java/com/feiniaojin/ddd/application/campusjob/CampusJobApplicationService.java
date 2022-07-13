package com.feiniaojin.ddd.application.campusjob;

import com.feiniaojin.ddd.application.campusjob.dto.CampusJobCreateCmd;
import com.feiniaojin.ddd.application.campusjob.dto.CampusJobPublishCmd;
import com.feiniaojin.ddd.domain.campusjob.CampusJobDomainEventPublisher;
import com.feiniaojin.ddd.domain.campusjob.CampusJobEntity;
import com.feiniaojin.ddd.domain.campusjob.CampusJobFactory;
import com.feiniaojin.ddd.domain.campusjob.CampusJobRepository;
import com.feiniaojin.ddd.domain.campusjob.primitive.CampusJobId;

import javax.annotation.Resource;

public class CampusJobApplicationService {

    @Resource
    private CampusJobFactory factory;

    @Resource
    private CampusJobRepository repository;

    @Resource
    private CampusJobDomainEventPublisher eventPublisher;

    /**
     * 创建校招信息的草稿
     *
     * @param cmd
     */
    public void createDraft(CampusJobCreateCmd cmd) {

        CampusJobEntity campusJobEntity = factory.newInstance(cmd.getTitle(), cmd.getContent());

        campusJobEntity.createDraft();

        repository.save(campusJobEntity);

        eventPublisher.publish(campusJobEntity.domainEvents());
    }

    /**
     * 将校招信息发布到就业信息办网站
     *
     * @param cmd
     */
    public void publishOnWebsite(CampusJobPublishCmd cmd) {
        CampusJobEntity campusJobEntity = repository.load(new CampusJobId(cmd.getCampusJobId()));
        campusJobEntity.publishOnWebsite();
        eventPublisher.publish(campusJobEntity.domainEvents());
    }


}
