package com.lesson_2_3_4.arrays.taskcode;

/*
В одномерном массиве целых чисел определить два наименьших элемента.
Они могут быть как равны между собой (оба являться минимальными), так и различаться.
*/

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int x = input.nextInt();

        int[] numbers = new int[x];

        for(int i = 0; i != numbers.length; i++) {
            System.out.println("Введите число №" + (i+1));
            numbers[i] = input.nextInt();
        }

        int min1 = numbers[0];
        int min2 = numbers[0];
        boolean find = false;
        boolean flag = true;

        while(flag) {
            for(int i = 0; i < numbers.length; i++) {
                if (numbers[i] < min1) {
                    find = true;
                    min2 = min1;
                    min1 = numbers[i];
                } else if (numbers[i] < min2) {
                    find = true;
                    min2 = numbers[i];
                }
            }

            if(find) {
                flag = false;
            } else {
                min1 = numbers[1];
                min2 = numbers[1];
            }
        }

        System.out.println("Первый минимум = " + min1);
        System.out.println("Второй минимум = " + min2);
    }
}
