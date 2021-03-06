package com.example.krakenwebsite.neo4j_mapping;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AreaEntitiesRepository extends Neo4jRepository<AreaEntity, Long> {

    @Query("match (m:Area_of_research)<-[:RELATED_TO]-(p:Publication) return distinct m")
    List<AreaEntity> getAllAreasOfPublications();

    @Query("match (m:Area_of_research)<-[:RELATED_TO]-(p:Project) return distinct m")
    List<AreaEntity> getAllAreasOfProjects();

    @Query("match (m:Area_of_research)<-[:RELATED_TO]-(p:Course) return distinct m")
    List<AreaEntity> getAllAreasOfCourses();

    @Query("match (m:Area_of_research)<-[:RELATED_TO]-(p:Event) return distinct m")
    List<AreaEntity> getAllAreasOfEvents();

    @Query("match (m:Area_of_research{label: $area_label}) return m")
    List<AreaEntity> getArea(String area_label);

    @Query("match (m:Area_of_research)<-[:RELATED_TO]-(p:Publication {label: $pub_label}) return m")
    List<AreaEntity> getAreaForPub(String pub_label);
//getAreaForPub
}
