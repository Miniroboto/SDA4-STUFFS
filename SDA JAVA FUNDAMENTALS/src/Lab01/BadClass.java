package Lab01;

public class BadClass {
    public static int MAX_ODD = 21;

    public static void writeOdds() {
        // print each odd number
        for (int count = 1; count <= MAX_ODD; count+=2) {
            System.out.print(count + " ");

        }

        // print the last odd number
        System.out.println();
    }

    public static void main(String[] args) {
        // write all odds up to 21
        writeOdds();

        // now, write all odds up to 11
        MAX_ODD = 11;
        writeOdds();
    }
}
