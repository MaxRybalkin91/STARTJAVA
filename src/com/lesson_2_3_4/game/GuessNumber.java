package com.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner input = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int randomNumber;
    private int attemptsQuantity = 0;
    private boolean isContinue = true;

    public GuessNumber(Player player1, Player player2, int randomNumber) {
        this.player1 = player1;
        this.player2 = player2;
        this.randomNumber = randomNumber;
    }

    public void startGame() {
        System.out.println(randomNumber);
        while(attemptsQuantity < 10 && isContinue) {
            prepareValidation(player1);
            isGameContinue(player1);

            if(isContinue) {
                prepareValidation(player2);
                isGameContinue(player2);
            }

            attemptsQuantity++;
        }

        if(attemptsQuantity == 10) {
            System.out.println(player1.getName() + " и " + player2.getName() + ", вы исчерпали все попытки!");
        }

        printAnswers(player1);
        printAnswers(player2);
        resetNumbers();
    }

    private void prepareValidation(Player player) {
        inputPlayerAnswer(player);
        validateRange(player);
        validateAnswer(player);
    }

    private boolean isGameContinue(Player player) {
        if(player.getNumber() == randomNumber) {
            isContinue = false;
        }
        return isContinue;
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
        int[] playerAnswers = player.getInputNumbers(attemptsQuantity);
        System.out.println(player.getName() + ", ваши ответы:");
        System.out.println(Arrays.toString(playerAnswers));
    }

    private void resetNumbers() {
        player1.resetArray(attemptsQuantity);
        player2.resetArray(attemptsQuantity);
    }
}