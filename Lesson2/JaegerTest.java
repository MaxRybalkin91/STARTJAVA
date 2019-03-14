import java.util.Scanner;
class JaegerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA");
        System.out.println("Enter the height of " + gipsyDanger.getModelName());
        gipsyDanger.setHeight(input.nextInt());
        System.out.println("Enter the weight of " + gipsyDanger.getModelName());
        gipsyDanger.setWeight(input.nextInt());
        System.out.println("Enter the speed of " + gipsyDanger.getModelName());
        gipsyDanger.setSpeed(input.nextInt());
        System.out.println("Enter the strength of " + gipsyDanger.getModelName());
        gipsyDanger.setStrength(input.nextInt());
        System.out.println("Enter the armor of " + gipsyDanger.getModelName());
        gipsyDanger.setArmor(input.nextInt());

        Jaeger chernoAlplha = new Jaeger("Cherno Alpha", "Mark-1", "Russia");
        System.out.println("Enter the height of " + chernoAlplha.getModelName());
        chernoAlplha.setHeight(input.nextInt());
        System.out.println("Enter the weight of " + chernoAlplha.getModelName());
        chernoAlplha.setWeight(input.nextInt());
        System.out.println("Enter the speed of " + chernoAlplha.getModelName());
        chernoAlplha.setSpeed(input.nextInt());
        System.out.println("Enter the strength of " + chernoAlplha.getModelName());
        chernoAlplha.setStrength(input.nextInt());
        System.out.println("Enter the armor of " + chernoAlplha.getModelName());
        chernoAlplha.setArmor(input.nextInt());

        System.out.println(gipsyDanger);
        System.out.println(chernoAlplha);
    }
}