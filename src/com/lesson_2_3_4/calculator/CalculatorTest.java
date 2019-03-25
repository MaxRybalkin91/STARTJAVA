package com.lesson_2_3_4.calculator;

import java.util.Scanner;
class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer;

        do {
            System.out.println("Введите первое число, символ математической операции и второе число(через пробелы):");
            String equation = scan.nextLine();
            System.out.println(calculator.calculate(equation));

            do {
                System.out.println("Хотите продолжить? Д/Н");
                answer = scan.nextLine();
            } while (answer.charAt(0) != 'Д' && answer.charAt(0) != 'Н');
        } while (answer.charAt(0) != 'Н');

        System.out.println("Работа калькулятора завершена");
    }
}