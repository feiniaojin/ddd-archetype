package com.feiniaojin.ddd.infrastructure.publisher;

import com.feiniaojin.ddd.DomainEvent;
import com.feiniaojin.ddd.domain.campusjob.CampusJobDomainEventPublisher;

import java.util.List;

public class CampusJobDomainEventPublisherImpl implements CampusJobDomainEventPublisher {

    @Override
    public void publish(List<DomainEvent> list) {
        if (list.isEmpty()) {
            return;
        }
        //TODO 调用中间件客户端发布领域事件
    }
}
