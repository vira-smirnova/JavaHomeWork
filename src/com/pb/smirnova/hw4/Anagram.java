package com.pb.smirnova.hw4;
import java.util.Scanner;
/*
Напишите программу, которая определяет, является ли одна строка анаграммой другой строки.
Обе строки вводит пользователь.
Анаграмма - это слово или фраза, сделанная путем переноса букв другого слова или фразы.
Программа должна игнорировать пробелы и знаки препинания.
Пример анаграмм:
Аз есмь строка, живу я, мерой остр. -> За семь морей ростка я вижу рост.
Я в мире — сирота. -> Я в Риме — Ариост.
При выполнении задания использовать метод(ы).
 */
public class Anagram {

    static void bubl(char[] abc){
        //int n = abc.length;
        for (int j = 0; j < abc.length; j++) {
            for (int i = j + 1; i < abc.length; i++) {
                if (abc[i] > (abc[j])) {
                    char a = abc[j];
                    abc[j] = abc[i];
                    abc[i] = a;
                }
            }
        }
    }
    static boolean function(String abc, String abc2) {
        String ddd = abc.replaceAll("[^\\p{L}\\p{N}]+", "").toUpperCase();
        String ddd2 = abc2.replaceAll("[^\\p{L}\\p{N}]+", "").toUpperCase();

        char[] chars = ddd.toCharArray();
        bubl(chars);
        int n = chars.length;

        char[] chars2 = ddd2.toCharArray();
        bubl(chars2);
        int n2 = chars2.length;

        if (n != n2){
            return false;
        }

        for(int i = 0; i < chars.length; i++){
            if(chars[i] != chars2[i]){
                for (int j = 0; j < chars2.length; j++)
                        if(chars[i] != chars2[j]) {
                            return false;
                        }
                    }
           }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Веедите первое предлжение: ");
        String letter = scan.nextLine();
        System.out.println("Веедите второе предлжение: ");
        String letter2 = scan.nextLine();

        System.out.println("Введена анаграмма? - " + function(letter, letter2));
    }
}
