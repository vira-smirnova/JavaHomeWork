package com.pb.smirnova.hw7;

class Pants extends Clothes implements ManClothes, WomenClothes{


    public Pants(Size size, double price, String color, String sing) {
        super(size, price, color, sing);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одевает штаны " + getFullInfo());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одевает штаны " + getFullInfo());
    }


}
