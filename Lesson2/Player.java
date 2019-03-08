class Player {
    public String name;
    public int inputNumber;

    public Player(String name) {
        this.name = name;
    }

    public void setInputNumber(int inputNumber) {
        this.inputNumber = inputNumber;
    }

    public int getInputNumber() {
        return inputNumber;
    }

    public void enterNumber() {
        System.out.println(name + " , введите ваш вариант");
    }

    public void increaseNumber() {
        System.out.println(name + " , вы не угадали! Введенное число меньше задуманного!");
    }

    public void reduceNumber() {
        System.out.println(name + " , вы не угадали! Введенное число больше задуманного!");
    }
}
