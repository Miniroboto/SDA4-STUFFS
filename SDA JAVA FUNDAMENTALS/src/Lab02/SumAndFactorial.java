package Lab02;

public class SumAndFactorial {
    public static void main(String[] args) {

        int n = 5;
        System.out.println(sumshow(n) +"=" +sum(n));
        System.out.println(Factshow(n)+ "=" +Fact(n));

    }

    public static int sum(int n) {

        if (n == 0)
            return 0;
        else
            return n + sum(n - 1);


    }

    public static int Fact(int n) {

        if (n == 1)
            return 1;
        else
            return n * Fact(n - 1);
    }
    public static String sumshow(int n){
        if (n==0)
            return "0";
        else
            return   sumshow(n-1)+ "+" +n;

    }
    public static String Factshow (int n){
        if (n==1)
            return "1";
        else
            return   Factshow(n-1)+ "*" +n;

    }
}
