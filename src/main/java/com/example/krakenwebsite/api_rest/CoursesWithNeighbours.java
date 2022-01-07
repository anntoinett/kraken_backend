package com.example.krakenwebsite.api_rest;

import com.example.krakenwebsite.neo4j_mapping.AreaEntity;
import com.example.krakenwebsite.neo4j_mapping.CourseEntity;
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
public class CoursesWithNeighbours {
    List<CourseEntity> courses;
    List<TeamMemberEntity> coteachers;
    List<AreaEntity> areas;
    List connections;
}
 /*public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setPubs(List<CourseEntity> pubs) {
        this.courses = pubs;
    }

    public List<TeamMemberEntity> getCoauthors() {
        return coteachers;
    }

    public void setCoauthors(List<TeamMemberEntity> coteachers) {
        this.coteachers = coteachers;
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

    CoursesWithNeighbours(List<CourseEntity> courses, List<TeamMemberEntity> coteachers, List<AreaEntity> areas, List connections){
        this.courses = courses;
        this.coteachers = coteachers;
        this.areas = areas;
        this.connections = connections;
    }
    CoursesWithNeighbours(){};*/