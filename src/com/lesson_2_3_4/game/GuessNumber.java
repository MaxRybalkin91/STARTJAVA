package com.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner input = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int enteredNumber;
    private int randomNumber;
    private int attemptsQuantity = 0;

    public GuessNumber(Player player1, Player player2, int randomNumber) {
        this.player1 = player1;
        this.player2 = player2;
        this.randomNumber = randomNumber;
    }

    public void startGame() {
        while(attemptsQuantity < 10 ) {
            setAnswer(player1);
            validateRange(player1);
            validateAnswer(player1);
            if(player1.getNumber() == randomNumber) {
                break;
            }

            setAnswer(player2);
            validateRange(player2);
            validateAnswer(player2);
            if(player2.getNumber() == randomNumber) {
                break;
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

    private void validateRange(Player player) {
        while (player.getNumber() < 0 || player.getNumber() > 100) {
            System.out.println(player.getName() + " , ошибка! Необходимо ввести число в диапазоне 0-100!");
            setAnswer(player);
        }
    }

    private void setAnswer(Player player) {
        System.out.println(player.getName() + " , введите ваш ответ:");
        enteredNumber = input.nextInt();
        player.setInputNumbers(enteredNumber, attemptsQuantity);
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
        int[] arr = player.getInputNumbers((attemptsQuantity+1));
        System.out.println(player.getName() + ", ваши ответы:");
        System.out.println(Arrays.toString(arr));
    }

    private void resetNumbers() {
        player1.resetArray((attemptsQuantity+1));
        player2.resetArray((attemptsQuantity+1));
    }
}