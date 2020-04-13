package com.twu.biblioteca;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> AvaliableBooks = new ArrayList<Book>();

    public ArrayList<Book> getAvaliableBooks() {
        return AvaliableBooks;
    }

    public void setAvaliableBooks(ArrayList<Book> avaliableBooks) {
        AvaliableBooks = avaliableBooks;
    }

    public String ShowBooksNames(){
        String result  = "";
        for(Book b : AvaliableBooks){
            result += b.printBook()+"\n";
        }
        return result;
    }



    public  Library(){
        AvaliableBooks = new ArrayList<Book>();
        AvaliableBooks.add(new Book("Le petite prince","Antoine de Saint-Exupéry",1943));
        AvaliableBooks.add(new Book("Das Kapital","Karl Marx", 1867));
    }
}
