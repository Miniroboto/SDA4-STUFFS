package Lab01;

import java.util.Scanner;

public class GetStringMetoda {


    public String getString (int n, char c) {
        String result = "";
        for (int y = 1; y <= n; y++) {
            result+=c;

        }
        return result;
    }


    public static void main (String[]args){

        Scanner in = new Scanner(System.in);
        GetStringMetoda app= new GetStringMetoda();


        System.out.println("Introduceti numarul: ");
        int n = in.nextInt();
        System.out.println("Introduceti caracterul: ");
        char c = in.next().charAt(0);



        for (int i=1; i<=n; i++)
        System.out.println(app.getString(i,c));
        for (int i=n-1; i>0; i--)
            System.out.println(app.getString(i,c));

    }
}

