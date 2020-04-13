package com.twu.biblioteca;

import java.util.Scanner;

public class MenuManager {

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

        if(IsAValidOption(option)){
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
    public Boolean IsAValidOption(String option){
       return  isIntegerNumber(option) && optionAreInTheRange(option);
    }

    private Boolean isIntegerNumber(String option) {
        try{
            int validOption = Integer.parseInt(option);
            return true;
        }catch (Exception e){
            ShowMessageErrorInvalidOption();
            return  false;
        }
    }
    private  Boolean optionAreInTheRange(String option){
        return Integer.parseInt(option) == 1;
    }

    public  void ShowMessageErrorInvalidOption(){
        System.out.println("This are not a valid option");
    }



}
