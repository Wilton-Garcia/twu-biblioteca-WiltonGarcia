package com.twu.biblioteca;

public class Book implements IMedia{

    private int id;
    private String name;
    private String author;
    private int publicationYear;
    private boolean checkout;

    public int getId() {return  id;}

    public void setId(int id) { this.id = id;}

    @Override
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean isCheckout() { return checkout; }

    @Override
    public String toString(){

        Printer printer = new Printer();

        return getId()
                +"|"+ printer.completeStringWithSpaceUntilLenghtIs50(getName())
                +"|"+ printer.completeStringWithSpaceUntilLenghtIs50(getAuthor())
                +"|"+ getPublicationYear()
                +"\n";
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
