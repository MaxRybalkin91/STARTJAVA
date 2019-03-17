package com.lesson_2_3_4.arrays.taskcode;

import java.util.Scanner;

/*
Сжать массив, удалив из него все элементы, величина которых находится в интервале [а, b].
Освободившиеся в конце массива элементы заполнить нулями.
*/

public class Task5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = input.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i != numbers.length; i++) {
            System.out.println("Введите число №" + (i+1));
            numbers[i] = input.nextInt();
        }

        System.out.print("Введите первое число удаляемого диапазона:");
        int a = input.nextInt();
        System.out.print("Введите второе число удаляемого диапазона:");
        int b = input.nextInt();

        int i = 0;
        int m = n;

        while (i < m) {
            if (numbers[i] <= b && numbers[i] >= a) {
                m -= 1;
                for(int j = i; j != m; j++) {
                    numbers[j] = numbers[j + 1];
                }
            } else {
                i += 1;
            }
        }

        for(i = m; i != n; i++) {
            numbers[i]=0;
        }
        for(i = 0; i != n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}