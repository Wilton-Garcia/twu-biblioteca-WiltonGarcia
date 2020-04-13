package com.twu.biblioteca;

public class Book {
    private String Name;
    private String Author;
    private int PublicationYear;

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public Book(String name,String author, int publicationYear) {
        Name = name;
    }
}
