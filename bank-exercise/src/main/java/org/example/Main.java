package org.example;

public class Main {
    public static void main(String[] args) {

        //instantiating

        BankAccount roudabeh = new BankAccount("6323-954-1086", 100160.56, "Roudabeh Adnani", "rodabeh.adnani@gmail.com", "0764359935" );
        System.out.println(roudabeh.getInformation());


        System.out.println("New balance after deposit: " + roudabeh.deposit(8000));
        System.out.println("New balance after withdraw: " + roudabeh.withDraw(5000));

    }
}