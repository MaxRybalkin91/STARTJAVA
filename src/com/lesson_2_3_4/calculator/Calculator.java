package com.lesson_2_3_4.calculator;

class Calculator {
    private String result;

    public String calculate(String calculation) {
        String[] parts = calculation.split(" ");
        int firstNumber = Integer.parseInt(parts[0]);
        String operation = parts[1];
        int secondNumber = Integer.parseInt(parts[2]);

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
                result = "" + ((double) Math.pow(firstNumber, secondNumber));
                break;
            default:
                result = "Вы ввели отсутствующую операцию!";
        }
        return result;
    }
}