package com.pb.smirnova.hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class VetСlinic {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Cat cat = new Cat("Кот", "рыжий");
        cat.setFood("рыбку");
        cat.setLocation("в главном доме");
        cat.weight = 3;

        Cat cat2 = new Cat("Кошечка", "серый");
        cat2.setFood("рыбку и молоко");
        cat2.setLocation("в главном доме");
        cat2.weight = 2;

        Dog dog = new Dog("Собака", "овчарка");
        dog.setFood("косточку");
        dog.setLocation("будке");
        dog.weight = 10;

        Horse horse = new Horse("Лошадь", 10);
        horse.setFood("сено");
        horse.setLocation("конюшне");
        horse.weight = 110;

        Animal[] animals = { cat, cat2, dog, horse };

        System.out.println(cat);
        System.out.println(cat2);
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

        System.out.println("eq cat & cat2: " + cat.equals(cat2));
        System.out.println("eq cat & cat: " + cat.equals(cat));
        System.out.println("eq cat & horse: " + cat.equals(horse));

        System.out.println("hashCode cat: " + cat.hashCode());
        System.out.println("hashCode cat: " + cat2.hashCode());
        System.out.println("hashCode dog: " + dog.hashCode());
        System.out.println("hashCode horse: " + horse.hashCode());






    }
}
