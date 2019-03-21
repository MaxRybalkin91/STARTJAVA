package com.lesson_2_3_4.arrays.taskcode;

import java.util.Scanner;

/*
Заполнить вводом с клавиатуры численный массив за исключением последнего элемента, вывести его на экран.
Запросить еще одно значение и его позицию в в массиве.
Вставить указанное число в заданную позицию, подвинув элементы после него.
*/

public class Task22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int x = input.nextInt();
        int[] numbers = new int[x];
        int count = 0;
        int number = 0;

        for(int i = 0; i < (x-1); i++) {
            System.out.println("Введите число №" + (i+1));
            numbers[i] = input.nextInt();
            count++;
        }

        System.out.println("Вы ввели в массив следующие числа:");
        for(int i = 0; i < (x-1); i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for(int i = (count-1); i != count; i++) {
            System.out.println("Введите число №" + (count+1) + "(последнее)");
            numbers[count] = input.nextInt();
            number = numbers[count];
        }

        System.out.println("Введите номер индекса для замены:");
        int j = input.nextInt();

        for(int i = (x-2); i >= j-1; i--) {
            numbers[i + 1] = numbers[i];
        }
        numbers[j-1] = number;

        for(int i = 0; i < x; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}