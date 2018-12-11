package Lab03;

public class StringInvers {
    public static void main(String[] args) {
        String whatever = "cearceaf";
        System.out.println (Invers(whatever.length()-1,whatever));
        System.out.println(Invers2(0,whatever));

    }
    public static String Invers(int pos, String orig) {

        if (pos<0){
            return "";
        }
else
        return orig.charAt(pos)+Invers(pos-1,orig);

    }

    public static String Invers2 (int pos, String orig) {
        if (pos==orig.length()) {
            return "";
                    }
                    else
                        return Invers2(pos+1,orig)+orig.charAt(pos);
    }
}
