package com.twu.biblioteca;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    private ArrayList<Book> bookList = new ArrayList<Book>();
    private ArrayList<Book> availableBooks = new ArrayList<Book>();

    public ArrayList<Book> getBookList() { return bookList; }


    public void printBooksNames(){
        Printer printer = new Printer();
        availableBooks = getAvailableBooks();
        for(Book b : availableBooks){
            printer.printBook(b);
        }
    }

    public ArrayList<Book> getAvailableBooks(){
        for (Book b: bookList) {
          if(!b.isCheckout()){
              availableBooks.add(b);
          }
        }
        return availableBooks;
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

    public void checkOutABook(int id){
        if(bookExist(id))
            bookList.get(id).setCheckout(true);
    }

    public boolean bookExist(int id){
        return (id <= bookList.size());
    }

    public  Library(){
    }
}
