class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        for (; calculator.getAnswer() != 'n' ;) {
            calculator.runApplication();

            switch (calculator.getOperation()) {
                case '+':
                    calculator.plus();
                    break;
                case '-':
                    calculator.minus();
                    break;
                case '*':
                    calculator.times();
                    break;
                case '/':
                    if (calculator.getSecondNumber() == 0) {
                        calculator.noNull();
                    } else {
                        calculator.divide();
                    }
                    break;
                case '%':
                    calculator.module();
                    break;
                case '^':
                    if (calculator.getFirstNumber() == 0 & calculator.getSecondNumber() == 0) {
                        calculator.noNull();
                    } else if (calculator.getSecondNumber() > 0) {
                        calculator.powerplus();
                    } else {
                        calculator.powerminus();
                    }
                    break;
                default:
                    calculator.noOperation();
            }
            for (; calculator.getAnswer() != 'n' && calculator.getAnswer() != 'y';) {
                calculator.askAnswer();
                calculator.setAnswer();
            }
        }
        calculator.stopApplication();
    }
}
