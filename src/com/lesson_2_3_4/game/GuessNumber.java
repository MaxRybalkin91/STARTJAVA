package com.lesson_2_3_4.game;

import java.util.Scanner;
class GuessNumber {
    Scanner input = new Scanner(System.in);
    private int randomNumber;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2, int number) {
        this.player1 = player1;
        this.player2 = player2;
        randomNumber = number;
    }

    public void startGame() {
        do {
            System.out.println(player1.getName() + " , введите ваш ответ:");
            player1.setNumber(input.nextInt());
            validateNumber(player1);
            if (player1.getNumber() == randomNumber) {
                break;
            }

            System.out.println(player2.getName() + " , введите ваш ответ:");
            player2.setNumber(input.nextInt());
            validateNumber(player2);
        } while (player2.getNumber() != randomNumber);
    }

    private void validateNumber(Player player) {
        while (player.getNumber() < 0 || player.getNumber() > 100) {
            System.out.println(player.getName() + " , ошибка! Необходимо ввести число в диапазоне 0-100!");
            player.setNumber(input.nextInt());
        }

        if (player.getNumber() < randomNumber) {
            System.out.println(player.getName() + " , неверно! Введенное число меньше загаданного!");
        } else if (player.getNumber() > randomNumber) {
            System.out.println(player.getName() + " , неверно! Введенное число больше загаданного!");
        } else {
            System.out.println(player.getName() + " , вы угадали!");
        }
    }
}
