import java.util.Scanner;
class GuessNumber {
    Scanner input = new Scanner(System.in);

    private int randomNumber;

    GuessNumber() {
        System.out.println("Компьютер загадал число в диапазоне 0-100. Попробуйте его угадать!");
        randomNumber = (int) (Math.random() * 100);
    }

    public void playGame(Player player1, Player player2) {
        do {
            System.out.println(player1.getName() + " , введите ваш ответ");
            player1.setNumber(input.nextInt());

            if (player1.getNumber() < randomNumber) {
                System.out.println(player1.getName() + increaseNumber());
            } else if (player1.getNumber() > randomNumber) {
                System.out.println(player2.getName() + reduceNumber());
            } else {
                System.out.println(player1.getName() + " , вы угадали!");
            }

            System.out.println(player2.getName() + " , введите ваш ответ");
            player2.setNumber(input.nextInt());

            if (player2.getNumber() < randomNumber) {
                System.out.println(player2.getName() + increaseNumber());
            } else if (player2.getNumber() > randomNumber) {
                System.out.println(player2.getName() + reduceNumber());
            } else {
                System.out.println(player2.getName() + " , вы угадали!");
            }
        } while (player1.getNumber() != randomNumber && player2.getNumber() != randomNumber);
    }

    public String increaseNumber() {
        return " , неверно! Введенное число меньше загаданного";
    }

    public String reduceNumber() {
        return " , неверно! Введенное число больше загаданного";
    }
}

