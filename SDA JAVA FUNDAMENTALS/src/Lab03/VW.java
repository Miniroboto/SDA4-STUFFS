package Lab03;

public class VW  extends Masina {

   VW(){
       super("maro", 6," Dragnea");
   }
    @Override
    public void parcheaza() {
        System.out.println("Parchez ca un bou din VW!");
    }


}
