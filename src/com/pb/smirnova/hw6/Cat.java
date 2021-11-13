package com.pb.smirnova.hw6;

import java.util.Objects;

public class Cat extends Animal{

    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("мяу-мяу");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(getFood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return  Objects.equals(getLocation(), cat.getLocation()) && Objects.equals(getFood(), cat.getFood()) && Objects.equals( color, cat.color);
    }

    @Override
    public String toString() {
        return "Cat{'" + getName() + '\'' +
                " ест '" + getFood() + '\'' +
                ", живет в '" + getLocation() + '\'' +
                ", цвет: '" + color + '\'' +
                ", вес: " + weight +
                '}';
    }
}
