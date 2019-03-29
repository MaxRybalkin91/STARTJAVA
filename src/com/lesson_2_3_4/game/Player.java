package com.lesson_2_3_4.game;

import java.util.Arrays;

class Player {
    private String name;
    private int number;
    private int[] inputNumbers = new int[10];

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setInputNumbers(int enteredNumber, int element) {
        number = enteredNumber;
        inputNumbers[element] = number;
    }

    public int[] getInputNumbers(int element) {
        return Arrays.copyOf(inputNumbers, element);
    }

    public int getNumber() {
        return number;
    }

    public void resetArray(int element) {
        Arrays.fill(inputNumbers, 0, element, 0);
    }
}