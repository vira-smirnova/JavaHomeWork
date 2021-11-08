package com.pb.smirnova.hw6;

public class Dog extends Animal{

    public Dog() {
        super("Собака", "косточку", "будке", 10);
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
                ", вес: " + weight + '}';
    }
}
