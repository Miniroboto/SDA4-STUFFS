package Lab03.Persoane;

import Lab03.Persoane.Persoana;

public class Student extends Persoana {



    String Specialitate;
    String Scoala;
    int Grupa;



    public Student(String nm, String prn, int vsa, String std){
        super (nm, prn, vsa, std);
    }




//    String specializare;
//    String Scoala;
//    int Grupa;
//
//    public Student (String specializare, String Scoala, int Grupa){
//
//        this.specializare=specializare;
//        this.Scoala=Scoala;
//        this.Grupa=Grupa;
//    }






      @Override
    public void Danseaza(){
          System.out.println("Studentul danseaza break dance!");
      }
      public String getNume (){
        return this.nume;
      }
    public void setScoala(String scoala) {
        Scoala = scoala;
    }

    public void setGrupa(int grupa) {
        Grupa = grupa;
    }
    public void setSpecialitate(String specialitate) {
        Specialitate = specialitate;
    }



    @Override
    public String toString(){
       return super.toString()+ " De asemenea, specialitatea mea este " + this.Specialitate + " si sunt la grupa " + this.Grupa;
        }

}
