package com.pb.smirnova.hw6;

import java.util.Objects;

public class Animal {
    //Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
    //Метод sleep, например, может выводить на консоль "Такое-то животное спит".
    protected final String name;
    protected String food;
    protected String location;
    public int weight;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String food, String location, int weight) {
        this.name = name;
        this.food = food;
        this.location = location;
        this.weight = weight;
    }

    public String getName() {
        return name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(food, animal.food)
                && Objects.equals(location, animal.location)
                && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, location, name);
    }

}
