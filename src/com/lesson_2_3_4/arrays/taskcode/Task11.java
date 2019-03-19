package com.lesson_2_3_4.arrays.taskcode;

import java.util.Scanner;

/*
В массиве найти максимальный отрицательный элемент.
Вывести на экран его значение и позицию в массиве.
*/

public class Task11 {

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

        int index = -1;
        for(int i = 0; i < x; i++) {
            if(numbers[i] < 0 && index == -1) {
                index = i;
            } else if(numbers[i] < 0 && numbers[i] > numbers[index]) {
                index = i;
            }
        }

        System.out.println("Максимальный отрицательный элемент массива = " + numbers[index]);
        System.out.println("Его индекс - " + (index+1));
    }
}
