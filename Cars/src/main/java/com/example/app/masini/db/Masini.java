package com.example.app.masini.db;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="Masini")
public class Masini {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column (name="marca")
    private String marca;
    @Column (name ="model")
    private String model;
    @Column (name = "numar")
    private String numar;

    public Masini(Integer id, String marca, String model, String numar) {
        this.id = id;
        this.marca = marca;
        this.model = model;
        this.numar = numar;
    }
    public Masini(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    @Override
    public String toString() {
        return "Masini{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", numar='" + numar + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Masini masini = (Masini) o;

        if (id != null ? !id.equals(masini.id) : masini.id != null) return false;
        if (marca != null ? !marca.equals(masini.marca) : masini.marca != null) return false;
        if (model != null ? !model.equals(masini.model) : masini.model != null) return false;
        return numar != null ? numar.equals(masini.numar) : masini.numar == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (numar != null ? numar.hashCode() : 0);
        return result;
    }
}
