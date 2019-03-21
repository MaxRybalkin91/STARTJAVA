package com.lesson_2_3_4.arrays.taskcode;

/*
Заполнить массив случайными положительными и отрицательными целыми числами.
Вывести его на экран. Удалить из массива все отрицательные элементы и снова вывести.
 */

public class Task26 {
    public static void main(String[] args) {
        int x = 10;
        int[] numbers = new int[x];

        for (int i = 0; i != numbers.length; i++) {
            numbers[i] = (int) (Math.random()*100 - 50);
        }

        System.out.println("В массиве следующие числа:");
        for (int i = 0; i != numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int i = 0;
        int m = x;
        while (i < m) {
            if (numbers[i] < 0) {
                m -= 1;
                for (int j = i; j < m; j++) {
                    numbers[j] = numbers[j + 1];
                }
            } else {
                i += 1;
            }
        }
        System.out.println("Удаляем отрицательные числа...");
        for (i=0; i<m; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
