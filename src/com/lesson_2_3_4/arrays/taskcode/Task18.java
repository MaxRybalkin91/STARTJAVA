package com.lesson_2_3_4.arrays.taskcode;

/*
Создать массив из 20 элементов в диапазоне значений от -15 до 14 включительно.
Определить количество элементов по модулю больших, чем максимальный.
*/

public class Task18 {

    public static void main(String[] args) {
        int[] numbers = new int[20];
        int min = -15;
        int max = 14;

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) ((Math.random() * ++max) + min);
        }

        max = -16;
        System.out.println("Вы ввели в массив следующие числа:");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println();

        int count = 0;
        int abs;
        System.out.println("Модульные числа, которые больше максимального(не модульного): ");
        for (int i = 0; i < numbers.length; i++) {
            if (Math.abs(numbers[i]) > max) {
                count += 1;
                abs = Math.abs(numbers[i]);
                System.out.print(abs + " ");
            }
        }
        System.out.println("\n" + "Максимальный элемент массива(не модульный) = " + max);
        System.out.println("Модульных чисел, больших него - " + count);
    }
}