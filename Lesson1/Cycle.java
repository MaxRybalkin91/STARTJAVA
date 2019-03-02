class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + "\n");
        }

        System.out.print("\n");

        int i = -6;
        while (i <= 6) {
            System.out.print(i + "\n");
            i += 2;
        }

        System.out.print("\n");

        i = 10;
        do {
            if (i %2 != 0) {
                System.out.print(i + "\n");
            }
            i++;
        } while (i <= 20);
    }
}
