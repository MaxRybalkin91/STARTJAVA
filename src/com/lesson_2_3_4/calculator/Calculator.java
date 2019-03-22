package com.lesson_2_3_4.calculator;

class Calculator {
    private int firstInputNumber;
    private char operation;
    private int secondInputNumber;
    private double result;
    private boolean needCalculate = true;

    public void setFirstNumber(int firstInputNumber) {
        this.firstInputNumber = firstInputNumber;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setSecondNumber(int secondInputNumber) {
        this.secondInputNumber = secondInputNumber;
    }

    public void calculate() {
        switch (operation) {
            case '+':
                result = Math.addExact(firstInputNumber , secondInputNumber);
                break;
            case '-':
                result = Math.subtractExact(firstInputNumber, secondInputNumber);
                break;
            case '*':
                result = Math.multiplyExact(firstInputNumber, secondInputNumber);
                break;
            case '/':
                if (secondInputNumber == 0) {
                    System.out.println("На ноль делить нельзя!");
                    needCalculate = false;
                } else {
                    result = (firstInputNumber / secondInputNumber);
                }
                break;
            case '%':
                result = Math.IEEEremainder(firstInputNumber, secondInputNumber);
                break;
            case '^':
                if (firstInputNumber == 0 & secondInputNumber == 0) {
                    System.out.println("Некоректный ввод чисел!");
                    needCalculate = false;
                } else {
                    result = Math.pow(firstInputNumber, secondInputNumber);
                }
                break;
            default:
                System.out.println("Вы ввели отсутствующую операцию!");
                needCalculate = false;
        }

        if(needCalculate) {
            String equation = (firstInputNumber + " "  + operation + " " + secondInputNumber + " " + "=" + " " + result);
            String[] printEquation = equation.split(" ");
            for(int i = 0; i<printEquation.length; i++) {
                System.out.print(printEquation[i]);
            }
            System.out.println();
        }
    }
}