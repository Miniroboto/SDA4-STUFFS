import java.math.BigInteger;
import java.util.Map;
import java.util.Set;

public class Student extends Persoana {

    private Set<Materie> materii;
    private Map<Materie, Profesor> profesori;

    public Student(String nume, String prenume, BigInteger cnp) {
        super(nume, prenume, cnp);
    }

    public boolean eliminareMaterie(Materie materie) {
        return materii.remove(materie);
    }

    public boolean adaugareMaterie(Materie materie) {
        return materii.add(materie);
    }



    /**
     * Adauga sau actualizeaza profesul pentru materia selectata.
     *
     * @param materie materia selectata
     * @param profesor profesorul nou
     * @return true daca profesorul a fost adaugat, fals daca a fost actualizat.
     */
    public boolean adaugareProfesor (Materie materie, Profesor profesor){
           if (!materii.contains(materie)) {
               return false;
           }

           return profesori.put(materie,profesor)== null;

    }

    public boolean eliminareProfesor (Materie materie, Profesor profesor) {

        return profesori.remove(materie, profesor);

    }

    }

