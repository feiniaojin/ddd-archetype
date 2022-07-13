package com.feiniaojin.ddd.domain.campusjob.events;

import com.feiniaojin.ddd.DomainEvent;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreatedEvent implements DomainEvent {
    private String campusJobId;
}
