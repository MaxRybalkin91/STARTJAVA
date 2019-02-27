class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("");

        int i = -6;
        while (i <= 6) {
            System.out.println(i);
            i+=2;
        }

        System.out.println("");

        i = 10;
        do {
            if (i%2 != 0) {
                System.out.println(i);
            } else {
                System.out.print("");
            }
            i++;
        } while (i <= 20);
    }
}
