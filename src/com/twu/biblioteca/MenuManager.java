package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class MenuManager {

    private List<String> validOptions = asList("1");


    public void ShowWelcomeMessage(){
        System.out.println("\nWelcome to Biblioteca. Your one-stop-shop for great titles in Bangalore\n");
        System.out.println("Please type one of options bellow");
    }
    public void ShowMenuOptions(){
        System.out.println("(1) List of Books");
    }
    public void  ChoseOption(){
        Scanner scan = new Scanner(System.in);
        String option = scan.next();

        if(isAValidOption(option)){
            CallOption(option);
        }

    }
    public  void CallOption(String option){

       Library library = new Library();

        switch (option){
            case "1" :
                System.out.println("Today we have the follow books avaliable\n");
                library.PrintBooksNames();
                break;
        }
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
