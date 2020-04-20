package com.twu.biblioteca;

import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class LibraryTest {

    @Test
    public void whenAddABookTheListSizeShouldIncrease(){
        Library library = new Library(false);
        int initialSize = library.getBookList().size();
        library.addBookInLibrary(new Book("Harry Potter","J.K. Rowlling", 1995));
        int currentSize = library.getBookList().size();
        assertTrue(currentSize > initialSize);
    }


    @Test
    public void shouldReturnTrueWhenBookExist(){
        Library library = new Library(true);
        assertTrue(library.bookExist(0));
    }

    @Test
    public void shouldReturnFalseWhenBookNotExist(){
        Library library = new Library(false);
        assertFalse(library.bookExist(0));
    }

    @Test
    public void printOnlyAvailableBooks(){
        Library library = new Library(false);
        Book bookToCheckout = new Book("A Fundação","Isac Asimov",1952);
        Book bookToShow = new Book("Harry Potter","J.K. Rowlling", 1995);
        library.addBookInLibrary(bookToCheckout);
        library.addBookInLibrary(bookToShow);
        library.tryCheckoutABook(0);
        assertEquals(library.printAvailableBooks(),new Printer().formatBooKInfoToPrinter(bookToShow));
    }

    @Test
    public void printMessageNoAvailableBooks(){
        Library library = new Library(false);
        Book bookToCheckout = new Book("A Fundação","Isac Asimov",1952);
        library.addBookInLibrary(bookToCheckout);
        library.tryCheckoutABook(0);
        assertThat(library.printAvailableBooks(), is(Message.THERE_ARE_NO_AVAILABLE_BOOKS));

    }

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
