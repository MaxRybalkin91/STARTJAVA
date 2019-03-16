package com.lesson_2_3_4.arrays.taskcode;

/*
Найти в массиве те элементы, значение которых меньше среднего арифметического,
взятого от всех элементов массива.
*/

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int x = input.nextInt();

        int[] numbers = new int[x];

        for(int i = 0; i != numbers.length; i++) {
            System.out.println("Введите число №" + (i+1));
            numbers[i] = input.nextInt();
        }

        double sum = 0;
        for(int i = 0; i != numbers.length; i++) {
            sum += numbers[i];
        }

        double average = sum / numbers.length;
        for(int i = 0; i != numbers.length; i++) {
            if(numbers[i] < average) {
                System.out.println(numbers[i]);
            }
        }
    }
}
