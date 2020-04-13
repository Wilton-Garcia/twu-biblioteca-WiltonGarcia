package com.twu.biblioteca;

import java.util.Scanner;

public class MenuManager {

    public void ShowWelcomeMessage(){
        System.out.println("\nWelcome to Biblioteca. Your one-stop-shop for great titles in Bangalore\n");
    }
    public void ShowMenuOptions(){
        System.out.println("(1) List of Books");
    }
    public void  ChoseOption(){

        Scanner scan = new Scanner(System.in);

        String option = scan.next();



    }
    public Boolean IsAValidOption(String option){
        try{
            int validOption = Integer.parseInt(option);
            return true;
        }catch (Exception e){
            ShowMessageErrorInvalidOption();
            return  false;
        }
    }
    public  void ShowMessageErrorInvalidOption(){
        System.out.println("This are not a valid option");
    }



}
