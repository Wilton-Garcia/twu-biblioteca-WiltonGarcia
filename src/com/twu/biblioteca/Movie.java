package com.twu.biblioteca;

public class Movie implements IMedia {

    private int id;
    private boolean checkout;

    private String name;
    private String director;
    private int year;
    private int rating;

    public int getId() {
        return id;
    }

    @Override
    public boolean isCheckout() {
        return checkout;
    }

    @Override
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

    @Override
    public String toString() {
        Printer printer = new Printer();
        return getId()
                + "|" + printer.completeStringWithSpaceUntilLenghtIs50(getName())
                + "|" + printer.completeStringWithSpaceUntilLenghtIs50(getDirector())
                + "|" + getYear()
                + "|" + getRating()
                + "\n";
    }

    public Movie(String name, String director, int year, int rating) {

        checkout = false;

        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}
