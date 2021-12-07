package com.example.krakenwebsite.api_rest;

import com.example.krakenwebsite.neo4j_mapping.AreaEntity;
import com.example.krakenwebsite.neo4j_mapping.PublicationEntity;
import com.example.krakenwebsite.neo4j_mapping.TeamMemberEntity;

import java.util.List;

public class PublicationsWithNeighbours{
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
    PublicationsWithNeighbours(){};
}
