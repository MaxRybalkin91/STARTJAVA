package com.lesson_2_3_4.arrays.taskcode;

/*
Сгенерировать 20 случайных целых чисел в диапазоне от -5 до 4, записать их в ячейки массива.
Посчитать сколько среди них положительных, отрицательных и нулевых значений.
Вывести на экран элементы массива и посчитанные количества.
*/

public class Task28 {
    public static void main(String[] args) {
        int x = 20;
        int[] numbers = new int[x];

        for (int i = 0; i != numbers.length; i++) {
            numbers[i] = (int) (Math.random()*10-4);
        }

        System.out.println("В массиве следующие числа:");
        for (int i = 0; i != numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int neg = 0;
        int pos = 0;
        int zero = 0;
        for(int i=0; i < x; i++) {
            if (numbers[i] > 0) {
                pos += 1;
            } else if (numbers[i] < 0) {
                neg += 1;
            } else {
                zero += 1;
            }
        }
        System.out.println("Положительных - " + pos);
        System.out.println("Отрицательных - " + neg);
        System.out.println("Равных нулю - " + zero);
    }
}
