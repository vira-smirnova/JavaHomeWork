package com.pb.smirnova.hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class VetСlinic {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Horse horse = new Horse();

        Animal[] animals = { cat, dog, horse };

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(horse);
        System.out.println("-----------------------------");

        cat.sleep();
        cat.makeNoise();

        dog.sleep();
        dog.makeNoise();

        horse.sleep();
        horse.makeNoise();
        System.out.println("-----------------------------");

        Class <?> vetClass = Class.forName("com.pb.smirnova.hw6.Veterinarian");
        Constructor constrw = vetClass.getConstructor(new Class[]{});
        Object obj = constrw.newInstance();

        for (int i = 0; i < animals.length; i++)
        ((Veterinarian) obj).treatAnimal(animals[i]);

        System.out.println("-----------------------------");

        System.out.println("eq cat & dog: " + cat.equals(dog));
        System.out.println("eq cat & horse: " + cat.equals(horse));

        System.out.println("hashCode cat: " + cat.hashCode());
        System.out.println("hashCode dog: " + dog.hashCode());
        System.out.println("hashCode horse: " + horse.hashCode());






    }
}
