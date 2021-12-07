package com.example.krakenwebsite.neo4j_mapping;

import java.time.LocalDate;

public class TeamMember {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String title;
    private LocalDate join_date;

    public TeamMember(Long id, String name, String surname, String email, String title, LocalDate join_date) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.title = title;
        this.join_date = join_date;
    }

    public TeamMember() {
    }

    public TeamMember(String name, String surname, String email, String title, LocalDate join_date) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.title = title;
        this.join_date = join_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getJoin_date() {
        return join_date;
    }

    public void setJoin_date(LocalDate join_date) {
        this.join_date = join_date;
    }

    @Override
    public String toString() {
        return "TeamMember{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", title='" + title + '\'' +
                ", join_date=" + join_date +
                '}';
    }
}
