package com.pb.smirnova.hw7;

class Tie extends Clothes implements ManClothes{

    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одевает галстук " + getFullInfo());
    }


}
