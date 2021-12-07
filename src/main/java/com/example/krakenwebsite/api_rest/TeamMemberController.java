package com.example.krakenwebsite.api_rest;

import com.example.krakenwebsite.neo4j_mapping.TeamMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//**API LAYER**
@RestController
@RequestMapping(path = "/api/v1/teamMember")
public class TeamMemberController {
    private final TeamMemberService teamMemberService;

    @GetMapping
    public List<TeamMember> getTeamMembers(){
        return teamMemberService.getTeamMembers();
    }

    @Autowired
    public TeamMemberController(TeamMemberService teamMemberService) {
        this.teamMemberService = teamMemberService;
    }
}
