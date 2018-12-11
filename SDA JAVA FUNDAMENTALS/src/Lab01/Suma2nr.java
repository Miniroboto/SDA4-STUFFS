package Lab01;

import java.util.Scanner;

public class Suma2nr {
    Scanner in = new Scanner(System.in);
    int x, y;

    public void citire() {

        System.out.println("Introduceti primul numar: ");
        x = in.nextInt();
        System.out.println("Introduceti primul numar: ");
        y = in.nextInt();

    }

    public int sum() {
        return x + y;
    }


    public static void main(String[] args) {

        Suma2nr app = new Suma2nr();
        app.citire();
        System.out.println("Suma celor doua numare este: " + app.sum());
    }

}
