import java.util.Scanner;
public class GuessNumberTest {
    public static void main(String[] args) {
        char answer;

        Scanner input = new Scanner(System.in);

        do {
            GuessNumber computer = new GuessNumber();

            do {
                System.out.println("Хотите повторить? y/n");
                answer = input.next().charAt(0);
            } while (answer != 'n' && answer != 'y');
        } while (answer != 'n');
    }
}
