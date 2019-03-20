package com.lesson_2_3_4.arrays.taskcode;

import java.util.Scanner;

/*
Заполнить одномерный массив случайными числами.
Найти и вывести на экран наибольший его элемент и порядковый номер этого элемента.
*/

public class Task17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int x = input.nextInt();
        int[] numbers = new int[x];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random()*100);
            System.out.println("Число №" + (i + 1) + " = " + numbers[i] );
        }

        System.out.println("Вы ввели в массив следующие числа:");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int max = 0;
        for(int i = 0; i != numbers.length; i++) {
            if(numbers[i] > numbers[max])
                max = i;
        }
        System.out.println("Максимальный элемент массива = " + numbers[max]);
        System.out.println("Его порядковый номер = " + (max + 1));
    }
}