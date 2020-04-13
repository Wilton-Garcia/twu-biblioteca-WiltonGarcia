package com.twu.biblioteca;

public class Book {

    private String Name;
    private String Author;
    private int PublicationYear;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getPublicationYear() {
        return PublicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        PublicationYear = publicationYear;

    }

    public String printBook(){
        return getName()+"|"+getAuthor()+"|"+getPublicationYear();
    }

    public Book(String name,String author, int publicationYear) {
        Name = name;
        Author = author;
        PublicationYear = publicationYear;
    }
}
