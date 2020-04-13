package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuManagerTest {
    @Test
    public void optionShoulBeValidWhenOptionsExists(){
        MenuManager menu = new MenuManager();
        assertEquals(menu.isAValidOption("1"),true);
    }
    @Test
    public void optionAreNotValidWhenOptionNotExists(){
        MenuManager menu  = new MenuManager();
        assertEquals(menu.isAValidOption("99"), false);
        assertEquals(menu.isAValidOption(" "), false);
        assertEquals(menu.isAValidOption(null), false);
    }

}
