import java.util.Scanner;
class Calculator {
    Scanner input = new Scanner(System.in);
    private int firstInputNumber;
    private char operation;
    private int secondInputNumber;
    private char answer;

    public void runApplication() {
        System.out.println("Введите первое число");
        firstInputNumber = input.nextInt();
        System.out.println("Введите символ математической операции");
        operation = input.next().charAt(0);
        System.out.println("Введите второе число");
        secondInputNumber = input.nextInt();
    }

    public int getFirstNumber() {
        return firstInputNumber;
    }

    public char getOperation() {
        return operation;
    }

    public int getSecondNumber() {
        return secondInputNumber;
    }

    public String application() {
        String application = ("" + firstInputNumber + operation + secondInputNumber + "=");
        return application;
    }

    public void plus() {
        int result = (firstInputNumber + secondInputNumber);
        System.out.println(application() + result);
    }

    public void minus() {
        int result = (firstInputNumber - secondInputNumber);
        System.out.println(application() + result);
    }

    public void times() {
        int result = (firstInputNumber * secondInputNumber);
        System.out.println(application() + result);
    }

    public void divide() {
        double result = ((double) firstInputNumber / secondInputNumber);
        System.out.println(application() + result);
    }

    public void noNull() {
        System.out.println("Некоректный ввод чисел!");
    }

    public void powerplus() {
        int result = firstInputNumber;
        for (int i = 1; i < secondInputNumber; i++) {
            result *= firstInputNumber;
        }
        System.out.println(application() + result);
    }

    public void powerminus() {
        double result = firstInputNumber;
        for (int i = 0; i >= secondInputNumber; i--) {
            result /= firstInputNumber;
        }
        System.out.println(application() + result);
    }

    public void module() {
        int result = (firstInputNumber % secondInputNumber);
        System.out.println(application() + result);
    }

    public void noOperation() {
        System.out.println("Вы ввели отсутствующую операцию!");
    }

    public void askAnswer() {
        System.out.println("Хотите продолжить? y/n");
    }

    public void setAnswer() {
        answer = input.next().charAt(0);
    }

    public char getAnswer() {
        return answer;
    }

    public void stopApplication() {
        System.out.println("Работа калькулятора завершена!");
    }
}
