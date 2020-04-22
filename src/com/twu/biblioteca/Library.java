package com.twu.biblioteca;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookList = new ArrayList<>();
    private  ArrayList<Movie> movieList = new ArrayList<>();

    private Printer printer = new Printer();

    public ArrayList<Book> getBookList() { return bookList; }

    public String printAvailableBooks(){
        String availabeBooks = "";

        for(Book b : bookList){
            if(!b.isCheckout())
             availabeBooks +=  printer.formatBooKInfoToPrinter(b);
        }

        if(availabeBooks.isEmpty()){
            return Message.THERE_ARE_NO_AVAILABLE_BOOKS;
        }else{
            return availabeBooks;
        }
    }

    public String printAvailableMovies(){
        String availableMovies = "";

        for(Movie m : movieList){
            if(!m.isCheckout())
                availableMovies +=  printer.formatMovieInfoToPrinter(m);
        }

        if(availableMovies.isEmpty()){
            return Message.THERE_ARE_NO_AVAILABLE_BOOKS;
        }else{
            return availableMovies;
        }
    }



    public String tryCheckoutABook(int id){
        if(bookExist(id))
           return checkOutABook(id);
        else
           return Message.BOOK_NOT_AVAILABLE;
    }

    private String checkOutABook(int id){
        if(!bookList.get(id).isCheckout()) {
            bookList.get(id).setCheckout(true);
            return  Message.SUCCESS_ON_CHECKOUT;
        }
        else
            return Message.BOOK_NOT_AVAILABLE;
    }

    public String tryReturnABook(int id){
        if(bookExist(id))
            return  returnBook(id);
        else
            return Message.BOOK_NOT_AVAILABLE;
    }

    private String returnBook(int id) {
        if(!bookList.get(id).isCheckout()) {
            return Message.BOOK_NOT_VALID_TO_RETURN;
        }
        bookList.get(id).setCheckout(false);
        return Message.BOOK_WAS_RETURNED_WITH_SUCCESS;
    }


    public boolean bookExist(int id){
        if(id < bookList.size())
            return true;
        else
            return false;
    }

    public void addBookInLibrary(Book book){
        bookList.add(createIdForBook(book));
    }
    public void addMovieInLibrary(Movie movie){
        movieList.add(createIdForMovie(movie));
    }


    private void createBooksAndMoviesForLibrary(){
        addBookInLibrary(new Book("Le petite prince","Antoine de Saint-Exupéry",1943));
        addBookInLibrary(new Book("Das Kapital","Karl Marx", 1867));
        addBookInLibrary(new Book("Lolita","Vladimir Nabokov", 1955));

        addMovieInLibrary(new Movie("As vantagens de ser invisível","Stephen Schbosky", 2012, 9));
        addMovieInLibrary(new Movie("Laland","Damien Chazelle",2017,10));
    }
    private Book createIdForBook(Book book) {
        book.setId(bookList.size());
        return book;
    }

    private Movie createIdForMovie(Movie movie) {
        movie.setId(movieList.size());
        return movie;
    }
    public  Library(boolean generateLibraryWithBooks){
        if(generateLibraryWithBooks)
            createBooksAndMoviesForLibrary();
    }

    //Remodeling the code

    private ArrayList<LibraryItem> items = new ArrayList<>();
    private ArrayList<Movie> movie = new ArrayList<>();

    public void addItemInLibrary(LibraryItem item){



    }

}
