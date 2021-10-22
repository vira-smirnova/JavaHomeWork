package com.pb.smirnova.hw3;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        System.out.print("Угадайте задуманное число от 1 до 100. ");
        System.out.println("Для выхода из программы введите - 0.");

        final int MAX_ATTEMPT = 10; // Допустимое количество попыток.
        int a = 0; // Начальное значение диапазона - "от"
        int b = 100; // Конечное значение диапазона - "до"
        int number = a + (int) (Math.random() * b); // Задуманное число

        int count = 0;           // Счетчик попыток.

        Scanner scan = new Scanner(System.in);

        while (count < MAX_ATTEMPT) {
            count++;
            System.out.print("Попытка " + count + ":");
            int x = scan.nextInt();

            if (x == 0) {
                break;
            }

            if (x > 0 && x < 101) {
                if (x > number) {
                    System.out.println("Задуманное число меньше " + x);
                }
                else if ( x < number) {
                    System.out.println("Задуманное число больше " + x);
                }
                if (number == x) {
                    System.out.println("Поздравляем, Вы угадали с " + count + " попытки!");
                    break;
                }
            } else {
                System.out.println("Необходимо ввести целое число от 1 до 100");
            }
        }

        System.out.println("Конец игры!");
    }
}
