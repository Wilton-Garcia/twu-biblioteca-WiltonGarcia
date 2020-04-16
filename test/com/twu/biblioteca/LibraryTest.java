package com.twu.biblioteca;

import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class LibraryTest {

    @Test
    public void createBooksForLibraryShouldFillBookList(){
        Library library = new Library();
        library.createBooksForLibrary();
        assertEquals(library.getBookList().isEmpty(),false);
    }
    @Test
    public void newLibraryShouldReturnAnEmptyBookList(){
        Library library = new Library();
        assertEquals(library.getBookList().isEmpty(),true);
    }
    @Test
    public void booksInAvailiableBooksShouldBeCheckoutFalse(){
        Library library = new Library();
        library.addBookInLibrary(new Book("Das Kapital","Karl Marx", 1853));
        assertEquals(library.getBookList().get(0).isCheckout(),false);
    }

    @Test
    public void WhenCheckoutABookTheyCanBeMoreInAvailableBookList(){
        Library library = new Library();
        library.addBookInLibrary(new Book("Das Kapital","Karl Marx", 1853));
        library.checkOutABook(0);
        assertEquals(library.getBookList().get(0).isCheckout(),true);


    }
}
