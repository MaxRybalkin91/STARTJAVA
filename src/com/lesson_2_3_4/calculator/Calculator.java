package com.lesson_2_3_4.calculator;

import java.util.Scanner;

class Calculator {
    Scanner scan = new Scanner(System.in) ;

    private double result = 0;
    private String ans;
    private String calculation;

    public void calculate() {
        calculation = scan.nextLine();
        String[] parts = calculation.split("");
        int firstNumber = Integer.parseInt(parts[0]);
        String operation = parts[1];
        int secondNumber = Integer.parseInt(parts[2]);

        switch (operation) {
            case "+":
                result = Math.addExact(firstNumber, secondNumber);
                print();
                break;
            case "-":
                result = Math.subtractExact(firstNumber, secondNumber);
                print();
                break;
            case "*":
                result = Math.multiplyExact(firstNumber, secondNumber);
                print();
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("На ноль делить нельзя!");
                } else {
                    result = (firstNumber / secondNumber);
                    print();
                }
                break;
            case "%":
                result = Math.IEEEremainder(firstNumber, secondNumber);
                print();
                break;
            case "^":
                result = Math.pow(firstNumber, secondNumber);
                print();
                break;
            default:
                System.out.println("Вы ввели отсутствующую операцию!");
        }
    }

    private void print() {
        ans = String.valueOf(result);
        System.out.print(calculation + "=" + ans);
    }
}