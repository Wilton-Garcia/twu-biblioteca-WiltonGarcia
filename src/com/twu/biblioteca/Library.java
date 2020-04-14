package com.twu.biblioteca;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> avaliableBooks = new ArrayList<Book>();

    public void printBooksNames(){
        String result  = "";
        Printer printer = new Printer();
        for(Book b : avaliableBooks){
            printer.printBook(b);
        }
    }

    public  Library(){
        avaliableBooks = new ArrayList<Book>();
        avaliableBooks.add(new Book("Le petite prince","Antoine de Saint-Exupéry",1943));
        avaliableBooks.add(new Book("Das Kapital","Karl Marx", 1867));
    }
}
