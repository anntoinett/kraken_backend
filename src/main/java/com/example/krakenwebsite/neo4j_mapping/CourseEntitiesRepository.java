package com.example.krakenwebsite.neo4j_mapping;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseEntitiesRepository extends Neo4jRepository<CourseEntity, Long> {

    @Query("MATCH (c:Course) RETURN c")
    List<CourseEntity> getAllCourses();

    @Query("MATCH (c:Course)-[:RELATED_TO]->(a:Area_of_research) WHERE id(c)=$course_id RETURN id(a) as nodeId")
    List<Integer> getAreaIdOfCourse(Integer course_id);

    @Query("match (t:Team_member)-[:TEACHES]->(c:Course) WHERE id(c)=$course_id RETURN id(t) as nodeId")
    List<Integer> getTeachersIdOfCourse(Integer course_id);
}
