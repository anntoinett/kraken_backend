package com.example.krakenwebsite.neo4j_mapping;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectEntitiesRepository extends Neo4jRepository<ProjectEntity, Long> {

    @Query("MATCH (p:Project) RETURN p")
    List<ProjectEntity> getAllProjects();

    @Query("MATCH (p:Project)-[:RELATED_TO]->(a:Area_of_research) WHERE id(p)=$project_id RETURN id(a) as nodeId")
    List<Integer> getAreaIdOfProject(Integer project_id);

    @Query("match (t:Team_member)-[:CONTRIBUTED_TO]->(p:Project) WHERE id(p)=$project_id RETURN id(t) as nodeId")
    List<Integer> getContributorsIdOfProject(Integer project_id);
}
