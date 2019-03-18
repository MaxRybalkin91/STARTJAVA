package com.lesson_2_3_4.arrays.taskcode;

import java.util.Scanner;

/*
Найти номер минимального по модулю элемента массива.
Например, в массиве [10, -3, -5, 2, 5] минимальным по модулю элементом является число 2.
Его номер 4 (в языках, в которых индексация массивов начинается с нуля, его индекс будет равен 3).
*/

public class Task7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int x = input.nextInt();
        int[] numbers = new int[x];

        for(int i = 0; i != numbers.length; i++) {
            System.out.println("Введите число №" + (i+1));
            numbers[i] = input.nextInt();
        }

        int minNumber = 0;
        double min = Integer.MAX_VALUE;

        for (int i = 0; i < x; i++) {
            if(Math.abs(numbers[i]) < min) {
                min = Math.abs(numbers[i]);
                minNumber = i;
            }
        }

        System.out.println("Номер минимального по модулю элемента равен " + (minNumber + 1));
        System.out.println("Этот минимальный элемент равен " + numbers[minNumber]);
    }
}