package com.oop.exam.model;

public class User {
    String username;
    String email;

    public User(String name, String email) {
        this.username = name;
        this.email = email;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
