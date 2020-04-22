package com.twu.biblioteca;

public class Printer {

    public String formatBooKInfoToPrinter(Book book){
        return book.getId()
                            +"|"+ completeStringWithSpaceUntilLenghtIs50(book.getName())
                            +"|"+ completeStringWithSpaceUntilLenghtIs50(book.getAuthor())
                            +"|"+ book.getPublicationYear()
                            +"\n";
    }

    public String formatMovieInfoToPrinter(Movie movie){
        return movie.getId()
                +"|"+ completeStringWithSpaceUntilLenghtIs50(movie.getName())
                +"|"+ completeStringWithSpaceUntilLenghtIs50(movie.getDirector())
                +"|"+ movie.getYear()
                +"|"+ movie.getRating()
                +"\n";
    }
    public int getSizeOfString(String s){
        return  s.length();
    }

    public String completeStringWithSpaceUntilLenghtIs50(String theString){
        int numberOfSpaces = 50 - getSizeOfString(theString);

        for(int i =0; i < numberOfSpaces; i++){
            theString += " ";
        }
        return  theString;
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}
