package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class Library {

    private ArrayList<Book> bookList = new ArrayList<Book>();
    //private List<String> validOptions = asList("1");
    private Printer printer = new Printer();

    public ArrayList<Book> getBookList() { return bookList; }

    public void printBooksNames(){
        for(Book b : bookList){
            if(!b.isCheckout())
                printer.printBook(b);
        }
    }

    public void createBooksForLibrary(){
        addBookInLibrary(new Book("Le petite prince","Antoine de Saint-Exupéry",1943));
        addBookInLibrary(new Book("Das Kapital","Karl Marx", 1867));
        addBookInLibrary(new Book("Lolita","Vladimir Nabokov", 1955));
    }

    public void addBookInLibrary(Book book){
        bookList.add(createIdForBook(book));
    }

    private Book createIdForBook(Book book) {
        book.setId(bookList.size());
        return book;
    }

    public String tryCheckoutABook(int id){
        if(bookExist(id))
           return checkOutABook(id);
        else
           return Message.BOOK_NOT_AVAILABLE;
    }

    public String tryReturnABook(int id){
        if(bookExist(id))
            return  returnBook(id);
        else
            return Message.BOOK_NOT_AVAILABLE;
    }


    public String checkOutABook(int id){
        if(!bookList.get(id).isCheckout()) {
            bookList.get(id).setCheckout(true);
            return  Message.SUCCESS_ON_CHECKOUT;
        }
        else
            return Message.BOOK_NOT_AVAILABLE;
    }

    public boolean bookExist(int id){
        if(id <= bookList.size())
            return true;
        else
            return false;
    }

    public  Library(boolean generateLibraryWithBooks){
        if(generateLibraryWithBooks)
            createBooksForLibrary();
    }

    private String returnBook(int id) {
        if(!bookList.get(id).isCheckout()) {
          return Message.BOOK_NOT_VALID_TO_RETURN;
        }
        bookList.get(id).setCheckout(false);
        return Message.BOOK_WAS_RETURNED_WITH_SUCCESS;
    }
}
