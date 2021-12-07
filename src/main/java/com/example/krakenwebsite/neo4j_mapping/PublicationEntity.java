package com.example.krakenwebsite.neo4j_mapping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node("Publication")
@AllArgsConstructor
@Getter
public class PublicationEntity {
    @Id
    @GeneratedValue
    private final Long id;
    @Property("name")
    private final String name;
    @Property("year")
    private final String year;
    @Property("description")
    private final String description;
    @Property("label")
    private final String label;
    @Property("link")
    private final String link;
    /*@Relationship(type = "IS_A_MEMBER_OF", direction = OUTGOING)
    private Set<KrakenGroupEntity> krakenGroup= new HashSet<>();*/

}
