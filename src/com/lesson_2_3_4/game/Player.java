package com.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

class Player {
    Scanner input = new Scanner(System.in);
    private String name;
    private int number;
    private int[] inputNumbers = new int[10];

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setInputNumbers(Player player, int element) {
        int enteredNumber = input.nextInt();
        player.setNumber(enteredNumber);
        inputNumbers[element] = enteredNumber;
    }

    public int[] getInputNumbers(int element) {
        return Arrays.copyOf(inputNumbers, element);
    }

    private void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void resetArray(int element) {
        Arrays.fill(inputNumbers, 0, element, 0);
    }
}