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
            System.out.println(x + "+" + y + "=" + (x + y));
        } else if (operation == '-') {
            System.out.println("Вычитание");
            System.out.println(x + "-" + y + "=" + (x - y));
        } else if (operation == '*') {
            System.out.println("Умножение");
            System.out.println(x + "*" + y + "=" + (x * y));
        } else if (operation == '/') {
            System.out.println("Деление");
            System.out.println(x + "/" + y + "=" + (x / y));
        } else if (operation == '^') {
            System.out.println("Возведение в степень");
            int result = x;
            for (int i = 1; i < y; i++) {
                result *= x;
            }
            System.out.println(x + "^" + y + "=" + result);
        } else if (operation == '%') {
            double x1 = x;
            double y1 = y;
            double result = x1*y1/100;
            System.out.println(y + " процентов от " + x + " = " + result);
        }
    }
}
