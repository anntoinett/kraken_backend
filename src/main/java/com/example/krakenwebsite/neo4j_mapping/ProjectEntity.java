package com.example.krakenwebsite.neo4j_mapping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node("Project")
@AllArgsConstructor
@Getter
public class ProjectEntity {
    @Id
    @GeneratedValue
    private final Long id;
    @Property("name")
    private final String name;
    @Property("year")
    private final String year;
    @Property("description")
    private final String description;;
    @Property("link")
    private final String link;
}
