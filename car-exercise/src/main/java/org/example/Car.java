package org.example;

public class Car {

    //Fields
    private String id;
    private String year;
    private String model;
    private String color;
    private int motorSize;


    //Setters
    public void setId(String id){
        this.id = id;
    }
    public void setYear(String year){
        this.year = year;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setMotorSize(int motorSize){
        this.motorSize = motorSize;
    }


    //Method
    public String drive(){
        return  model + " with motor " + motorSize + " can drive now. ";
    }



}
