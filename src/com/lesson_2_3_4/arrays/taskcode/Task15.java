package com.lesson_2_3_4.arrays.taskcode;

import java.util.Scanner;

/*
В массиве найти элементы, которые в нем встречаются только один раз, и вывести их на экран.
То есть найти и вывести уникальные элементы массива.
*/

public class Task15 {

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

        System.out.println("Следующие числа не повторяются:");
        for(int i = 0; i < x; i++) {
            int f = 1;
            for(int j = 0; j < x; j++) {
                if(numbers[i] == numbers[j] && i != j) {
                    f = 0;
                    break;
                }
            }

            if(f == 1) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}