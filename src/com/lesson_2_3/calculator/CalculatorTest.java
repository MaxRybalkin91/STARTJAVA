package com.lesson_2_3.calculator;

import java.util.Scanner;
class CalculatorTest {
    public static void main(String[] args) {
        char answer;
        
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();

        do {
            System.out.println("Введите первое число");
            calculator.setFirstNumber(input.nextInt());
            System.out.println("Введите символ математической операции");
            calculator.setOperation(input.next().charAt(0));
            System.out.println("Введите второе число");
            calculator.setSecondNumber(input.nextInt());

            calculator.calculate();

            do {
                System.out.println("Хотите продолжить? y/n");
                answer = input.next().charAt(0);
            } while (answer != 'n' && answer != 'y');
        } while (answer != 'n');

        System.out.println("Работа калькулятора завершена");
    }
}
