package Lab01;

public class Lanterns {
    public static void main (String[] args){
        figure1();
        System.out.println();
        figure1();
        figure2();
        figure1();
        System.out.println();
        figure1();
        figure3();
    }

    public static void figure1(){
        subfigure1();
        System.out.println("  *********");
        subfigure2();
    }
    public static void subfigure1(){
        System.out.println("    *****");
    }
    public static void subfigure2(){
        System.out.println("*************");
    }

    public static void figure2(){
        subfigure3();
        subfigure2();
    }
    public static void subfigure3(){
        System.out.println("* | | | | | *");}
    public static void figure3(){
        subfigure1();
        subfigure3();
        subfigure3();
        subfigure1();
        subfigure1();
    }
}
