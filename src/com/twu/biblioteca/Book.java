package com.twu.biblioteca;

public class Book {

    private String Name;
    private String Author;
    private int PublicationYear;

    public String getName() {
        return Name;
    }

    public String getAuthor() {
        return Author;
    }

    public int getPublicationYear() {
        return PublicationYear;
    }


    public Book(String name,String author, int publicationYear) {
        Name = name;
        Author = author;
        PublicationYear = publicationYear;
    }
}
