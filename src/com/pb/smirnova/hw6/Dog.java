package com.pb.smirnova.hw6;

import java.util.Objects;

public class Dog extends Animal{
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }



    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("гав-гав");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(getFood());
    }

    @Override
    public String toString() {
        return "Dog{'" + getName() + '\'' +
                " ест '" + getFood() + '\'' +
                ", живет в '" + getLocation() + '\'' +
                ", порода: '" + breed + '\'' +
                ", вес: " + weight +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return  Objects.equals(getLocation(), dog.getLocation()) && Objects.equals(getFood(), dog.getFood()) && Objects.equals( breed, dog.breed);
    }


}
