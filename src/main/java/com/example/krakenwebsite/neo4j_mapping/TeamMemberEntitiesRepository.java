package com.example.krakenwebsite.neo4j_mapping;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamMemberEntitiesRepository extends Neo4jRepository<TeamMemberEntity, Long> {

    @Query("MATCH (tm:Team_member)-[m:IS_A_MEMBER_OF]->(k:Kraken_group) RETURN tm,m,k")
    List<TeamMemberEntity> getAllTeamMembers();

//    @Query("match (t:Team_member)-[:IS_COAUTHOR_OF]->(n:Publication{label: $pub_label}) return t.id")
//    List<Integer> getAuthorsOfPub(String pub_label);

    @Query("match (t:Team_member)-[:IS_COAUTHOR_OF]->(n:Publication) return t")
    List<TeamMemberEntity> getAllAuthorsOfPublications();

    @Override
    List<TeamMemberEntity> findAll();
}
