package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PrinterTest {
    @Test
    public void GetSizeOfStringTest(){

        Printer printer = new Printer();

        assertEquals(printer.getSizeOfString("Book"),4);
        assertEquals(printer.getSizeOfString("Biblioteca"),10);
    }

    @Test
    public void CompleteBookNameWithSpaceUntilLenghtIs25Test(){
        Printer printer = new Printer();
        assertEquals(printer.CompleteStringWithSpaceUntilLenghtIs25("Le petite prince"),"Le petite prince         ");
        assertEquals(printer.CompleteStringWithSpaceUntilLenghtIs25("Das Kapital"),"Das Kapital              ");
        assertEquals(printer.CompleteStringWithSpaceUntilLenghtIs25("Karl Marx"),"Karl Marx                ");

    }
}
