package com.pb.smirnova.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int operand1 = scan.nextInt();

        System.out.println("Введите знак:");
        String symbol = scan.next();

        System.out.println("Введите целое число:");
        int operand2 = scan.nextInt();

        switch (symbol) {
            case "+":
                System.out.println("Результат: " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Результат: " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Результат: " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.print("Ошибка: На ноль делить нельзя!");
                }
                else { System.out.println("Результат: " + (operand1 / operand2));}
                break;
            default:
                System.out.println("Операция не найдена");
        }
    }
    }
