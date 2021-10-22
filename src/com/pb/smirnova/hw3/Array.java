package com.pb.smirnova.hw3;
import java.util.Arrays;
import java.util.Scanner;
/*Создайте класс Array в пакете hw3. Программа должна позволить пользователю ввести одномерный массив целых чисел размерностью 10 элементов.
        1) Вывести на экран введенный массив.
        2) Подсчитать сумму всех элементов массива и вывести ее на экран.
        3) Подсчитать и вывести на экран количество положительных элементов.
        4) Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком.
        (https://en.wikipedia.org/wiki/Bubble_sort)
        5) Вывести на экран отсортированный массив.
 */
public class Array {

    public static void main(String[] args) {
        int count = 1;
        int[] array = new int[10];
        int summ = 0;
        int numbPosit = 0;
        Scanner scan = new Scanner(System.in);
        int n = array.length;


        for (int i = 0; i < array.length; i++) {
            //System.out.println(array[i]);
            System.out.print("Введите элемент массива " + count + ":");
            int x = scan.nextInt();
            array[i] = x;
            count++;
            summ += x;

            if (array[i] > 0){
                numbPosit++;
            }
        }
        System.out.println("-------------------------------------------");
    //-----------1) Вывести на экран введенный массив.
        System.out.println("Вы ввели массив: " + Arrays.deepToString(new int[][]{array}));
    //------------2) Подсчитать сумму всех элементов массива и вывести ее на экран.
        System.out.println("Сумма всех элементов массива: " + summ);
    //------------3) Подсчитать и вывести на экран количество положительных элементов.
        System.out.println("Количество положительных элементов: " + numbPosit);

    //------------4) Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком.
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }
        System.out.println("Массив после сортировки: " + Arrays.deepToString(new int[][]{array}));

    }
}
