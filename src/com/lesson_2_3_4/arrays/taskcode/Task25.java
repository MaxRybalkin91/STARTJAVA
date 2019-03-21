package com.lesson_2_3_4.arrays.taskcode;

/*
В диапазоне натуральных чисел определить, сколько из них кратны 10.
 */

public class Task25 {
    public static void main(String[] args) {
        int[] numbers = new int[20];

        for (int i = 0; i != numbers.length; i++) {
            numbers[i] = (int) (Math.random()*100);
        }

        System.out.println("В массиве следующие числа:");
        for (int i = 0; i != numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Следующие числа кратны 10:");

        for (int i = 0; i != numbers.length; i++) {
            if (numbers[i] % 10 == 0 && numbers[i] != 0) {
                System.out.println(i + " = " + numbers[i]);
            }
        }
    }
}
