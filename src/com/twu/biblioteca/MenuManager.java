package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.util.Arrays.asList;

public class MenuManager {

<<<<<<< HEAD
    private List<String> validOptions = asList("0","1");
=======
    private List<String> validOptions = asList("0","1","2");
>>>>>>> master

    Library library = new Library(true);
    Printer printer = new Printer();

    public void showWelcomeMessage(){
        printer.printMessage(Message.WELCOME_TO_BIBLIOTECA);
    }
<<<<<<< HEAD
    public void ShowMenuOptions(){
        System.out.println("(1) List of Books");
        System.out.println(("(0) Exit Application"));
        ChoseOption();
=======

    public void showMenuOptions(){
        printer.printMessage(Message.ASK_FOR_MENU_OPTION);
        printer.printMessage(Message.MAIN_MENU_OPTION_EXIT_APPLICATION);
        printer.printMessage(Message.MAIN_MENU_OPTION_LIST_BOOKS);
        printer.printMessage(Message.MAIN_MENU_OPTION_CHECKOUTBOOKS);
        choseOption();
>>>>>>> master
    }

    private void choseOption(){
        Scanner scan = new Scanner(System.in);
        String option = scan.next();
        if(isAValidOption(option))
<<<<<<< HEAD
            CallOption(option);
        else
            ShowMenuOptions();
=======
            callOption(option);
        else {
            showMessageErrorInvalidOption();
            showMenuOptions();
        }
>>>>>>> master
    }

    public  void callOption(String option){
        
        switch (option){
            case "0":
                exit(0);
            case "1" :
                printer.printMessage(Message.AVAILABLE_BOOKS_PRESENTATION);
                library.printBooksNames();
                break;
            case "2":
                printer.printMessage(Message.ASK_FOR_BOOK_ID);
                library.tryCheckoutABook();
                break;

        }
<<<<<<< HEAD
        ShowMenuOptions();
=======
        showMenuOptions();
>>>>>>> master
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
        printer.printMessage(Message.INVALID_OPTION);
    }
}
