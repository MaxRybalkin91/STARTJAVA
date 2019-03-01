class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Компьютер загадал число в диапазоне 0-100. Попробуй его отгадать!");
        int computer = 56;
        int human;
        do {
            System.out.println("Введите число");
            human = 23; //здесь должен быть код ввода значения с клавиатуры
            //при текущем коде программа будет выполняться бесконечно из-за постоянной переменной
            //при реализации ввода с клавиатуры - каждый раз переменная "human" будет приобретать новое значение
            if (human < computer) {
                System.out.println("Не угадали!");
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                System.out.println("");
            } else if (human > computer) {
                System.out.println("Не угадали!");
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                System.out.println("");
            } else {
                System.out.println("Вы угадали!");
            }
        } while (computer != human);
    }
}

