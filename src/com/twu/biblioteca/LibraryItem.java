package com.twu.biblioteca;

public class LibraryItem {

    private int id;
    private boolean checkout;

    private String name;
    private int year;

    public int getId() { return id; }

    public boolean isCheckout() { return checkout; }

    public LibraryItem(String name, int year) {
        this.checkout = false;
        this.name = name;
        this.year = year;
    }
}
