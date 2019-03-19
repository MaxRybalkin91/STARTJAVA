package com.lesson_2_3_4.arrays.taskcode;

import java.util.Scanner;

/*
Найти среднее арифметическое положительных элементов линейного массива.
*/

public class Task10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int x = input.nextInt();
        int[] numbers = new int[x];

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Введите число №" + (i + 1));
            numbers[i] = input.nextInt();
        }

        System.out.println("Вы ввели в массив следующие числа: ");
        for (int i = 0; i < x; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n");

        int q = 0;
        double sum = 0;

        for (int i = 0; i < x; i++) {
            if (numbers[i] > 0) {
                sum += numbers[i];
                q += 1;
            }
        }
        System.out.print("\n");
        System.out.println("Среднее арифметическое положительных чисел массива = " + (sum/q));


    }
}
