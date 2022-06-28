package org.example;

public class BankAccount {

    //Fields

    private static int accountNumberSequencer = 630_000_000;

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //constructor
    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = ++accountNumberSequencer;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Getters & Setters

    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }



    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    //Method for get information
    public String getInformation(){
        return ("The account number is: " + getAccountNumber() + " With the account balance: " + getBalance() + " Kr " + " customer name is: " + getCustomerName() + " Address email is: " + getEmail() + " and phone number is: " + getPhoneNumber());
    }

    //Method for deposit
    public double deposit(double newAmount){
        double balance = getBalance()+ newAmount;
        setBalance(balance);
        return balance;
    }
    //Method for withdraw
    public double withDraw(double withDrawAmount){

        if(withDrawAmount > getBalance()){
            System.out.println("YOU DON'T HAVE ENOUGH MONEY!");

        }else {
            double balance = getBalance() - withDrawAmount;
            setBalance(balance);
        }
        return balance;
    }

}
