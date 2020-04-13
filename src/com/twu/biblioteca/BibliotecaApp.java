package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great titles in Bangalore");
        Library library = new Library();
        System.out.println("Today we have the follow books avaliable");
        System.out.println((library.ShowBooksNames()));
    }
}
