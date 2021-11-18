package com.pb.smirnova.hw7;

abstract class Clothes{
    protected Size size;
    protected double price;
    protected String color;
    protected String sign;

    public Clothes(Size size, double price, String color, String sign) {
        this.size = size;
        this.price = price;
        this.color = color;
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

    public Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }



    public String getFullInfo(){
        return "размер: " + size.name() +
                ", европейский размер: " + size.getEuroSize() +
                ", описание: " + size.getDescription() +
                ", цвет: " + color +
                ", цена: " + price;
    }

}
