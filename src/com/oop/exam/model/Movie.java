package com.oop.exam.model;

import java.util.LinkedList;
import java.util.List;

public class Movie {
    String title;
    int year;
    private List<String> actors;
    String Synopsis;
    String director;
    private List<Platform> platforms;
    private List<Review> reviews;

    public Movie(String tittle, int year, String director) {
        this.title = tittle;
        this.year = year;
        this.director = director;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void Platform() {
        this.platforms = new LinkedList<>();
        this.actors = new List<>();
        this.reviews = new List<>();
    }

    public String getSynopsis() {
        return Synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.Synopsis = synopsis;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public void setPlatforms(List<Platform> platforms) {
        this.platforms = platforms;
    }

    public List<Platform> getPlatforms() {
        return platforms;
    }

    public void addReview(Review review){
        reviews.add(review);
    }

    public List<Review> getReviews() {
        return reviews;
    }
}





