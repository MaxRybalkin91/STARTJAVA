class GuessNumber {
    private int randomNumber = (int) (Math.random() * 100);

    public GuessNumber() {
        System.out.println("Компьютер загадал число в диапазоне 0-100. Попробуйте его угадать");
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}

