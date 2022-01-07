package com.example.krakenwebsite.neo4j_mapping;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TeamMemberEntitiesRepository extends Neo4jRepository<TeamMemberEntity, Long> {

    @Query("MATCH (tm:Team_member)-[m:IS_A_MEMBER_OF]->(k:Kraken_group) RETURN tm")
    List<TeamMemberEntity> getAllTeamMembers();

    @Query("MATCH (tm:Team_member)-[:IS_COAUTHOR_OF]->(n:Publication) RETURN DISTINCT tm")
    List<TeamMemberEntity> getAllPublicationsAuthors();

    @Query("MATCH (tm:Team_member)-[:CONTRIBUTED_TO]->(n:Project) RETURN DISTINCT tm")
    List<TeamMemberEntity> getAllProjectsContributors();

    @Query("MATCH (tm:Team_member)-[:TEACHES]->(n:Course) RETURN DISTINCT tm")
    List<TeamMemberEntity> getAllCoursesTeachers();

    @Query("MATCH (tm:Team_member)-[:TOOK_PART_IN]->(n:Event) RETURN DISTINCT tm")
    List<TeamMemberEntity> getAllEventsParticipants();

//    @Query("match (t:Team_member)-[:IS_COAUTHOR_OF]->(n:Publication{label: $pub_label}) return t.id")
//    List<Integer> getAuthorsOfPub(String pub_label);

    @Override
    List<TeamMemberEntity> findAll();
}
