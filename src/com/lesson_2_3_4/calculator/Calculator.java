package com.lesson_2_3_4.calculator;

class Calculator {
    private int firstNumber;
    private String operation;
    private int secondNumber;
    private String result;

    private void setEquation(String calculation) {
        String[] parts = calculation.split(" ");
        firstNumber = Integer.parseInt(parts[0]);
        operation = parts[1];
        secondNumber = Integer.parseInt(parts[2]);
    }

    public String calculate(String calculation) {
        setEquation(calculation);

        switch (operation) {
            case "+":
                result = "" + (Math.addExact(firstNumber, secondNumber));
                break;
            case "-":
                result = "" + (Math.subtractExact(firstNumber, secondNumber));
                break;
            case "*":
                result = "" + (Math.multiplyExact(firstNumber, secondNumber));
                break;
            case "/":
                if (secondNumber == 0) {
                    result = "На ноль делить нельзя!";
                } else {
                    result = "" + ((double) firstNumber / secondNumber);
                }
                break;
            case "%":
                result = "" + (Math.IEEEremainder(firstNumber, secondNumber));
                break;
            case "^":
                result = "" + (Math.pow(firstNumber, secondNumber));
                break;
            default:
                result = "Вы ввели отсутствующую операцию!";
        }
        return result;
    }
}