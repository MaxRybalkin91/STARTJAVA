class Cycle {
    public static void main(String[] args) {
    for (int x = 0; x <= 20; x++) {
        System.out.println(x);
    }

    System.out.println("");

    int y = -6;
    while (y <= 6) {
        System.out.println(y);
        y = y+2;
    }

    System.out.println("");

    int z = 10;
    do {
        if(z%2 == 0) {
            System.out.print("");
        }
        else if(z%2==1) {
            System.out.println(z);
        }
        z++;
        }
    while (z<=20);
    }
}
