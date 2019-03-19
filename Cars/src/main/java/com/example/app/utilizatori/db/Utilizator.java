package com.example.app.utilizatori.db;

import com.example.app.masini.db.Masini;

import javax.persistence.*;
import java.util.List;


@Entity
@Table (name = "Utilizatori")
public class Utilizator {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "nume")
    private String nume;

    @ManyToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "utilizatori_masini",
            joinColumns = {@JoinColumn(name ="id_utilizator")},
            inverseJoinColumns = {@JoinColumn(name ="id_masina")}
    )
    private List<Masini> masini;

    public Utilizator(Integer id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    public Utilizator() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Masini> getMasini() {
        return masini;
    }

    public void setMasini(List<Masini> masini) {
        this.masini = masini;
    }

    @Override
    public String toString() {
        return "Utilizator{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", masini=" + masini +
                '}';
    }
}
