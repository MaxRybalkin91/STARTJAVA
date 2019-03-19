package com.lesson_2_3_4.arrays.taskcode;

import java.util.Scanner;

/*
В массиве случайных целых чисел поменять местами минимальный и максимальный элементы.
*/

public class Task13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int x = input.nextInt();
        int[] numbers = new int[x];

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Введите число №" + (i + 1));
            numbers[i] = input.nextInt();
        }

        int min = 0;
        int max = 0;

        System.out.println("Вы ввели в массив следующие числа: ");
        for(int i = 0; i < x; i++) {
            System.out.print(numbers[i] + " ");
            if (numbers[i] < numbers[min]) {
                min = i;
            } else if (numbers[i] > numbers[max]){
                max = i;
            }
        }
        System.out.print("\n");
        System.out.println("Cейчас минимальное число = " + numbers[min] + " , а максимальное = " + numbers[max]);

        int b = numbers[min];
        numbers[min] = numbers[max];
        numbers[max] = b;
        System.out.println("После перестановки минимальное число = " + numbers[min] + " , а максимальное = " + numbers[max]);
    }
}