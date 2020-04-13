package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        Library library = new Library();

        MenuManager Menu = new MenuManager();

        Menu.ShowWelcomeMessage();
        Menu.ShowMenuOptions();
        Menu.ChoseOption();



        System.out.println((library.PrintBooksNames()));
    }
}
