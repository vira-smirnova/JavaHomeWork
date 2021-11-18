package com.pb.smirnova.hw7;

public class Atelier {
    public static void main(String[] args) {
        //dressMan(Clothes[] clothes);
        //dressWomen(Clothes[] clothes);

        Pants pantsMan = new Pants(Size.L, 900.00, "серый", "M");
        Tshirt tshirtMan = new Tshirt(Size.M, 599.99, "белый", "M");
        Tie  tie  = new Tie(Size.M, 700.00, "серый");
        Pants pantsWom = new Pants(Size.XXS, 1100.00, "синий","W");
        Tshirt tshirtWom = new Tshirt(Size.XXS, 650.00, "белый", "W");
        Skirt  skirt  = new Skirt (Size.S, 699.50, "красный");

        Clothes[] clothes = {pantsMan, tshirtMan, tie, pantsWom,tshirtWom, skirt};


        dressMan(clothes);
        System.out.println("--------------------------");
        dressWomen(clothes);
    }

    private static void dressMan(Clothes[] clothes){
        for (Clothes cloth: clothes){
            if (cloth instanceof ManClothes) {
                if (cloth.getSign() == "M" || cloth.getSign() == null){
                ((ManClothes) cloth).dressMan();
                }
            }
        }
    }
    private static void dressWomen(Clothes[] clothes){
        for (Clothes cloth: clothes){
            if (cloth instanceof WomenClothes) {
                if (cloth.getSign() == "W"|| cloth.getSign() == null) {
                    ((WomenClothes) cloth).dressWomen();
                }
            }
        }
    }
}
