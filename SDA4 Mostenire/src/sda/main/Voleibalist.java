package sda.main;

public class Voleibalist extends Sportiv {

    private String rol;
    private Float viteza;
    private Integer valoare;
    private Float detenta;
    private String echipa;

    public Voleibalist(Integer inaltime, Integer greutate, String nume, String rol, Float viteza, Integer valoare, Float detenta, String echipa) {
        super(inaltime, greutate, nume);
        this.rol = rol;
        this.viteza = viteza;
        this.valoare = valoare;
        this.detenta = detenta;
        this.echipa = echipa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Float getViteza() {
        return viteza;
    }

    public void setViteza(Float viteza) {
        this.viteza = viteza;
    }

    public Integer getValoare() {
        return valoare;
    }

    public void setValoare(Integer valoare) {
        this.valoare = valoare;
    }

    public Float getDetenta() {
        return detenta;
    }

    public void setDetenta(Float detenta) {
        this.detenta = detenta;
    }

    public String getEchipa() {
        return echipa;
    }

    public void setEchipa(String echipa) {
        this.echipa = echipa;
    }
}
