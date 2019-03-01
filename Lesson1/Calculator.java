class Calculator {
    public static void main(String[] args) {
        int x = 5; //введенное значение
        int y = 5; //введенное значение
        char operation = '+';
        //char operation = '-'; вариант введенной операции
        //char operation = '*'; вариант введенной операции
        //char operation = '/'; вариант введенной операции
        //char operation = '^'; вариант введенной операции
        //char operation = '%'; вариант введенной операции

        if (operation == '+') {
            System.out.println("Сложение");
            System.out.println(x + operation + y + "=" + (x + y));
        } else if (operation == '-') {
            System.out.println("Вычитание");
            System.out.println(x + operation + y + "=" + (x - y));
        } else if (operation == '*') {
            System.out.println("Умножение");
            System.out.println(x + operation + y + "=" + (x * y));
        } else if (operation == '/') {
            if (y == 0){
                System.out.println("Деление на ноль невозможно!");
            }
            double x1 = x;
            double y1 = y;
            System.out.println("Деление");
            System.out.println(x + operation + y + "=" + (x1 / y1));
        } else if (operation == '^') {
            System.out.println("Возведение в степень");
            int result = x;
            for (int i = 1; i < y; i++) {
                result *= x;
            }
            System.out.println(x + operation + y + "=" + result);
        } else if (operation == '%') {
            System.out.println("Деление по модулю");
            System.out.println(x + operation + y + " = " + x%y);
        }
    }
}
