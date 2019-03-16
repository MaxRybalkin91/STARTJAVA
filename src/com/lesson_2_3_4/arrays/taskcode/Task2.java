package com.lesson_2_3_4.arrays.taskcode;

/*
В массиве найти максимальный элемент с четным индексом.
*/

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int x = input.nextInt();

        int[] numbers = new int[x];
        int max = numbers[0];

        for(int i = 0; i != numbers.length; i++) {
            System.out.println("Введите число №" + (i+1));
            numbers[i] = input.nextInt();
        }

        for(int i = 0; i != numbers.length & (i % 2) == 0; i++) {
            max = Math.max(max, numbers[i]);
        }
        System.out.println("Максимальное число = " + max);
    }
}
