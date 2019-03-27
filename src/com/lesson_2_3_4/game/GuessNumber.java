package com.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Scanner input = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int randomNumber;
    private int count = 0;

    public GuessNumber(Player player1, Player player2, int randomNumber) {
        this.player1 = player1;
        this.player2 = player2;
        this.randomNumber = randomNumber;
    }

    public void startGame() {
        while(count < 10) {
            System.out.println(player1.getName() + " , введите ваш ответ:");
            enterNumber(player1, count);

            validateNumber(player1);

            if (numberTrue(player1)) {
                break;
            }
            System.out.println(player2.getName() + " , введите ваш ответ:");

            enterNumber(player2, count);
            validateNumber(player2);

            if (numberTrue(player2)) {
                break;
            }

            if (loose()) {
                break;
            }
            count++;
        }
    }

    private void enterNumber(Player player, int element) {
        int enteredNumber = input.nextInt();
        player.setNumber(enteredNumber);
        player.getInputNumbers()[element] = enteredNumber;
    }

    private void validateNumber(Player player) {
        while (player.getNumber() < 0 || player.getNumber() > 100 ) {
            System.out.println(player.getName() + " , ошибка! Необходимо ввести число в диапазоне 0-100!");
            player.setNumber(input.nextInt());
        }

        if (player.getNumber() < randomNumber) {
            System.out.println(player.getName() + " , неверно! Введенное число меньше загаданного!");
        } else if (player.getNumber() > randomNumber) {
            System.out.println(player.getName() + " , неверно! Введенное число больше загаданного!");
        } else {
            System.out.println(player.getName() + " , вы угадали число " + randomNumber + " с " + (count + 1) + " попытки!");
        }
    }

    private boolean numberTrue(Player player) {
        if (player.getNumber() == randomNumber) {
            System.out.println(player1.getName() + " ввёл следующие числа:");
            printArray(player1.getInputNumbers());
            player1.resetArray();
            System.out.println(player2.getName() + " ввёл следующие числа:");
            printArray(player2.getInputNumbers());
            player1.resetArray();

            return true;
        } else {
            return false;
        }
    }

    private void printArray(int[] arr) {
        int[] numbers = Arrays.copyOf(arr, count);
        System.out.println(Arrays.toString(numbers));
    }

    private boolean loose() {
        if (count == 10) {
            System.out.println(player1.getName() + " и " + player2.getName() + " вы исчерпали все попытки!");
            System.out.println(player1.getName() + " ввёл следующие числа:");
            printArray(player1.getInputNumbers());
            player1.resetArray();
            System.out.println(player2.getName() + " ввёл следующие числа:");
            printArray(player2.getInputNumbers());
            player2.resetArray();

            return true;
        } else {
            return false;
        }
    }
}