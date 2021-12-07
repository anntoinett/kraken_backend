package com.example.krakenwebsite.neo4j_mapping;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

import java.util.List;

@RelationshipProperties
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    private final List<String> roles;

    @TargetNode
    private final TeamMemberEntity teamMember;

    public Role(TeamMemberEntity teamMember, List<String> roles) {
        this.teamMember = teamMember;
        this.roles = roles;
    }

    public List<String> getRoles() {
        return roles;
    }
}