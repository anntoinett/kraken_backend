package com.example.krakenwebsite.api_rest;


import com.example.krakenwebsite.api_rest.KrakenEntitiesService;
import com.example.krakenwebsite.api_rest.PublicationsWithNeighbours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/kraken")
public class KrakenEntitiesController {

    @Autowired
    private KrakenEntitiesService krakenEntitiesService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/teamMembers")
    public Collection getAllMembers() {
        return krakenEntitiesService.getAllMembers();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/publications")
    public PublicationsWithNeighbours getAllPublications() {
        return krakenEntitiesService.getAllPublicationsWithData();
    }

//    @GetMapping("/findAll")
//    public Collection findAllMembers() {
//        return krakenEntitiesService.findAll();
//    }
//
//    @GetMapping("/getCount")
//    public Long getCountOfMembers() {
//        return krakenEntitiesService.getCountOfMembers();
//    }
}
