package com.example.krakenwebsite.neo4j_mapping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.neo4j.core.schema.*;

@Node("Team_member")
@AllArgsConstructor
@Getter
public class TeamMemberEntity {
    @Id
    @GeneratedValue
    private final Long id;
    @Property("name")
    private final String name;
    @Property("academic_title")
    private final String academic_title;
    @Property("description")
    private final String description;
    @Property("photo_file")
    private final String photo_file;
    /*@Relationship(type = "IS_A_MEMBER_OF", direction = OUTGOING)
    private Set<KrakenGroupEntity> krakenGroup= new HashSet<>();*/

}
