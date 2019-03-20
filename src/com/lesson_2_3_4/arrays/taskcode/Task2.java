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

        for(int i = 0; i != numbers.length; i++) {
            System.out.println("Введите число №" + (i+1));
            numbers[i] = input.nextInt();
        }

        int max = 0;
        for(int i=2; i < x; i += 2) {
            if (numbers[i] > numbers[max]) {
                max = i;
            }
        }
        System.out.println("В четном индексе " + (max) + " содержится максимальное число " + numbers[max]);
    }
}
