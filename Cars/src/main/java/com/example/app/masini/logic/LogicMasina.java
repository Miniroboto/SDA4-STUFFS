package com.example.app.masini.logic;

import Main.Bl;
import com.example.app.masini.db.Masini;
import com.example.app.utilizatori.db.Utilizator;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class LogicMasina {
    private Bl bl;

    public LogicMasina(Bl bl){
        this.bl=bl;
    }

    public void adaugaMasina (Masini masina)  {
        Session session = bl.getSession();
        session.beginTransaction();
        session.save(masina);
        session.getTransaction().commit();
        session.close();

    }

    public void stergeMasina (Masini masina){
        Session session = bl.getSession();
        session.beginTransaction();
        session.delete(masina);
        session.getTransaction().commit();
        session.close();

    }

    public List<Masini> listeazaMasini(){
        Session session = bl.getSession();
        session.beginTransaction();
        CriteriaQuery<Masini> criteria = session.getCriteriaBuilder()
                .createQuery(Masini.class);
        criteria.from(Masini.class);
        List<Masini> masini = session
                .createQuery(criteria)
                .getResultList();

        session.getTransaction().commit();
        session.close();
        return masini;
    }
}
