package com.oop.exam.model;

public class Review {
    User user = new User();
    MovieScore score = new MovieScore();
    String review;

    public Review(User name, MovieScore score, String review) {
        this.user = name;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MovieScore getScore() {
        return score;
    }

    public void setScore(MovieScore score) {
        this.score = score;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
