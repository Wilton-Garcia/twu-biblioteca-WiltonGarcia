package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuManagerTest {


    @Test
    public void optionsIsValidWhenOptionIsAnIntegerNumber() {
        MenuManager menu = new MenuManager();
        assertEquals(menu.IsAValidOption("1"), true);
    }

    @Test
    public void optionAreNotValidWhenOptionIsSpecialCharacter(){
        MenuManager menu = new MenuManager();
        assertEquals(menu.IsAValidOption("/"), false);
        assertEquals(menu.IsAValidOption("ç"), false);
    }

    @Test
    public void optionAreNotValidWhenOptionsInEmptyOrNull(){
        MenuManager menu = new MenuManager();
        assertEquals(menu.IsAValidOption(null), false);
        assertEquals(menu.IsAValidOption(" "), false);
        assertEquals(menu.IsAValidOption(""), false);
    }

    @Test
    public void optionShoulBeInValidRangeTest(){
        MenuManager menu = new MenuManager();
        assertEquals(menu.IsAValidOption("1"),true);
    }
    @Test
    public void optionShouldBeFalseWhenOptionIsOutOfRange(){
        MenuManager menu = new MenuManager();
        assertEquals(menu.IsAValidOption("99"),false);
    }
}
