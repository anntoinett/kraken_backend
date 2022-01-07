package com.example.krakenwebsite.neo4j_mapping;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventEntitiesRepository extends Neo4jRepository<EventEntity, Long> {

    @Query("MATCH (e:Event) RETURN e")
    List<EventEntity> getAllEvents();

    @Query("MATCH (e:Event)-[:RELATED_TO]->(a:Area_of_research) WHERE id(e)=$event_id RETURN id(a) as nodeId")
    List<Integer> getAreaIdOfEvent(Integer event_id);

    @Query("match (t:Team_member)-[:TOOK_PART_IN]->(e:Event) WHERE id(e)=$event_id RETURN id(t) as nodeId")
    List<Integer> getParticipantsIdOfEvent(Integer event_id);
}
