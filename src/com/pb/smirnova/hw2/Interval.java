package com.pb.smirnova.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int operand = scan.nextInt();

        if (operand >= 0 && operand <= 14) {
            System.out.println("Вы ввели цифру в диапазоне от 0 до 14");
        } else if (operand >= 15 && operand <= 35) {
            System.out.println("Вы ввели цифру в диапазоне от 15 до 35");
        } else if (operand >= 36 && operand <= 50) {
            System.out.println("Вы ввели цифру в диапазоне от 36 до 50");
        } else if (operand >= 51 && operand <= 100) {
            System.out.println("Вы ввели цифру в диапазоне от 51 до 100");
        }
        else {
                System.out.println("Число не входит в запрограммированный диапазон!");
        }
    }
}
