package Lab02;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fibb(n));
        System.out.println(PrintFibb(n));
    }

    public static int Fibb(int n) {

        if (n <= 1)
            return 1;
        else if (n==2)
            return 1;

            return Fibb(n - 1)+Fibb(n-2);
    }

    public static String PrintFibb(int n){
        if (n==1) return "1";
        else if (n==2)
            return "1 1";
        else
        return PrintFibb(n-1)+" "+ Fibb(n);
    }
}