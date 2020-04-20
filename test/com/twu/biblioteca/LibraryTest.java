package com.twu.biblioteca;

import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class LibraryTest {
/*
    @Test
    public void createBooksForLibraryShouldFillBookList(){
        Library library = new Library(true);
        library.createBooksForLibrary();
        assertEquals(library.getBookList().isEmpty(),false);
    }
    @Test
    public void newLibraryShouldReturnAnEmptyBookList(){
        Library library = new Library(false);
        assertEquals(library.getBookList().isEmpty(),true);
    }
    @Test
    public void aNewBookInLibraryShouldBeCheckoutFalse(){
        Library library = new Library(false);
        library.addBookInLibrary(new Book("Das Kapital","Karl Marx", 1853));
        assertEquals(library.getBookList().get(0).isCheckout(),false);
    }

    @Test
    public void WhenCheckoutABookTheyShouldBeCheckoutTrue(){
        Library library = new Library(false);
        library.addBookInLibrary(new Book("Das Kapital","Karl Marx", 1853));
        library.checkOutABook(0);
        assertEquals(library.getBookList().get(0).isCheckout(),true);

    }
    @Test
    public void WhenReturnABookCheckoutShouldBeFalse(){
        Library library = new Library(true);
        library.checkOutABook(0);
        library.returnBook(0);
        assertFalse(library.getBookList().get(0).isCheckout());
    }
*/
    //New Refactoring Test
    @Test
    public void TryCheckoutABookShouldReturnInvalidBookMessage(){
        Library library = new Library(true);
        assertEquals(library.tryCheckoutABook(17),Message.BOOK_NOT_AVAILABLE);
    }

    @Test
    public void TryCheckoutABookShouldReturnSucessfullyMessage(){
        Library library = new Library(true);
        assertEquals(library.tryCheckoutABook(0),Message.SUCCESS_ON_CHECKOUT);
    }

    @Test
    public void TryReturnABookShouldReturnInvalidBookMessage(){
        Library library = new Library(true);
        assertEquals(library.tryReturnABook(0),Message.BOOK_NOT_VALID_TO_RETURN);
    }
    @Test
    public void TryReturnABookShouldReturnSuccessfullyBookMessage(){
        Library library = new Library(true);
        library.tryCheckoutABook(0);
        assertEquals(library.tryReturnABook(0),Message.BOOK_WAS_RETURNED_WITH_SUCCESS);

    }
}
