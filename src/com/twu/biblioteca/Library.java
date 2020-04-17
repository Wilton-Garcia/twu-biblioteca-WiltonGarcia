package com.twu.biblioteca;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class Library {

    private ArrayList<Book> bookList = new ArrayList<Book>();
    private List<String> validOptions = asList("1");
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
        printer.printMessage(Message.SUCCESS_ON_CHECKOUT);
    }

    private Book createIdForBook(Book book) {
       book.setId(bookList.size());
        return book;
    }


    public void tryCheckoutABook(){
        Scanner scanner = new Scanner(System.in);
        try{
            int id = scanner.nextInt();
            if(bookExist(id))
                checkOutABook(id);
            else {
                printer.printMessage(Message.BOOK_NOT_AVAILABLE);
            }
        }catch(Exception e){
            printer.printMessage(Message.INVALID_OPTION);
        }



    }

    public void checkOutABook(int id){
            bookList.get(id).setCheckout(true);
    }

    public boolean bookExist(int id){
        return (id <= bookList.size());
    }

    public  Library(boolean generateLibraryWithBooks){
        if(generateLibraryWithBooks)
            createBooksForLibrary();
    }
}
