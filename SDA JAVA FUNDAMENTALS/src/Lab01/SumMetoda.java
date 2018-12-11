package Lab01;

import java.util.Scanner;

public class SumMetoda {

    public int sum(int n) {
        int suma = 0;

        for (int x = 1; x <= n; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
                suma += x;
            }
        }
        return suma;
    }

    public String nrpar(int n) {
        String result = "";
        for (int x = 2; x <= n; x++) {
            if (x % 2 == 0) {
                result += x + " ";
            }
        }
            return result;

    }

    public static void main (String[]args){
            Scanner in = new Scanner(System.in);

            System.out.println("Suma primelor x numere: ");
            int n = in.nextInt();

            SumMetoda app = new SumMetoda();

            System.out.println("Suma primelor " + n + " numere este: " + app.sum(n)+"");
            System.out.println(app.nrpar(n));

        }
    }

