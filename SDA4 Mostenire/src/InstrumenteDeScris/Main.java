package InstrumenteDeScris;

import sun.security.provider.certpath.IndexedCollectionCertStore;

import java.util.LinkedList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        LinkedList<InstrumenteDeScris> Instrumente  = new LinkedList<>() ;

        Stilou stilou1= new Stilou(54637, 34.5f, "albastru", "aur");
        Stilou stilou2= new Stilou(67584, 45.3f, "negru","fer");
        Carioca carioca1 = new Carioca(9999, 12.5f, "galbena", true);
        Creion creion1 = new Creion(7777, 5.4f, "maro", "HB2");
        Carioca carioca2 = new Carioca(888, 23.8f, "roz", false);
        Carioca carioca3 = new Carioca(998, 23.5f, "rosu", true);

        Instrumente.add(stilou1);
        Instrumente.add(stilou2);
        Instrumente.add(carioca1);
        Instrumente.add(creion1);
        Instrumente.add(carioca2);
        Instrumente.add(carioca3);

        int stiloucont = 0;
        int cariocacount = 0;
        int creioncount = 0;
        int refill = 0;

        for (int i=0; i<Instrumente.size(); i++) {
            InstrumenteDeScris aux = Instrumente.get(i);

            if (aux instanceof Stilou){
                stiloucont ++;
            }
            else if (aux instanceof Carioca) {
                cariocacount++;
                if (((Carioca) aux).getRefilable()){
                    refill ++;

                }

            }
            else if (aux instanceof Creion) {
                creioncount++;
            }

        }
        System.out.println("In lista avem " + stiloucont + " stilouri, " + cariocacount + " carioci si "+ creioncount + " creioane");
        System.out.println("Avem " + refill + " carioci refillable");

            int contocar=0;

            for (int i=0; i<Instrumente.size();i++) {
                InstrumenteDeScris aux = Instrumente.get(i);

                if (aux instanceof Carioca) {
                    Carioca aux2 = ((Carioca) aux);
                    if(aux2.getRefilable()){
                        contocar++;
                    }
                }

            }
        System.out.println("Avem " + contocar + " carioci refillable");
        System.out.println(Instrumente);



    }
}
