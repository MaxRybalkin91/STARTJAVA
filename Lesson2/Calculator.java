class Calculator {
    private int firstInputNumber;
    private char operation;
    private int secondInputNumber;
    private char answer;

    public void setFirstNumber(int firstInputNumber) {
        this.firstInputNumber = firstInputNumber;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setSecondNumber(int secondInputNumber) {
        this.secondInputNumber = secondInputNumber;
    }

    public String textOfOperation() {
        String equation = ("" + firstInputNumber + operation + secondInputNumber + "=");
        return equation;
    }

    public void chooseOperation() {
        switch (operation) {
            case '+':
                System.out.println(textOfOperation() + (firstInputNumber + secondInputNumber));
                break;
            case '-':
                System.out.println(textOfOperation() + (firstInputNumber - secondInputNumber));
                break;
            case '*':
                System.out.println(textOfOperation() + (firstInputNumber * secondInputNumber));
                break;
            case '/':
                if (secondInputNumber == 0) {
                    System.out.println("Некоректный ввод чисел!");
                } else {
                    System.out.println(textOfOperation() + ((double) firstInputNumber / secondInputNumber));
                }
                break;
            case '%':
                System.out.println(textOfOperation() + (firstInputNumber % secondInputNumber));
                break;
            case '^':
                if (firstInputNumber == 0 & secondInputNumber == 0) {
                    System.out.println("Некоректный ввод чисел!");
                } else if (secondInputNumber > 0) {
                    int powerPlus = firstInputNumber;
                    for (int i = 1; i < secondInputNumber; i++) {
                        powerPlus *= firstInputNumber;
                    }
                    System.out.println(textOfOperation() + powerPlus);
                } else {
                    double powerMinus = firstInputNumber;
                    for (int i = 0; i >= secondInputNumber; i--) {
                        powerMinus /= firstInputNumber;
                    }
                    System.out.println(textOfOperation() + powerMinus);
                }
                break;
            default:
                System.out.println("Вы ввели отсутствующую операцию!");
        }
    }

    public void setAnswer(char answer){
        this.answer = answer;
    }

    public char getAnswer () {
        return answer;
    }
}
