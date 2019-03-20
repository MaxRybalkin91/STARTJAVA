package com.lesson_2_3_4.arrays.taskcode;

import java.util.Scanner;

/*
Переставить элементы заданного массива в обратном порядке, то есть произвести реверс массива.
*/

public class Task16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int x = input.nextInt();
        int[] numbers = new int[x];

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Введите число №" + (i + 1));
            numbers[i] = input.nextInt();
        }

        System.out.println("Вы ввели в массив следующие числа:");
        for(int i = 0; i < x; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Массив наоборот:");
        for(int i = 0; i < x/2; i++) {
            int b = numbers[i];
            numbers[i] = numbers[x - i - 1];
            numbers[x - i - 1] = b;
        }
        for (int i = 0; i < x; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}