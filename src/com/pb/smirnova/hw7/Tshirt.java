package com.pb.smirnova.hw7;

class Tshirt extends Clothes implements ManClothes, WomenClothes {

    public Tshirt(Size size, double price, String color, String sing) {
        super(size, price, color, sing);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одевает футболку " + getFullInfo());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одевает футболку " + getFullInfo());
    }


    //Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,
}
