import java.util.Scanner;
class CalculatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();

        do {
            System.out.println("Введите первое число");
            calculator.setFirstNumber(input.nextInt());
            System.out.println("Введите символ математической операции");
            calculator.setOperation(input.next().charAt(0));
            System.out.println("Введите второе число");
            calculator.setSecondNumber(input.nextInt());

            calculator.chooseOperation();

            do{
                System.out.println("Хотите продолжить? y/n");
                calculator.setAnswer(input.next().charAt(0));
            } while (calculator.getAnswer() != 'n' && calculator.getAnswer() != 'y');
        } while (calculator.getAnswer() != 'n');

        System.out.println("Работа калькулятора завершена");
    }
}