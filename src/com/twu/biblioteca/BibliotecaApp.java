package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great titles in Bangalore\n");
        Library library = new Library();
        System.out.println("Today we have the follow books avaliable\n");
        System.out.println((library.PrintBooksNames()));
    }
}
