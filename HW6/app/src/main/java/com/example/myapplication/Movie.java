package com.example.myapplication;

public class Movie {
    String title ;
    String mainActor;
    String genre ;
    Double movieRate;
    Integer pgrate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getMovieRate() {
        return movieRate;
    }

    public void setMovieRate(Double movieRate) {
        this.movieRate = movieRate;
    }

    public Integer getPgrate() {
        return pgrate;
    }

    public void setPgrate(Integer pgrate) {
        this.pgrate = pgrate;
    }

}
