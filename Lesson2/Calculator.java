import java.util.Scanner;
class Calculator {
    Scanner input = new Scanner(System.in);
    private int firstInputNumber;
    private char operation;
    private int secondInputNumber;
    private char answer;

    public void setFirstNumber() {
        System.out.println("Введите первое число");
        firstInputNumber = input.nextInt();
    }

    public int getFirstNumber() {
        return firstInputNumber;
    }

    public void setOperation() {
        System.out.println("Введите символ математической операции");
        operation = input.next().charAt(0);
    }

    public char getOperation() {
        return operation;
    }

    public void setSecondNumber() {
        System.out.println("Введите второе число");
        secondInputNumber = input.nextInt();
    }

    public int getSecondNumber() {
        return secondInputNumber;
    }

    public void plus() {
        System.out.println("" + firstInputNumber + operation + secondInputNumber + "=" + (firstInputNumber + secondInputNumber));
    }

    public void minus() {
        System.out.println("" + firstInputNumber + operation + secondInputNumber + "=" + (firstInputNumber - secondInputNumber));
    }

    public void times() {
        System.out.println("" + firstInputNumber + operation + secondInputNumber + "=" + (firstInputNumber * secondInputNumber));
    }

    public void divide() {
        System.out.println("" + firstInputNumber + operation + secondInputNumber + "=" + ((double) firstInputNumber / secondInputNumber));
    }

    public void powerplus() {
        int result = firstInputNumber;
        for (int i = 1; i < secondInputNumber; i++) {
            result *= firstInputNumber;
        }
        System.out.println("" + firstInputNumber + operation + secondInputNumber + "=" + result);
    }

    public void powerminus() {
        double result = firstInputNumber;
        for (int i = 0; i >= secondInputNumber; i--) {
            result /= firstInputNumber;
        }
        System.out.println("" + firstInputNumber + operation + secondInputNumber + "=" + result);
    }

    public void module() {
        System.out.println("" + firstInputNumber + operation + secondInputNumber + "=" + (firstInputNumber % secondInputNumber));
    }

    public void setAnswer() {
        System.out.println("Хотите продолжить? y/n");
        answer = input.next().charAt(0);
    }

    public char getAnswer() {
        return answer;
    }
}
