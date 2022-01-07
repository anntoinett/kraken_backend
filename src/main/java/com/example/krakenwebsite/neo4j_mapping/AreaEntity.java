package com.example.krakenwebsite.neo4j_mapping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

@Node("Area_of_research")
@AllArgsConstructor
@Getter
public class AreaEntity {
    @Id
    @GeneratedValue
    private final Long id;
    @Property("name")
    private final String name;
    @Property("description")
    private final String description;
    /*@Relationship(type = "IS_A_MEMBER_OF", direction = OUTGOING)
    private Set<KrakenGroupEntity> krakenGroup= new HashSet<>();*/

}
