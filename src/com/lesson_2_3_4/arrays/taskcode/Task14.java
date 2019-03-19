package com.lesson_2_3_4.arrays.taskcode;

import java.util.Scanner;

/*
Сдвинуть элементы массива в указанном направлении (влево или вправо) и на указанное число шагов.
Освободившиеся ячейки заполнить нулями. Выводить массив после каждого шага.
*/

public class Task14 {

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

        System.out.println("\n" + "Введите количество сдвигов:");
        System.out.println("(положительное число - сдвиг вправо; отрицательное число - сдвиг влево)");
        int qty = input.nextInt();

        for (int j = 0; j < Math.abs(qty); j++) {
            if(qty < 0) {
                for(int i = 0; i < x-1; i++) {
                    numbers[i] = numbers[i + 1];
                }
                numbers[x-1] = 0;
            } else {
                for(int i = x-1; i > 0; i--) {
                    numbers[i] = numbers[i - 1];
                }
                numbers[0] = 0;
            }

            for(int i = 0; i < x; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
    }
}