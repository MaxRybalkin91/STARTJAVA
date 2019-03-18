package com.lesson_2_3_4.arrays.taskcode;

import java.util.Scanner;

/*
Вычислить сумму модулей элементов массива, расположенных после первого отрицательного элемента.
Например, в массиве [5, 3, -1, 8, 0, -6, 1] первый отрицательный элемент является третьим по счету,
а сумма модулей стоящих после него элементов массива будет составлять 8 + 0 + 6 + 1 = 15.
*/

public class Task6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int x = input.nextInt();
        int[] numbers = new int[x];

        for(int i = 0; i != numbers.length; i++) {
            System.out.println("Введите число №" + (i+1));
            numbers[i] = input.nextInt();
        }

        int negative = -1;
        for(int i = 0; i < x; i++) {
            if (numbers[i] < 0) {
                negative = i;
                break;
            }
        }

        if(negative == -1) {
            System.out.println("Нет отрицательных чисел");
        } else {
            int sum = 0;
            for(int i = negative+1; i < x; i++) {
                sum += Math.abs(numbers[i]);
            }
            System.out.println("Сумма чисел после первого отрицательного " + sum);
        }
    }
}