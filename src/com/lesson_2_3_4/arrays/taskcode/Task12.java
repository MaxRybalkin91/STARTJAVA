package com.lesson_2_3_4.arrays.taskcode;

import java.util.Scanner;

/*
Определить, какое число в массиве встречается чаще всего.
*/

public class Task12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int x = input.nextInt();
        int[] numbers = new int[x];

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Введите число №" + (i + 1));
            numbers[i] = input.nextInt();
        }

        System.out.println("Вы ввели в массив следующие числа: ");
        for(int i = 0; i < x; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n");

        int num = numbers[0];
        int maxFrq = 1;
        for (int i = 0; i < x-1; i++) {
            int frq = 1;
            for(int k = i+1; k < x; k++) {
                if(numbers[i] == numbers[k]) {
                    frq += 1;
                }
            }

            if (frq > maxFrq) {
                maxFrq = frq;
                num = numbers[i];
            }
        }

        System.out.println("В данном массиве " + maxFrq + " раз(а) встречается число " + num);
    }
}