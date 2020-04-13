package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuManagerTest {


    @Test
    public void IsAValidaOptionShouldBeTrueTest() {
        MenuManager menu = new MenuManager();
        assertEquals(menu.IsAValidOption("1"), true);
    }

    @Test
    public  void IsAValidOptionShouldBeFalseTest(){
        MenuManager menu = new MenuManager();
        assertEquals(menu.IsAValidOption(" "), false);
        assertEquals(menu.IsAValidOption(""), false);
        assertEquals(menu.IsAValidOption("ç"), false);
    }
}
