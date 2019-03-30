package com.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner input = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int randomNumber;
    private int attemptsQuantity = 0;

    public GuessNumber(Player player1, Player player2, int randomNumber) {
        this.player1 = player1;
        this.player2 = player2;
        this.randomNumber = randomNumber;
    }

    public void startGame() {
        System.out.println(randomNumber);
        while(attemptsQuantity < 10 && player2.getNumber() != randomNumber) {
            inputPlayerAnswer(player1);
            validateRange(player1);
            validateAnswer(player1);
            if(player1.getNumber() == randomNumber) {
                break;
            }

            inputPlayerAnswer(player2);
            validateRange(player2);
            validateAnswer(player2);

            attemptsQuantity++;
        }

        if(attemptsQuantity == 10) {
            System.out.println(player1.getName() + " и " + player2.getName() + ", вы исчерпали все попытки!");
        }

        printAnswers(player1);
        printAnswers(player2);
        resetNumbers();
    }

    private void inputPlayerAnswer(Player player) {
        System.out.println(player.getName() + " , введите ваш ответ:");
        player.setNumber(input.nextInt());
    }

    private void validateRange(Player player) {
        while (player.getNumber() < 0 || player.getNumber() > 100) {
            System.out.println(player.getName() + " , ошибка! Необходимо ввести число в диапазоне 0-100!");
            player.setNumber(input.nextInt());
        }

        player.setInputNumbers(player.getNumber(), attemptsQuantity);
    }

    private void validateAnswer(Player player) {
        if(player.getNumber() < randomNumber) {
            System.out.println(player.getName() + " , неверно! Введенное число меньше загаданного!");
        } else if (player.getNumber() > randomNumber) {
            System.out.println(player.getName() + " , неверно! Введенное число больше загаданного!");
        } else {
            System.out.println(player.getName() + " , вы угадали число " + randomNumber + " с " + (attemptsQuantity + 1) + " попытки!");
        }
    }

    private void printAnswers(Player player) {
        int[] playerAnswers;
        if(attemptsQuantity == 0) {
            playerAnswers = player.getInputNumbers((attemptsQuantity+1));
        } else {
            playerAnswers = player.getInputNumbers(attemptsQuantity);
        }

        System.out.println(player.getName() + ", ваши ответы:");
        System.out.println(Arrays.toString(playerAnswers));
    }

    private void resetNumbers() {
        player1.resetArray(attemptsQuantity);
        player2.resetArray(attemptsQuantity);
    }
}