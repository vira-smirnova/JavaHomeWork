package com.pb.smirnova.hw6;

public class Animal {
    //Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
    //Метод sleep, например, может выводить на консоль "Такое-то животное спит".
    private String name;
    private String food;
    private String location;
    public int weight;



    public Animal(String name, String food, String location, int weight) {
        this.name = name;
        this.food = food;
        this.location = location;
        this.weight = weight;
    }
    public Animal(String location, String food){}

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise(){
        System.out.print(getName() + " - издает звуки ");
    }
    public void eat(){
        System.out.print(getName() + " ест ");
    }
    public void sleep(){
        System.out.println(getName() + " спит");
    }

}
