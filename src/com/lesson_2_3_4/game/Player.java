package com.lesson_2_3_4.game;

class Player {
    private String name;
    private int number;

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
}
