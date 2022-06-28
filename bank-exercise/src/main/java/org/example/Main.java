package org.example;

public class Main {
    public static void main(String[] args) {

        //instantiating

        BankAccount roudabehFirstAccount = new BankAccount(630_000_000, 1001500.51, "Roudabeh Adnani", "rodabeh.adnani@gmail.com", "0769826471" );
        System.out.println(roudabehFirstAccount.getInformation());
        System.out.println("The firs account number is: " + roudabehFirstAccount.getAccountNumber());


        BankAccount roudabehSecondAccount = new BankAccount(1001500.51, "Roudabeh Adnani", "rodabeh.adnani@gmail.com", "0769826471" );
        System.out.println("The firs account number is: " + roudabehSecondAccount.getAccountNumber());

        BankAccount roudabehThirdAccount = new BankAccount(1001500.51, "Roudabeh Adnani", "rodabeh.adnani@gmail.com", "0769826471" );
        System.out.println("The firs account number is: " + roudabehThirdAccount.getAccountNumber());


        //calling deposit and withdraw methods
        System.out.println("New balance after deposit: " + roudabehFirstAccount.deposit(8000));
        System.out.println("New balance after withdraw: " + roudabehFirstAccount.withDraw(100_000));

    }
}