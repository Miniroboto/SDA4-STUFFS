package com.example.app.utilizatori.logic;

import Main.Bl;
import com.example.app.masini.db.Masini;
import com.example.app.utilizatori.db.Utilizator;
import org.hibernate.Session;

import javax.persistence.Id;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;


public class LogicUtilizator {
    private Bl bl;

    public LogicUtilizator (Bl bl) {
        this.bl=bl;
    }

    public void adaugaUtilizator (Utilizator utilizator) {
        Session session = bl.getSession();
        session.beginTransaction();
        session.save(utilizator);
        session.getTransaction().commit();
        session.close();

    }

    public void stergeUtilizator (Utilizator utilizator) {
        Session session = bl.getSession();
        session.beginTransaction();
        session.delete(utilizator);
        session.getTransaction().commit();
        session.close();

    }

    public List<Utilizator> listeazaUtilizatori(){
        Session session = bl.getSession();
        session.beginTransaction();
        CriteriaQuery<Utilizator> criteria = session.getCriteriaBuilder()
                .createQuery(Utilizator.class);
        criteria.from(Utilizator.class);
        List<Utilizator> utilizator = session
                .createQuery(criteria)
                .getResultList();

        session.getTransaction().commit();
        session.close();
       return utilizator;
    }



    public void inregistreazaMasinaUtilizatorului(Integer id_masina, Integer id_utilizator){
        Session session = bl.getSession();
        session.beginTransaction();
        Masini masina = session.get(Masini.class, id_masina);
        Utilizator utilizator = session.load(Utilizator.class, id_utilizator);

        if(masina !=null && utilizator!=null){
            utilizator.getMasini().add(masina);
            session.update(utilizator);

        }

        session.getTransaction().commit();
        session.close();
    }
    public void deinregistrazaMasinaUtilizatorului(Integer Id_masina, Integer Id_utilizator) {
        Session session = bl.getSession();
        session.beginTransaction();
        Masini masina = session.get(Masini.class, Id_masina);
        Utilizator utilizator = session.get(Utilizator.class, Id_utilizator);

        if (masina !=null && utilizator !=null) {
            utilizator.getMasini().remove(masina);
            session.update(utilizator);
        }
        session.getTransaction().commit();
        session.close();
    }

}
