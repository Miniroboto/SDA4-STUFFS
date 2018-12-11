package Lab03;


public class BMW extends Masina {

    @Override
    public void franeaza(){
        System.out.println("Franez din BMW!");


    }
    @Override
    public String toString(){
        return super.toString()+" Sunt un BMW ursuletz";

    }


}
