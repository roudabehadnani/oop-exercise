package org.example;

public class Main {
    public static void main(String[] args) {

        //Instantiating
        Car peugeot = new Car();

        //Assign value
        peugeot.setId("UDN 695");
        peugeot.setYear("2006");
        peugeot.setModel("Peugeot 307 SW 3.0");
        peugeot.setColor("Black");
        peugeot.setMotorSize(2000);


        //Calling the method in Car class
        System.out.println(peugeot.drive());


    }
}