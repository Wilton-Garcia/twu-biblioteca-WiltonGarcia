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


    public void tryCheckoutABook(){
        Scanner scanner = new Scanner(System.in);
        int id = 0;
        try{
            id = scanner.nextInt();
        }catch(Exception e){
            printer.printMessage(Message.INVALID_OPTION);
        }
        if(bookExist(id))
            checkOutABook(id);
    }

    public void checkOutABook(int id){
        if(!bookList.get(id).isCheckout())
        {
            bookList.get(id).setCheckout(true);
            printer.printMessage(Message.SUCCESS_ON_CHECKOUT);

        }else{
            printer.printMessage(Message.BOOK_NOT_AVAILABLE);
        }
    }

    public boolean bookExist(int id){
        if(id <= bookList.size())
            return true;
        else{
            printer.printMessage(Message.BOOK_NOT_AVAILABLE);
            return false;
        }
    }

    public  Library(boolean generateLibraryWithBooks){
        if(generateLibraryWithBooks)
            createBooksForLibrary();
    }
}
