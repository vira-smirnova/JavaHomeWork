package com.pb.smirnova.hw6;

import java.util.Objects;

public class Horse  extends Animal{

    private int age;

    public Horse(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("иго-го-го");
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println(getFood());
    }

    @Override
    public String toString() {
        return "Horse{'" + getName() + '\'' +
                " ест '" + getFood() + '\'' +
                ", живет в '" + getLocation() + '\'' +
                ", возраст: '" + age + '\'' +
                ", вес: " + weight +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return  Objects.equals(getLocation(), horse.getLocation()) && Objects.equals(getFood(), horse.getFood()) && Objects.equals( age, horse.age);
    }
}
