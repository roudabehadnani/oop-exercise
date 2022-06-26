package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Input data from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the height of the rectangle: ");
        double height = sc.nextDouble();
        System.out.println("Input the width of the rectangle: ");
        double width = sc.nextDouble();

        //Instantiating
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(height);
        rectangle.setWidth(width);

        //Calling method from Rectangle class
        System.out.println("The area of rectangle is: " + rectangle.getArea());


    }
}