package Lab02;

public class StarString2 {
    public static void main(String[] args) {

        System.out.print(Startring(powStarstring(2,3)));
    }


    public static int powStarstring(int i, int x) {
        if (x == 0) {
            return 1;


        } else {
            return i * powStarstring(i, x - 1);

        }


    }
    public static String Startring (int i){

        if (i==1){
            return "*";
        }
        else
            return "*" + Startring(i-1);

    }
}
