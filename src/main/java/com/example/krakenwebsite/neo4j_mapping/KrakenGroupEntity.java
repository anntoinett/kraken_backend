package com.example.krakenwebsite.neo4j_mapping;

import lombok.Getter;
import org.springframework.data.neo4j.core.schema.*;

import java.util.List;

import static org.springframework.data.neo4j.core.schema.Relationship.Direction.INCOMING;


@Node("Kraken_group")
@Getter
public class KrakenGroupEntity {
    @Id
    @Property("name")
    private final String name;
    @Property("establishment_year")
    private final String establishmentYear;
    /*
    @Property("members_count")
    private final Integer membersCount;*/
    @Relationship(type = "IS_A_MEMBER_OF", direction = INCOMING)
    private List<Role> membersAndRoles;

    public KrakenGroupEntity(String name, String establishmentYear) {
        this.name = name;
        this.establishmentYear = establishmentYear;
/*
        this.membersCount = membersCount;
*/
        //this.membersAndRoles = membersAndRoles;
    }
/*
    public String getName() {
        return name;
    }

    public String getEstablishmentYear() {
        return establishmentYear;
    }*/

/*
    public Integer getMembersCount() {
        return membersCount;
    }
*/

/*
    public List<Role> getMembersAndRoles() {
        return membersAndRoles;
    }
*/

/*    @PostMapping("/add")
    public TeamMemberEntity addAuthor(@RequestBody TeamMemberEntity teamMemberEntity) {
        return teamMemberEntityService.saveTeamMemberEntity(teamMemberEntity);
    }*/

/*
    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable String id) {
        Optional authorOpt = krakenEntitiesService.getAuthorById(Long.parseLong(id));
        if (authorOpt.isPresent()) {
            return authorOpt.get();
        }
        throw new NoSuchElementException("No author found with given id.");
    }
*/

    public void setMembersAndRoles(List<Role> membersAndRoles) {
        this.membersAndRoles = membersAndRoles;
    }
}