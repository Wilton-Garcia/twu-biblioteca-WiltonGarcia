package com.twu.biblioteca;

public class Printer {

    public void printBook(Book book){
        System.out.println(completeStringWithSpaceUntilLenghtIs25(book.getName())+"|"+
                           completeStringWithSpaceUntilLenghtIs25(book.getAuthor())+"|"+
                            book.getPublicationYear());
    }

    public int getSizeOfString(String s){
        return  s.length();
    }

    public String completeStringWithSpaceUntilLenghtIs25(String theString){
        int numberOfSpaces = 25 - getSizeOfString(theString);

        for(int i =0; i < numberOfSpaces; i++){
            theString += " ";
        }
        return  theString;
    }
}
