package com.twu.biblioteca;

public class Printer {
    public String printBook(Book book){
        return CompleteStringWithSpaceUntilLenghtIs25(book.getName())+"|"+
                CompleteStringWithSpaceUntilLenghtIs25(book.getAuthor())+"|"+
               book.getPublicationYear()+"\n";
    }
    public int getSizeOfString(String s){
        return  s.length();
    }
    public String CompleteStringWithSpaceUntilLenghtIs25(String theString){
        int numberOfSpaces = 25 - getSizeOfString(theString);
        for(int i =0; i < numberOfSpaces; i++){
            theString += " ";
        }
        return  theString;
    }
}
