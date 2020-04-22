package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PrinterTest {

    @Test
    public void getSizeOfStringTest(){

        Printer printer = new Printer();

        assertEquals(printer.getSizeOfString("Book"),4);
        assertEquals(printer.getSizeOfString("Biblioteca"),10);
    }
/*
    @Test
    public void completeBookNameWithSpaceUntilLenghtIs50Test(){
        Printer printer = new Printer();
        assertEquals(printer.completeStringWithSpaceUntilLenghtIs50("Le petite prince"),"Le petite prince         ");
        assertEquals(printer.completeStringWithSpaceUntilLenghtIs50("Das Kapital"),"Das Kapital              ");
        assertEquals(printer.completeStringWithSpaceUntilLenghtIs50("Karl Marx"),"Karl Marx                ");

    }
  */
}
