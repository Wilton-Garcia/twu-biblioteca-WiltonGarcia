package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.util.Arrays.asList;

public class MenuManager {

    private List<String> validOptions = asList("0","1","2");

    Library library = new Library(true);

    public void showWelcomeMessage(){
        System.out.println("\nWelcome to Biblioteca. Your one-stop-shop for great titles in Bangalore\n");

    }

    public void showMenuOptions(){
        System.out.println("\nPlease type one of options bellow\n");
        System.out.println("(0) Exit Application");
        System.out.println("(1) List of Books");
        System.out.println("(2) To Checkout a book");
        choseOption();
    }

    private void choseOption(){
        Scanner scan = new Scanner(System.in);
        String option = scan.next();
        if(isAValidOption(option))
            callOption(option);
        else {
            showMessageErrorInvalidOption();
            showMenuOptions();
        }
    }

    public  void callOption(String option){


        switch (option){
            case "0":
                exit(0);
            case "1" :
                System.out.println("Today we have the follow books available\n");
                library.printBooksNames();
                break;
            case "2":
                System.out.println("What is the book id?");
                Scanner scan = new Scanner(System.in);
                int op = Integer.parseInt(scan.next());
                library.checkOutABook(op);
                break;

        }
        showMenuOptions();
    }

    public Boolean isAValidOption(String option){
        if(validOptions.contains(option)){
             return  true;
        }else{
            showMessageErrorInvalidOption();
            return  false;
        }
    }

    private void showMessageErrorInvalidOption(){
        System.out.println("This are not a valid option");
    }
}
