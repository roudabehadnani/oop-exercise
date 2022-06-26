package org.example;

public class Rectangle {

    //Fields
    private double height;
    private double width;

    //constructors
    public Rectangle(){

    }
    public Rectangle (double height, double width){
        this.height = height;
        this.width = width;
    }

    //Getters and Setters
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }

    //Method
    public double getArea(){
        return  getHeight()*getWidth();
    }


}
