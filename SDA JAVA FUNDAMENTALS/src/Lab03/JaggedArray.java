package Lab03;

public class JaggedArray {
    public static void main(String[] args) {


       // int[][] jagged = new int[6][6];
        for (int i = 1; i <= 15; i++) {
            for (int j = 1; j <i+1; j++) {
                if(j==i) System.out.println();
            }
            System.out.print(i + ",");
        }
    }
}
