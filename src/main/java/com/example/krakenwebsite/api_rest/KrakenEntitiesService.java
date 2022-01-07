package com.example.krakenwebsite.api_rest;

import com.example.krakenwebsite.neo4j_mapping.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KrakenEntitiesService {

    @Autowired
    private TeamMemberEntitiesRepository membersRepository;
    @Autowired
    private PublicationEntitiesRepository publicationsRepository;
    @Autowired
    private ProjectEntitiesRepository projectsRepository;
    @Autowired
    private CourseEntitiesRepository coursesRepository;
    @Autowired
    private EventEntitiesRepository eventsRepository;
    @Autowired
    private AreaEntitiesRepository areaEntitiesRepository;

    public List getAllMembers() {
        return membersRepository.getAllTeamMembers();
    }
//    public Collection getAllPublications() {
//        Collection<PublicationWithNeighbours> publications = publicationsRepository.getAllPublications();
//        System.out.println(publications);
//
//        return publications;
//    }

    public PublicationsWithNeighbours getAllPublicationsWithData(){
        List<PublicationEntity> pubs = publicationsRepository.getAllPublications();
        List<AreaEntity> areas = areaEntitiesRepository.getAllAreasOfPublications();
        List<TeamMemberEntity> authors = membersRepository.getAllPublicationsAuthors();
        List<String> connections = new ArrayList();

        for (PublicationEntity pub: pubs) {
            List<Integer> coauthors = publicationsRepository.getAuthorsIdOfPublication(Integer.parseInt(pub.getId().toString()));
            List<Integer> area = publicationsRepository.getAreaIdOfPublication(Integer.parseInt(pub.getId().toString()));
            for(Integer authorId: coauthors){
                connections.add(String.format("{from: %s,to: %s}", authorId.toString(), pub.getId().toString()));
            }
            for(Integer areaId: area){
                connections.add(String.format("{from: %s,to: %s}", pub.getId().toString(), areaId.toString()));
            }
            //result.add(new PublicationWithNeighbours(pub,coauthors,areaOfResearch));
        }
        return new PublicationsWithNeighbours(pubs, authors, areas, connections);
    }

    public List findAll() {
        return membersRepository.findAll();
    }
    public Long getCountOfMembers() {return membersRepository.count();}

    public ProjectsWithNeighbours getAllProjectsWithData() {
        List<ProjectEntity> projects = projectsRepository.getAllProjects();
        List<AreaEntity> areas = areaEntitiesRepository.getAllAreasOfProjects();
        List<TeamMemberEntity> contributors = membersRepository.getAllProjectsContributors();
        List<String> connections = new ArrayList();

        for (ProjectEntity project: projects) {
            List<Integer> authors = projectsRepository.getContributorsIdOfProject(Integer.parseInt(project.getId().toString()));
            List<Integer> area = projectsRepository.getAreaIdOfProject(Integer.parseInt(project.getId().toString()));
            for(Integer authorId: authors){
                connections.add(String.format("{from: %s,to: %s}", authorId.toString(), project.getId().toString()));
            }
            for(Integer areaId: area){
                connections.add(String.format("{from: %s,to: %s}", project.getId().toString(), areaId.toString()));
            }
            //result.add(new PublicationWithNeighbours(pub,coauthors,areaOfResearch));
        }
        return new ProjectsWithNeighbours(projects, contributors, areas, connections);
    }

    public CoursesWithNeighbours getAllCoursesWithData() {
        List<CourseEntity> courses = coursesRepository.getAllCourses();
        List<AreaEntity> areas = areaEntitiesRepository.getAllAreasOfCourses();
        List<TeamMemberEntity> teachers = membersRepository.getAllCoursesTeachers();
        List<String> connections = new ArrayList();

        for (CourseEntity course: courses) {
            List<Integer> authors = coursesRepository.getTeachersIdOfCourse(Integer.parseInt(course.getId().toString()));
            List<Integer> area = coursesRepository.getAreaIdOfCourse(Integer.parseInt(course.getId().toString()));
            for(Integer authorId: authors){
                connections.add(String.format("{from: %s,to: %s}", authorId.toString(), course.getId().toString()));
            }
            for(Integer areaId: area){
                connections.add(String.format("{from: %s,to: %s}", course.getId().toString(), areaId.toString()));
            }
            //result.add(new PublicationWithNeighbours(pub,coauthors,areaOfResearch));
        }
        return new CoursesWithNeighbours(courses, teachers, areas, connections);
    }

    public EventsWithNeighbours getAllEventsWithData() {
        List<EventEntity> events = eventsRepository.getAllEvents();
        List<AreaEntity> areas = areaEntitiesRepository.getAllAreasOfEvents();
        List<TeamMemberEntity> participants = membersRepository.getAllEventsParticipants();
        List<String> connections = new ArrayList();

        for (EventEntity event: events) {
            List<Integer> authors = eventsRepository.getParticipantsIdOfEvent(Integer.parseInt(event.getId().toString()));
            List<Integer> area = eventsRepository.getAreaIdOfEvent(Integer.parseInt(event.getId().toString()));
            for(Integer authorId: authors){
                connections.add(String.format("{from: %s,to: %s}", authorId.toString(), event.getId().toString()));
            }
            for(Integer areaId: area){
                connections.add(String.format("{from: %s,to: %s}", event.getId().toString(), areaId.toString()));
            }
            //result.add(new PublicationWithNeighbours(pub,coauthors,areaOfResearch));
        }
        return new EventsWithNeighbours(events, participants, areas, connections);
    }


/*    public TeamMemberEntity saveTeamMemberEntity(TeamMemberEntity teamMemberEntity) {
        return membersRepository.save(teamMemberEntity);
    }*/

/*    public Optional<Author> getAuthorById(Long id) {
        return membersRepository.findById(id);
    }

    public void deleteAuthor(Long id) {
        membersRepository.deleteById(id);
    }
    public void deleteAllAuthors() {
        membersRepository.deleteAll();
    }*/



}
