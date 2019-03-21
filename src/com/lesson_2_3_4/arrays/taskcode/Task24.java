package com.lesson_2_3_4.arrays.taskcode;

import java.util.Scanner;

/*
Отсортировать массив, заполненный случайными числами, по возрастанию.
Для сортировки использовать метод "пузырька".
Вывести на экран массив в исходном и отсортированном виде.
*/

public class Task24 {

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

        for (int i=0; i < (x-1); i++) {
            for (int j =0; j < (x-i-1); j++) {
                if (numbers[j] > numbers[j+1]) {
                    int b = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = b;
                }
            }
        }

        System.out.println("Отсортированный по возрастанию массив:");
        for(int i = 0; i < x; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}