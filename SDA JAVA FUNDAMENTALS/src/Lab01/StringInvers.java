package Lab01;

import java.util.Scanner;

public class StringInvers {

    public static void main(String[] args) {

        StringInvers cuvant = new StringInvers();

        Scanner in=new Scanner(System.in);
        System.out.println("Introduceti stringul: ");
        String x = in.nextLine();

        System.out.println("Stringul citit invers este: " + cuvant.invers(x));
        System.out.println("Numarul de vocale este: " + cuvant.vocale(x));

    }
    public String invers (String x) {
        String y="";
        for (int i = x.length()-1; i >=0; i--) {
          y+=x.charAt(i);
        }
        return y;
    }

    public int vocale (String x) {

        int nrVocale=0;
        for (int i = 0; i < x.length(); i++) {

            char []vocals={'a', 'e', 'i', 'o', 'u'};

            for(char c: vocals){
                if (c==x.charAt(i)){
                    nrVocale++;
                    break;
                }

            }


            }
        return nrVocale;
    }




}
