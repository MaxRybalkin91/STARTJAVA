package com.lesson_2_3_4.arrays.taskcode;

/*
Заполнить массив случайными положительными и отрицательными числами таким образом, чтобы все числа по модулю были разными.
Это значит, что в массиве не может быть ни только двух равных чисел, но не может быть двух равных по модулю.
В полученном массиве найти наибольшее по модулю число.
*/

import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int x = input.nextInt();
        int[] numbers = new int[x];
        int i = 0;

        while(i != numbers.length) {
            System.out.println("Введите число №" + (i+1));
            numbers[i] = input.nextInt();
            int m = numbers[i];

            int f = 1;
            for(int j=0; j < i; j++) {
                if(Math.abs(numbers[j]) == Math.abs(m)) {
                    f = 0;
                    System.out.println("Ошибка! Такое число уже есть в массиве, в т.ч. по модулю!");
                    break;
                }
            }
                if(f == 1) {
                numbers[i] = m;
                i += 1;
            }
        }

        int j = 0;
        for(i = 0; i < x; i++) {
            System.out.print(numbers[i] + " ");
            if(Math.abs(numbers[i]) > Math.abs(numbers[j])) {
                j = i;
            }
        }

        System.out.println("\n" + "Максимальный по модулю элемент равен " + numbers[j]);

    }
}