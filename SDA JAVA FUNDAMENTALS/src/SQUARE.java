public class SQUARE {
    public static void main(String[] args) {
        printSquare(1, 5);
    }

    public static void printSquare(int min, int max) {
        for (int i = min; i <= max; i++) {

            for (int j = i; j <= max; j++) {
                System.out.print(j);

            }
            for (int k=min; k<i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

