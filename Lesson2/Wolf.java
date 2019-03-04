class Wolf {
    private char gender;
    private String name;
    private int weight;
    private int age;
    private String color;

    public void setGender(char wolfGender) {
        gender = wolfGender;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String wolfName) {
        name = wolfName;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int wolfWeight) {
        weight = wolfWeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int wolfAge) {
        age = wolfAge;
        if (age > 8) {
            System.out.println("Warning! Incorrect age of wolf!" + "\n");
        }
    }

    public int getAge() {
        return age;
    }

    public void setColor(String wolfColor) {
        color = wolfColor;
    }

    public String getColor() {
        return color;
    }

    void go() {
        System.out.println("Wolf is going");
    }

    void seat() {
        System.out.println("Wolf is sitting");
    }

    void run() {
        System.out.println("Wolf is running");
    }

    void howl() {
        System.out.println("Wolf is howling");
    }

    void hunt() {
        System.out.println("Wolf is hunting");
    }
}
