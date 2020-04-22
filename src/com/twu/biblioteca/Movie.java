package com.twu.biblioteca;

public class Movie {

    private int id;
    private boolean checkout;

    private String name;
    private String director;
    private int year;
    private int rating;

    public int getId() {
        return id;
    }

    public boolean isCheckout() {
        return checkout;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public int getRating() {
        return rating;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }

    public Movie(String name, String director, int year, int rating) {

        checkout = false;

        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}
