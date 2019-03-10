import java.util.Scanner;
class GuessNumber {
    Scanner input = new Scanner(System.in);

    private int randomNumber;

    public GuessNumber() {
        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(input.nextLine());

        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(input.nextLine());

        randomNumber = (int) (Math.random() * 100);
        System.out.println("Компьютер загадал число в диапазоне 0-100. Попробуйте его угадать!");

        logicOfGame(player1, player2);
    }

    public void logicOfGame(Player player1, Player player2) {
        do {
            System.out.println(player1.getName() + " , введите ваш ответ");
            player1.setNumber(input.nextInt());

            if (player1.getNumber() < randomNumber) {
                System.out.println(player1.getName() + " , неверно! Введенное число меньше загаданного");
            } else if (player1.getNumber() > randomNumber) {
                System.out.println(player1.getName() + " , неверно! Введенное число больше загаданного");
            } else {
                System.out.println(player1.getName() + " , вы угадали");
            }

            System.out.println(player2.getName() + " , введите ваш ответ");
            player2.setNumber(input.nextInt());

            if (player2.getNumber() < randomNumber) {
                System.out.println(player2.getName() + " , неверно! Введенное число меньше загаданного");
            } else if (player2.getNumber() > randomNumber) {
                System.out.println(player2.getName() + " , неверно! Введенное число больше загаданного");
            } else {
                System.out.println(player2.getName() + " , вы угадали");
            }
        } while (player1.getNumber() != randomNumber && player2.getNumber() != randomNumber);
    }
}


