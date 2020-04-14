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

    @Test
    public void completeBookNameWithSpaceUntilLenghtIs25Test(){
        Printer printer = new Printer();
        assertEquals(printer.completeStringWithSpaceUntilLenghtIs25("Le petite prince"),"Le petite prince         ");
        assertEquals(printer.completeStringWithSpaceUntilLenghtIs25("Das Kapital"),"Das Kapital              ");
        assertEquals(printer.completeStringWithSpaceUntilLenghtIs25("Karl Marx"),"Karl Marx                ");

    }
}
