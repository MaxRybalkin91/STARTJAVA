package com.lesson_2_3_4.arrays.taskcode;

/*
В массиве, содержащем положительные и отрицательные целые числа,
вычислить сумму четных положительных элементов.
*/

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int x = input.nextInt();

        int[] numbers = new int[x];
        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Введите число №" + (i+1));
            numbers[i] = input.nextInt();
        }

        for(int i = 0; i != numbers.length; i++) {
            if(numbers[i] > 0 & (numbers[i] % 2) == 0) {
                sum += numbers[i];
            }
        }
        System.out.println("Сумма положительных четных чисел массива = " + sum);
    }
}
