class Jaeger {
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

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public String toString() {
        return "Name of Jaeger is " + modelName + "\n" + "Version of " + modelName + " is " + mark + "\n" +
        modelName + " created in " + origin + "\n" + "His height is " + height + " tons" + "\n" +
        "His weight is " + weight + " ft" + "\n" + "His speed is " + speed + " mph" + "\n" +
        "His strength is " + strength + " kN" + "\n" + "His armor level is " + armor + "\n";
    }
}