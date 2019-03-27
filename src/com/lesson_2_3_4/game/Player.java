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

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int[] getInputNumbers() {
        return inputNumbers;
    }

    public void resetArray() {
        Arrays.fill(inputNumbers, 0);
    }
}
