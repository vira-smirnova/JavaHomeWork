package com.pb.smirnova.hw7;

public enum Size {

    XXS("XXS"),
    XS("XS"),
    S("S"),
    M("M"),
    L("L");

    private String size;
    private String description;
    private String euroSize;

    Size(String size) {
        this.size = size;
    }

    Size(String description, String euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    public void getDescription(){
        if(size == "XXS"){
            System.out.println("Детский размер");
        }
        else {
            System.out.println("Взрослый размер");
        }
    }
    public int getEuroSize(){
        int sizeInt = 0;
          switch (size) {
            case "XXS":
                return 32;
            case "XS":
                return 34;
            case "S":
                return 36;
            case "M":
                return 38;
            case "L":
                return 40;
            default:
                System.out.println("NULL");
        }
        System.out.println("Ваш размер " + sizeInt);
        return sizeInt;
    }

    @Override
    public String toString() {
        return size;
    }
}
