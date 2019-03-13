import java.util.Scanner;
class Jaeger {
    Scanner input = new Scanner(System.in);
    private String modelName;
    private String mark;
    private String origin;
    private double height;
    private double weight;
    private int speed;
    private int strength;
    private int armor;

    Jaeger (String modelName, String mark, String origin) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }

    private void setStrength(int strength) {
        this.strength = strength;
    }

    private void setArmor(int armor) {
        this.armor = armor;
    }

    private double getHeight() {
        return height;
    }

    private double getWeight() {
        return weight;
    }

    private int getSpeed() {
        return speed;
    }

    private int getStrength() {
        return strength;
    }

    private int getArmor() {
        return armor;
    }

    public void setParametres(Jaeger jaeger) {
        System.out.println("Enter the height of " + jaeger.modelName);
        jaeger.setHeight(input.nextInt());
        System.out.println("Enter the weight of " + jaeger.modelName);
        jaeger.setWeight(input.nextInt());
        System.out.println("Enter the speed of " + jaeger.modelName);
        jaeger.setSpeed(input.nextInt());
        System.out.println("Enter the strength of " + jaeger.modelName);
        jaeger.setStrength(input.nextInt());
        System.out.println("Enter the armor of " + jaeger.modelName);
        jaeger.setArmor(input.nextInt());
    }

    public void printInfo(Jaeger jaeger) {
        System.out.println("Name of Jaeger is " + jaeger.modelName);
        System.out.println("Version of " + modelName + " is " + jaeger.mark);
        System.out.println(jaeger.modelName + " created in " + jaeger.origin);
        System.out.println("His height is " + jaeger.getHeight() + " tons");
        System.out.println("His weight is " + jaeger.getWeight() + " ft");
        System.out.println("His speed is " + jaeger.getSpeed() + " mph");
        System.out.println("His strength is " + jaeger.getStrength() + " kN");
        System.out.println("His armor level is " + jaeger.getArmor() + "\n");
    }

}
