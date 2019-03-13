class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Gipsy Danger", "Mark-3", "USA");
        jaeger1.setParametres(jaeger1);

        Jaeger jaeger2 = new Jaeger("Cherno Alpha", "Mark-1", "Russia");
        jaeger1.setParametres(jaeger2);

        jaeger1.printInfo(jaeger1);
        jaeger2.printInfo(jaeger2);
    }
}