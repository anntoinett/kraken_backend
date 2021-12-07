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
        List<TeamMemberEntity> authors = membersRepository.getAllAuthorsOfPublications();
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
