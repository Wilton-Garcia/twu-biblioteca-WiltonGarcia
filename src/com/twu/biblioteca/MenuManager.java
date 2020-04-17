package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.util.Arrays.asList;

public class MenuManager {

    private List<String> validOptions = asList("0","1","2");

    Library library = new Library(true);
    Printer printer = new Printer();

    public void showWelcomeMessage(){
        printer.printMessage(Message.WELCOME_TO_BIBLIOTECA);
    }

    public void showMenuOptions(){
        printer.printMessage(Message.ASK_FOR_MENU_OPTION);
        printer.printMessage(Message.MAIN_MENU_OPTION_EXIT_APPLICATION);
        printer.printMessage(Message.MAIN_MENU_OPTION_LIST_BOOKS);
        printer.printMessage(Message.MAIN_MENU_OPTION_CHECKOUTBOOKS);
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
                printer.printMessage(Message.AVAILABLE_BOOKS_PRESENTATION);
                library.printBooksNames();
                break;
            case "2":
                printer.printMessage(Message.ASK_FOR_BOOK_ID);
                library.tryCheckoutABook();
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
        printer.printMessage(Message.INVALID_OPTION);
    }
}
