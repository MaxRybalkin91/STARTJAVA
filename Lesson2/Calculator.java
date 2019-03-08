class Calculator {
    private int firstInputNumber;
    private char operation;
    private int secondInputNumber;

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
                System.out.println(printEquation() + (firstInputNumber + secondInputNumber));
                break;
            case '-':
                System.out.println(printEquation() + (firstInputNumber - secondInputNumber));
                break;
            case '*':
                System.out.println(printEquation() + (firstInputNumber * secondInputNumber));
                break;
            case '/':
                if (secondInputNumber == 0) {
                    System.out.println("На ноль делить нельзя!");
                } else {
                    System.out.println(printEquation() + ((double) firstInputNumber / secondInputNumber));
                }
                break;
            case '%':
                System.out.println(printEquation() + (firstInputNumber % secondInputNumber));
                break;
            case '^':
                if (firstInputNumber == 0 & secondInputNumber == 0) {
                    System.out.println("Некоректный ввод чисел!");
                } else if (secondInputNumber > 0) {
                    int powerPlus = firstInputNumber;
                    for (int i = 1; i < secondInputNumber; i++) {
                        powerPlus *= firstInputNumber;
                    }
                    System.out.println(printEquation() + powerPlus);
                } else {
                    double powerMinus = firstInputNumber;
                    for (int i = 0; i >= secondInputNumber; i--) {
                        powerMinus /= firstInputNumber;
                    }
                    System.out.println(printEquation() + powerMinus);
                }
                break;
            default:
                System.out.println("Вы ввели отсутствующую операцию!");
        }
    }

    private String printEquation() {
        return firstInputNumber + " " + operation + " " + secondInputNumber + " = ";
    }
}