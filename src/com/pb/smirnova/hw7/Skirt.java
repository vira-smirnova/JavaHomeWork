package com.pb.smirnova.hw7;

class Skirt extends Clothes implements WomenClothes{

    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одевает юбку " + getFullInfo());
    }

}
