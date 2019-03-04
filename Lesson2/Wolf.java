class Wolf {
    char gender;
    String name;
    byte weight;
    byte age;
    String color;

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

class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = 'M';
        wolf.name = "Wolf";
        wolf.weight = 50;
        wolf.age = 5;
        wolf.color = "Dark";

        System.out.println("Gender of wolf is " + wolf.gender);
        System.out.println("Name of wolf is " + wolf.name);
        System.out.println("Weight of wolf is " + wolf.weight + " kg");
        System.out.println("Age of wolf is " + wolf.age + " years");
        System.out.println("Color of wolf is " + wolf.color);

        wolf.go();
        wolf.seat();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
