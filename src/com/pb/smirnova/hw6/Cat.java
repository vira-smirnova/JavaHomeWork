package com.pb.smirnova.hw6;

import java.util.Objects;

public class Cat extends Animal{

    public Cat (String location, String food) {
        super(location, food);
    }

    public Cat() {
        super("Кот", "рыбку", "главном доме", 3);
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
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return  Objects.equals(getLocation(), cat.getLocation()) && Objects.equals(getFood(), cat.getFood()) && Objects.equals( weight, cat.weight);
    }

    @Override
    public String toString() {
        return "Cat{'" + getName() + '\'' +
                ", вес: " + weight + '}';
    }
}
