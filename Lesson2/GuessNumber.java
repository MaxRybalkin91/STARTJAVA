import java.util.Scanner;
class GuessNumber {
    Scanner input = new Scanner(System.in);

    private int randomNumber;

    GuessNumber() {
        randomNumber = (int) (Math.random() * 100);
    }

    public void enterAnswer(String name) {
        System.out.println(name + " , введите ваш ответ");
    }
    public void increaseNumber(String name) {
        System.out.println(name + " , неверно! Введенное число меньше загаданного");
    }

    public void reduceNumber(String name) {
        System.out.println(name + " , неверно! Введенное число больше загаданного");
    }

    public void win(String name) {
        System.out.println(name + " , вы угадали!");
    }

    public void playGame(Player player1, Player player2) {
        do {
            enterAnswer(player1.getName());
            player1.setNumber(input.nextInt());

            if (player1.getNumber() < randomNumber) {
                increaseNumber(player1.getName());
            } else if (player1.getNumber() > randomNumber) {
                reduceNumber(player1.getName());
            } else {
                win(player1.getName());
            }

            enterAnswer(player2.getName());
            player2.setNumber(input.nextInt());

            if (player2.getNumber() < randomNumber) {
                increaseNumber(player2.getName());
            } else if (player2.getNumber() > randomNumber) {
                reduceNumber(player2.getName());
            } else {
                win(player2.getName());
            }
        } while (player2.getNumber() != randomNumber && player2.getNumber() != randomNumber);
    }
}

