package com.pb.smirnova.hw6;

public class Horse  extends Animal{

    public Horse() {
        super("Лошадь", "сено", "конюшне", 180);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("иго-го-го");
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println(getFood());
    }

    @Override
    public String toString() {
        return "Horse{'" + getName() + '\'' +
                ", вес: " + weight + '}';
    }
}
