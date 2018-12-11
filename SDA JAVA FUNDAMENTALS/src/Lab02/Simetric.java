package Lab02;

public class Simetric {
    public static void main(String[] args) {
        System.out.print(Sim(4));


    }
    public static String Sim (int n)  {
        if (n<1) {
            throw new IllegalArgumentException();
        }
        else if (n==1)
            return "1";
        else if (n==2){
            return (n+1)/2 + " "+ (n+1)/2;}

            else
                return ((n+1)/2) + " " + Sim(n-2)+" " + ((n+1)/2);


    }
}
