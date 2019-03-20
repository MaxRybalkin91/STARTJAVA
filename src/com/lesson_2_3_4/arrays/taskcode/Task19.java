package com.lesson_2_3_4.arrays.taskcode;

/*
Во втором массиве сохранить индексы четных элементов первого массива.
Например, если дан массив со значениями 8, 3, 15, 6, 4, 2, то во второй массив надо заполнить
значениями 1, 4, 5, 6 (или 0, 3, 4, 5 - если индексация начинается с нуля), т.к.
именно в этих позициях первого массива стоят четные числа.
*/

import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int x = input.nextInt();
        int[] numbers = new int[x];
        int[] even = new int[x];

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Введите число №" + (i + 1));
            numbers[i] = input.nextInt();
        }

        System.out.println("Вы ввели в массив следующие числа:");
        for(int i = 0; i < x; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int j = 0;
        for(int i = 0; i < x; i++) {
            if (numbers[i] % 2 == 0) {
                even[j] = i;
                j += 1;
            }
        }
        System.out.println("Номера четных элементов массива: ");
        for(int i = 0; i < j; i++) {
            System.out.print((even[i]+1) + " ");
        }
    }
}