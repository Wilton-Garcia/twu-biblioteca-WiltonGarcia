package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.List;

public class LibraryTest {

    @Test
    public void ShowAListWithAvaliableBooksNames(){
        Library library = new Library();
        assertEquals(library.ShowBooksNames(),"Le petite prince\nDas Kapital\n");

    }
}
