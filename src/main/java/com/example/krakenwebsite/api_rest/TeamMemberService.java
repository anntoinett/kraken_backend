package com.example.krakenwebsite.api_rest;

import com.example.krakenwebsite.neo4j_mapping.TeamMember;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//**SERVICE LAYER**
@Service // is component also
public class TeamMemberService {

    public List<TeamMember> getTeamMembers(){
        return List.of(
                new TeamMember(0L, "Antonia", "Pękala", "antonia123@gmail.com", "engineer", LocalDate.of(2020, Month.APRIL, 5))
        );
    }
}
