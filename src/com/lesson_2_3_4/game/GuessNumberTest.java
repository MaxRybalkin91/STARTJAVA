package com.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        char answer;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите имя первого игрока:");
        Player player1 = new Player(input.nextLine());

        System.out.println("Введите имя второго игрока:");
        Player player2 = new Player(input.nextLine());

        do {
            System.out.println("Компьютер загадал число в диапазоне 0-100. Попробуйте его угадать!");
            System.out.println("У вас 10 попыток!");

            GuessNumber guessNumber = new GuessNumber(player1, player2, (int) (Math.random() * 101));
            guessNumber.startGame();

            do {
                System.out.println("Хотите повторить? y/n");
                answer = input.next().charAt(0);
            } while (answer != 'n' && answer != 'y');
        } while (answer != 'n');
    }
}