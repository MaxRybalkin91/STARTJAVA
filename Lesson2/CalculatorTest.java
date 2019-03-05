class CalculatorTest {
    public static void main(String[] args) {
       char yes = 'y';
       char no = 'n';

        Calculator calculator = new Calculator();
        do {
            calculator.setFirstNumber();
            calculator.setOperation();
            calculator.setSecondNumber();

            switch(calculator.getOperation()) {
                case '+' :
                    calculator.plus();
                    break;
                case '-' :
                    calculator.minus();
                    break;
                case '*' :
                    calculator.times();
                    break;
                case '/' :
                    if (calculator.getSecondNumber() == 0) {
                        System.out.println("Деление на ноль невозможно!");
                        break;
                    } else {
                        calculator.divide();
                    }
                    break;
                case '%' :
                    calculator.module();
                    break;
                case '^' :
                    if (calculator.getSecondNumber() > 0) {
                        calculator.powerplus();
                    } else {
                        calculator.powerminus();
                    }
                    break;
            }

            do {
                calculator.setAnswer();
            } while (calculator.getAnswer() != no && calculator.getAnswer() != yes);

        } while (calculator.getAnswer() != no);

        System.out.println("Работа калькулятора завершена");
    }
}
