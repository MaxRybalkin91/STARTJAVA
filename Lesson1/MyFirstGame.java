class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Компьютер загадал число в диапазоне 0-100. Попробуй его отгадать!");
        int compNumber = 55; //загаданное компьютером число
        int playerNumber = 27; //введенное с клавиатуры значение
        System.out.println("Введите число");
        do {
            if (playerNumber < compNumber) {
                System.out.println("Не угадали!");
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                playerNumber += 6; //якобы изменение числа пользователем
            } else if (playerNumber > compNumber) {
                System.out.println("Не угадали!");
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                playerNumber -= 5; //якобы изменение числа пользователем
            }
        } while (compNumber != playerNumber);
        System.out.println("Вы угадали!");
    }
}
