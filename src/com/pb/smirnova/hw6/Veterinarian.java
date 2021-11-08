package com.pb.smirnova.hw6;

public class Veterinarian {

    public void treatAnimal(Animal animal){
        System.out.println(animal.getName() + " находится в " + animal.getLocation() + " и ест " + animal.getFood());
    }
}
