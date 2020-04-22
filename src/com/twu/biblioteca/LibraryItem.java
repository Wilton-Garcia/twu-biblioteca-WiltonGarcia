package com.twu.biblioteca;

public abstract class LibraryItem {

    private int id;
    private boolean checkout;

    private String name;
    private int year;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public boolean isCheckout() { return checkout; }

    public LibraryItem(String name, int year) {
        this.checkout = false;
        this.name = name;
        this.year = year;
    }
}
