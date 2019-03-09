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
            computer.playGame(player1, player2);

            do {
                System.out.println("Хотите продолжить? y/n");
                answer = input.next().charAt(0);
            } while (answer != 'n' && answer != 'y');
        } while (answer != 'n');
    }
}
