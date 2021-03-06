package com.example.krakenwebsite.api_rest;

import com.example.krakenwebsite.neo4j_mapping.AreaEntity;
import com.example.krakenwebsite.neo4j_mapping.ProjectEntity;
import com.example.krakenwebsite.neo4j_mapping.PublicationEntity;
import com.example.krakenwebsite.neo4j_mapping.TeamMemberEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PublicationsWithNeighbours {
    List<PublicationEntity> publications;
    List<TeamMemberEntity> coauthors;
    List<AreaEntity> areas;
    List connections;
}
/*
    List<PublicationEntity> pubs;
    List<TeamMemberEntity> coauthors;
    List<AreaEntity> areas;
    List connections;

    public List<PublicationEntity> getPubs() {
        return pubs;
    }

    public void setPubs(List<PublicationEntity> pubs) {
        this.pubs = pubs;
    }

    public List<TeamMemberEntity> getCoauthors() {
        return coauthors;
    }

    public void setCoauthors(List<TeamMemberEntity> coauthors) {
        this.coauthors = coauthors;
    }

    public List<AreaEntity> getAreas() {
        return areas;
    }

    public void setAreas(List<AreaEntity> areas) {
        this.areas = areas;
    }

    public List getConnections() {
        return connections;
    }

    public void setConnections(List connections) {
        this.connections = connections;
    }

    PublicationsWithNeighbours(List<PublicationEntity> pubs, List<TeamMemberEntity> coauthors, List<AreaEntity> areas, List connections){
        this.pubs = pubs;
        this.coauthors = coauthors;
        this.areas = areas;
        this.connections = connections;
    }
    PublicationsWithNeighbours(){};*/
