package com.lesson_2_3_4.calculator;

import java.util.Scanner;
class CalculatorTest {
    public static void main(String[] args) {
        char answer;

        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();

        do {
            System.out.println("Введите первое число, символ математической операции и второе число:");
            calculator.calculate();

            do {
                System.out.println("\n" + "Хотите продолжить? y/n");
                answer = input.next().charAt(0);
            } while (answer != 'n' && answer != 'y');
        } while (answer != 'n');

        System.out.println("Работа калькулятора завершена");
    }
}
