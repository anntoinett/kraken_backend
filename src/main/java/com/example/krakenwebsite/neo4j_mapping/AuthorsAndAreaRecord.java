package com.example.krakenwebsite.neo4j_mapping;

import java.util.List;

class AuthorsAndAreaRecord {
    List<String> coauthors;
    List<String> area;

    public List<String> getCoauthors() {
        return coauthors;
    }

    public void setCoauthors(List<String> coauthors) {
        this.coauthors = coauthors;
    }

    public List<String> getArea() {
        return area;
    }

    public void setArea(List<String> area) {
        this.area = area;
    }

    AuthorsAndAreaRecord(List<String> coauthors, List<String> area){
        this.coauthors = coauthors;
        this.area = area;
    }
    AuthorsAndAreaRecord(){};
}
