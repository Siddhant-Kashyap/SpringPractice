package com.example.demo.Entity;

public class User {
    private Long id ;
    private String name;
    private String role;
    private String story;

    public User(Long id, String name, String role, String story) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.story = story;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }
}
