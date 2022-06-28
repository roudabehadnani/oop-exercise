package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    Author author1 = new Author("Barry","Burd",
            new String[]{"Java for Dummies", "Beginning Programming with Java For Dummies","Flutter For Dummies"});
        System.out.println(author1.toString());
        System.out.println("all books by the author1: "+ Arrays.toString(author1.getNameOfBooks()));

    Author author2 = new Author("James","Patterson",
            new String[]{"Java: A Beginner's Guide to Learning the Basics of Java Programming","Computer Science Series"});
        System.out.println(author2.toString());
        System.out.println("all books by the author2: " + Arrays.toString(author2.getNameOfBooks()));

    Book book = new Book("Java for Dummies", author1);
        System.out.println(book);
        System.out.println("The author is: " + book.getAuthor());

    }
}