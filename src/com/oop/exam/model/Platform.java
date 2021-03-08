package com.oop.exam.model;

public class Platform {
    String name;
    String url;

    public Platform(String platform, String url) {
        this.name = platform;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
