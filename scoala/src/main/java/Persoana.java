import java.math.BigInteger;

public abstract class Persoana {
    private final String nume;
    private final String prenume;
    private final BigInteger cnp;

    public Persoana(String nume, String prenume, BigInteger cnp) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }


    public String getPrenume() {
        return prenume;
    }


    public BigInteger getCnp() {
        return cnp;
    }


}
