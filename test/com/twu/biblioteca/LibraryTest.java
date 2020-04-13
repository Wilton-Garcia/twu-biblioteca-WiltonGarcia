package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.List;

public class LibraryTest {

    @Test
    public void ShowAListWithAvaliableBooksNames(){
        Library library = new Library();
        assertEquals(library.ShowBooksNames(),"Le petite prince|Antoine de Saint-Exupéry|1943\n" +
                                                "Das Kapital|Karl Marx|1867\n");

    }
}
