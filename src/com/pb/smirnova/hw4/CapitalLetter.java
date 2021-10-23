package com.pb.smirnova.hw4;
import java.util.Scanner;
/*
Напишите программу, которая принимает строку и переводит первую букву слова в верхний регистр.
Строку должен ввести пользователь.
Пример работы:
Истина — это то, что выдерживает проверку опытом. Эйнштейн А.
Истина — Это То, Что Выдерживает Проверку Опытом. Эйнштейн А.
При выполнении задания использовать метод(ы).
 */
public class CapitalLetter {

    static String function(String abc) {
        return abc;
    }
    static String newFunction(String abc) {
        String result = "";
        result = result + abc.substring(0, 1).toUpperCase(); //первый символ делаем заглавным
        for (int i = 1; i < abc.length(); i++) {
            // смотрим, был ли слева пробел:
            if (" ".equals(abc.substring(i - 1, i)))
                result = result + abc.substring(i, i + 1).toUpperCase();
            else
                result = result + abc.substring(i, i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Веедите любое предлжение: ");
        String letter = scan.nextLine();


        System.out.println(function(letter)); // 1)
        System.out.println(newFunction(letter)); //2)

    }
}
