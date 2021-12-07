package com.example.krakenwebsite.neo4j_mapping;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicationEntitiesRepository extends Neo4jRepository<PublicationEntity, Long> {

/*    @Query("match (t:Team_member)-[:IS_COAUTHOR_OF]->(n:Publication{label: $pub_label})-[:RELATED_TO]->(m:Area_of_research) return collect(t.name) as coauthors,collect(m.label) as area")
    Collection<AuthorsAndAreaRecord> getAuthorsAndArea(String pub_label);*/
//
//// in PersonRepository
//    @Query("MATCH (starter:Person {userId: {0}})<-[r:WORKS_FOR]-(n:Person) OPTIONAL MATCH (n)<-[q:WORKS_FOR]-(p:Person) RETURN n as person, count(q) as reporteeCount")
//    Collection<PersonWithHash> findBy...(String userId);
    @Query("MATCH (p:Publication) RETURN p")
    List<PublicationEntity> getAllPublications();

    @Query("MATCH (p:Publication)-[:RELATED_TO]->(a:Area_of_research) WHERE id(p)=$pub_id RETURN id(a) as nodeId")
    List<Integer> getAreaIdOfPublication(Integer pub_id);

    @Query("match (t:Team_member)-[:IS_COAUTHOR_OF]->(p:Publication) WHERE id(p)=$pub_id RETURN id(t) as nodeId")
    List<Integer> getAuthorsIdOfPublication(Integer pub_id);
}
