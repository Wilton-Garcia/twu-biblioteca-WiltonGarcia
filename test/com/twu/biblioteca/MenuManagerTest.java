package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuManagerTest {
    @Test
<<<<<<< HEAD
    public void optionShoulBeValidWhenOptionsExists(){
=======
    public void optionShouldBeValidWhenOptionsExists(){
>>>>>>> master
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
