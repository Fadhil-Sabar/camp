package com.enigma.oop;

public class Car {
    private String color;
    private Integer fuel;
    private Boolean isStart;
    private String name;

    public Car(String color, Integer fuel, Boolean isStart, String name) {
        this.color = color;
        this.fuel = fuel;
        this.isStart = isStart;
        this.name = name;
    }

    public Car(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Car() {
    }




    public void engineStart(){
        if(this.fuel > 0){
            System.out.println("Ngengg");
        }else{
            System.out.println("Isi bensin dulu bro");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public Boolean getStart() {
        return isStart;
    }

    public void setStart(Boolean start) {
        isStart = start;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", fuel=" + fuel +
                ", isStart=" + isStart +
                ", name='" + name + '\'' +
                '}';
    }

    public String print(){
        return "Car: {Color: " + color + " Fuel: " + fuel + " Start: " + isStart + "}";
    }
}
