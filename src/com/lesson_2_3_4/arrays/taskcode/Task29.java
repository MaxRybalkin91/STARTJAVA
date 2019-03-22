package com.lesson_2_3_4.arrays.taskcode;

/*
Заполнить один массив случайными числами, другой - введенными с клавиатуры числами,
в ячейки третьего записать суммы соответствующих ячеек первых двух.
Вывести содержимое массивов на экран.
*/

public class Task29 {
    public static void main(String[] args) {
        int x = 10;
        int[] numbers = new int[x];

        for (int i = 0; i != numbers.length; i++) {
            numbers[i] = (int) (Math.random()*100);
        }

        System.out.println("В произвольном массиве следующие числа:");
        for (int i = 0; i != numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int[] numbers2 = new int[x];

        for(int i = 0; i < numbers2.length; i++) {
            numbers2[i] = (int) (Math.random()*100);
            System.out.println("Число №" + (i + 1) + " = " + numbers2[i] );
        }

        System.out.println("Вы ввели в массив следующие числа:");
        for(int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }
        System.out.println();

        int[] numbers3 = new int[x];

        for(int i=0; i < x; i++) {
            numbers3[i] = numbers[i] + numbers2[i];
        }

        System.out.println("В суммированном массиве следующие числа:");
        for (int i = 0; i != numbers3.length; i++) {
            System.out.print(numbers3[i] + " ");
        }
        System.out.println();
    }
}
