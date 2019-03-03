class Calculator {
    public static void main(String[] args) {
        int firstInputNumberh = 5; //введенное значение
        char operation = '+';
        //char operation = '-'; вариант введенной операции
        //char operation = '*'; вариант введенной операции
        //char operation = '/'; вариант введенной операции
        //char operation = '^'; вариант введенной операции
        //char operation = '%'; вариант введенной операции
        int secondInputNumber = 5; //введенное значение

        if (operation == '+') {
            System.out.println("Сложение");
            System.out.println(firstInputNumber + operation + secondInputNumber + "=" + (firstInputNumber + secondInputNumber));
        } else if (operation == '-') {
            System.out.println("Вычитание");
            System.out.println(firstInputNumber + operation + secondInputNumber + "=" + (firstInputNumber - secondInputNumber));
        } else if (operation == '*') {
            System.out.println("Умножение");
            System.out.println(firstInputNumber + operation + secondInputNumber + "=" + (firstInputNumber * secondInputNumber));
        } else if (operation == '/') {
            if (secondInputNumber == 0){
                System.out.println("Деление на ноль невозможно!");
            } else {
                double firstInputNumber1 = firstInputNumber;
                double secondInputNumber1 = secondInputNumber;
                System.out.println("Деление");
                System.out.println(firstInputNumber + operation + secondInputNumber + "=" + (firstInputNumber1 / secondInputNumber1));
            }
        } else if (operation == '^') {
            System.out.println("Возведение в степень");
            if (secondInputNumber >= 0) {
                int result = firstInputNumber;
                for (int i = 1; i < secondInputNumber; i++) {
                    result *= firstInputNumber;
                }
            } else if (secondInputNumber < 0) {
                double firstInputNumber1 = firstInputNumber;
                double result = firstInputNumber1;
                for (int i = 0; i >= secondInputNumber; i--) {
                    result /= firstInputNumber1;
                }
                System.out.println(result);
            }
            System.out.println(firstInputNumber + operation + secondInputNumber + "=" + result);
        } else if (operation == '%') {
            System.out.println("Деление по модулю");
            System.out.println(firstInputNumber + operation + secondInputNumber + "=" + firstInputNumber % secondInputNumber);
        }
    }
}
