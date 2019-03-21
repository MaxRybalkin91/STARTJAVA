package com.lesson_2_3_4.arrays.taskcode;

/*
Случайные числа в диапазоне от -5 до 5 разложить по двум массивам: в одни помещать только положительные,
во второй - только отрицательные. Числа, равные нулю, игнорировать.
Вывести на экран все сгенерированные случайные числа и элементы обоих массивов.
*/

import java.util.Scanner;

public class Task21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int x = input.nextInt();
        int[] numbers = new int[x];
        int[] numbers2 = new int[x];
        int min = -5;
        int max = 5;

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * ++max + min);
        }

        System.out.println("Вы ввели в массив следующие числа:");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int j, k, n;
        j = 0;
        k = 0;

        for(int i = 0; i <x ; i++) {
            if (numbers[i] > 0) {
                numbers[j] = numbers[i];
                j += 1;
            } else
            if (numbers[i] < 0) {
                numbers2[k] = numbers[i];
                k += 1;
            }
        }

        System.out.println("Положительные числа массива:");
        for (int i=0; i<j; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n" + "Отрицательные числа массива:");
        for (int i=0; i<k; i++) {
            System.out.print(numbers2[i] + " ");
        }
    }
}