package Lab02;

public class StarString {
    public static void main(String[] args) {

        System.out.print(Starstring(7));

    }
    public static String Starstring (int i){
        if ( i==1){
                      return "*";

        }
        else
           return "*"+ Starstring(i-1);


    }

}
