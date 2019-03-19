package com.lesson_2_3_4.arrays.taskcode;

import java.util.Scanner;

/*
В одномерном массиве найти сумму элементов, находящихся между минимальным и максимальным элементами.
Сами минимальный и максимальный элементы в сумму не включать.
*/

public class Task9 {

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

        int min = 0;
        int max = 0;
        for (int i = 1; i < x; i++) {
            if (numbers[i] < numbers[min]) {
                min = i;
            } else {
                max = i;
            }
        }
        System.out.println("Минимальное число массива = " + numbers[min] + ", максимальное число массива = " + numbers[max]);

        if (min > max) {
            int i = min;
            min = max;
            max = i;
        }

        int sum = 0;
        for (int i = min + 1; i < max; i++) {
            sum += numbers[i];
        }
        System.out.println("Сумма чисел между минимальным и максимальным = " + sum);
    }
}
