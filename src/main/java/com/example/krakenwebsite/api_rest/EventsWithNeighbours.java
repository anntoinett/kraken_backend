package com.example.krakenwebsite.api_rest;

import com.example.krakenwebsite.neo4j_mapping.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EventsWithNeighbours {
    List<EventEntity> events;
    List<TeamMemberEntity> participants;
    List<AreaEntity> areas;
    List connections;
}
