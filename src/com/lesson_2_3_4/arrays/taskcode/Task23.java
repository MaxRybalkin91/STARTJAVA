package com.lesson_2_3_4.arrays.taskcode;

import java.util.Scanner;

/*
Используя сортировку выбором отсортировать элементы массива по возрастанию.
*/

public class Task23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int x = input.nextInt();
        int[] numbers = new int[x];

        for(int i = 0; i < x; i++) {
            System.out.println("Введите число №" + (i+1));
            numbers[i] = input.nextInt();
        }

        System.out.println("Вы ввели в массив следующие числа:");
        for(int i = 0; i < x; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int j = x-1;
        while (j > 0) {
            int id = 0;
            for (int i=1; i <= j; i++) {
                if (numbers[i] > numbers[id]) id = i;
            }
            int b = numbers[id];
            numbers[id] = numbers[j];
            numbers[j] = b;
            j -= 1;
        }

        System.out.println("Отсортированный по возрастанию массив:");
        for(int i = 0; i < x; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}