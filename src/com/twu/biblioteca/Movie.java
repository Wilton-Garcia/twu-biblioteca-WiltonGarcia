package com.twu.biblioteca;

public class Movie extends LibraryItem {

    private String director;
    private short rating;

    public Movie(String name, int year, String director, short rating) {
        super(name, year);
        this.director = director;
        this.rating = rating;
    }
}
