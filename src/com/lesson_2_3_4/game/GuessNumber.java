package com.lesson_2_3_4.game;

import java.util.Arrays;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int randomNumber;
    private int count = 0;

    public GuessNumber(Player player1, Player player2, int randomNumber) {
        this.player1 = player1;
        this.player2 = player2;
        this.randomNumber = randomNumber;
    }

    public void startGame(Player player1, Player player2) {
        while(count < 10) {
            setAndValidate(player1);
            if(player1.getNumber() == randomNumber) {
                break;
            }
            setAndValidate(player2);
            count++;
        }

        if(count == 10) {
            System.out.println(player1.getName() + " и " + player2.getName() + ", вы исчерпали все попытки!");
        }

        stopTheGame(player1);
        stopTheGame(player2);
        resetNumbers();
    }

    private void setAndValidate(Player player) {
        System.out.println(player.getName() + " , введите ваш ответ:");
        player.setInputNumbers(player, count);

        while(player.getNumber() < 0 || player.getNumber() > 100) {
            System.out.println(player.getName() + " , ошибка! Необходимо ввести число в диапазоне 0-100!");
            player.setInputNumbers(player, count);
        }

        if(player.getNumber() < randomNumber) {
            System.out.println(player.getName() + " , неверно! Введенное число меньше загаданного!");
        } else if (player.getNumber() > randomNumber) {
            System.out.println(player.getName() + " , неверно! Введенное число больше загаданного!");
        } else {
            System.out.println(player.getName() + " , вы угадали число " + randomNumber + " с " + (count + 1) + " попытки!");
        }
    }

    private void stopTheGame(Player player) {
        int[] arr = player.getInputNumbers(count);
        System.out.println(player.getName() + ", ваши ответы:");
        System.out.println(Arrays.toString(arr));
    }

    private void resetNumbers() {
        player1.resetArray(count);
        player2.resetArray(count);
    }
}