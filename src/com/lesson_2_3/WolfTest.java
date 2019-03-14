package com.lesson_2_3;

class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender('M');
        wolf.setName("Wolf");
        wolf.setWeight(50);
        wolf.setAge(9);
        wolf.setColor("Dark");

        System.out.println("Gender of wolf is " + wolf.getGender());
        System.out.println("Name of wolf is " + wolf.getName());
        System.out.println("Weight of wolf is " + wolf.getWeight() + " kg");
        System.out.println("Age of wolf is " + wolf.getAge()+ " years");
        System.out.println("Color of wolf is " + wolf.getColor() + "\n");

        wolf.go();
        wolf.seat();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
