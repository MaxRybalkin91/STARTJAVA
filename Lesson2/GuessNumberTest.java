import java.util.Scanner;
public class GuessNumberTest {
    public static void main(String[] args) {
        char answer;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(input.nextLine());

        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(input.nextLine());

        do {
            GuessNumber computer = new GuessNumber();

            do {
                player1.enterNumber();
                player1.setInputNumber(input.nextInt());
                if (player1.getInputNumber() < computer.getRandomNumber()) {
                    player1.increaseNumber();
                } else {
                    player1.reduceNumber();
                }

                player2.enterNumber();
                player2.setInputNumber(input.nextInt());
                if (player2.getInputNumber() < computer.getRandomNumber()) {
                    player2.increaseNumber();
                } else {
                    player2.reduceNumber();
                }
            } while (player1.getInputNumber() != computer.getRandomNumber() && player2.getInputNumber() != computer.getRandomNumber());

            System.out.println("Число угадано!");

            do {
                System.out.println("Хотите продолжить? y/n");
                answer = input.next().charAt(0);
            } while (answer != 'y' && answer != 'n');
        } while (answer != 'n');
    }
}
