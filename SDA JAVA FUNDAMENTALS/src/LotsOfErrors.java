import java.sql.SQLOutput;

public class LotsOfErrors {

    public static void main (String[] args) {
        System.out.println("Hello, world!");
        message();
        for (int i=1;i<=2;i++){
            for (int j=1; j<=3; j++) {
                for (int k=1;k<=4;k++){
                    System.out.print("*");
                }
                System.out.print("!");
            }
            System.out.println();
        }
        for (int i=1; i<=2; i++) {
            for (int j=1; j<=3; j++) {
                for (int k=1;k<=4; k++) {
                    System.out.print ("*");
                }
            }
            System.out.print ("!");
            System.out.println();
        }

        final int MAX=5;
        int number=0;

        for (int count= MAX;count>=1; count--) {
            number+=(count*count);
        }
        System.out.print("The result is " + number);

        System.out.println("");

        for (int i=1; i<=5;i++) {
            for (int j=10;j>=1;j--){
                System.out.print ((i*j) + " ");
            }
            System.out.println();
        }




    }

    public static void message() {
        System.out.println("This program surely cannot ");
        System.out.println("have any \"errors\" in it");
    }
}
