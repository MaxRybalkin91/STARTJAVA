package com.lesson_2_3_4.arrays.taskcode;

import java.util.Scanner;

/*
Найти сумму всех цифр целочисленного массива.
Например, если дан массив [12, 104, 81], то сумма всех его цифр будет равна 1 + 2 + 1 + 0 + 4 + 8 + 1 = 17.
*/

public class Task8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int x = input.nextInt();
        int[] numbers = new int[x];

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Введите число №" + (i + 1));
            numbers[i] = input.nextInt();
        }

        int sum = 0;
        System.out.println("Вы ввели в массив следующие числа: ");

        for (int i = 0; i < x; i++) {
            numbers[i] /= (numbers[i] % 10);
            System.out.print(numbers[i] + " ");
            int num = numbers[i];
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }
        System.out.print("\n" + "Сумма всех цифр массива = " + sum);
    }
}
