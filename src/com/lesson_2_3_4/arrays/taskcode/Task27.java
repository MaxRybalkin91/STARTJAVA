package com.lesson_2_3_4.arrays.taskcode;

/*
Заполнить массив вещественных чисел вводом с клавиатуры.
Посчитать сумму и произведение элементов массива.
Вывести на экран сам массив, полученные сумму и произведение его элементов.
*/

public class Task27 {
    public static void main(String[] args) {
        int x = 10;
        int[] numbers = new int[x];

        for (int i = 0; i != numbers.length; i++) {
            numbers[i] = (int) (Math.random()*100);
        }

        System.out.println("В массиве следующие числа:");
        for (int i = 0; i != numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int sum = 0;
        int mult = 1;
        for(int i=0; i < numbers.length; i++) {
            sum += numbers[i];
            mult *= numbers[i];
        }
        System.out.println("Сумма элементов массива = " + sum);
        System.out.println("Произведение элементов массива = " + mult);
    }
}
