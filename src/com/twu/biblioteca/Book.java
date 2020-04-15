package com.twu.biblioteca;

public class Book {

    private int id;
    private String name;
    private String author;
    private int publicationYear;
    private boolean checkout;

    public int getId() {return  id;}

    public void setId(int id) { this.id = id;}

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isCheckout() {
        return checkout;
    }
    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }
    public Book(String name,String author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
        this.checkout = false;
    }
}
