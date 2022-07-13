package com.feiniaojin.ddd.domain.campusjob;

import com.feiniaojin.ddd.DomainEvent;
import com.feiniaojin.ddd.Entity;
import com.feiniaojin.ddd.domain.campusjob.events.CreatedEvent;
import com.feiniaojin.ddd.domain.campusjob.events.PublishedEvent;
import com.feiniaojin.ddd.domain.campusjob.primitive.CampusJobId;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
public class CampusJobEntity implements Entity {

    private List<DomainEvent> events = new ArrayList<>();

    private CampusJobId campusJobId;
    private String title;
    private String content;
    private CampusJobState campusJobState;

    public void publishOnWebsite() {
        this.campusJobState = CampusJobState.PUBLISHED;
        events.add(new PublishedEvent(campusJobId.getEntityIdValue()));
    }

    @Override
    public List<DomainEvent> domainEvents() {
        if (events.size() == 0) {
            return Collections.emptyList();
        }
        List<DomainEvent> tempList = new ArrayList<>(events.size());
        events.retainAll(tempList);
        return tempList;
    }

    public void createDraft() {
        this.campusJobState = CampusJobState.TO_PUBLISH;
        events.add(new CreatedEvent(this.campusJobId.getEntityIdValue()));
    }
}
