package Main;

import com.example.app.masini.db.Masini;
import com.example.app.masini.logic.LogicMasina;
import com.example.app.ui.Meniu;
import com.example.app.utilizatori.db.Utilizator;
import com.example.app.utilizatori.logic.LogicUtilizator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class Bl {

    private static final SessionFactory SESSION_FACTORY = startSessionFactory();
    private static final Session SESSION = SESSION_FACTORY.openSession();
    LogicUtilizator logicUtilizator;
    LogicMasina logicMasina;


    public static SessionFactory startSessionFactory() {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        MetadataSources sources = new MetadataSources(registry);
        Metadata metadata = sources.getMetadataBuilder().build();
        return metadata.getSessionFactoryBuilder().build();
    }

    public Session getSession() {
        return startSessionFactory().openSession();
    }

    public void start() {
        //TODO
        logicUtilizator = new LogicUtilizator(this);
        logicMasina = new LogicMasina(this);
        Meniu meniu = new Meniu(this);
        meniu.init();
    }

    public void adaugaUtilizator(Utilizator utilizator) {
        logicUtilizator.adaugaUtilizator(utilizator);

    }

    public void stergeUtilizator(Utilizator utilizator) {
        logicUtilizator.stergeUtilizator(utilizator);
    }

    public void adaugaMasina(Masini masina) {
        logicMasina.adaugaMasina(masina);
    }

    public void stergeMasina(Masini masina) {
        logicMasina.stergeMasina(masina);
    }

    public List<Utilizator> listeazaUtilizatori() {
        return logicUtilizator.listeazaUtilizatori();
    }

    public List<Masini> listeazaMasini() {
        return logicMasina.listeazaMasini();
    }

    public void inregistreazaMasinaUtilizatorului(Integer id_masina, Integer id_utilizator) {
        logicUtilizator.inregistreazaMasinaUtilizatorului(id_masina, id_utilizator);
    }

    public void deinregistreazaMasinaUtilizatorului(Integer id_masina, Integer id_utilizator) {
        logicUtilizator.deinregistrazaMasinaUtilizatorului(id_masina, id_utilizator);
    }

    public static void main(String[] args) {

        Bl bl = new Bl();
        bl.start();


//        session.beginTransaction();
//        Utilizator utilizator = session.get(Utilizator.class, 1);
//        Utilizator utilizator = new Utilizator(1, "Test2");
//        session.saveOrUpdate(utilizator);
//        Masini masina = new Masini(null, "Dacia", "2020", "B105CUB");
//        utilizator.getMasini().add(masina);
//        System.out.println(utilizator);
//        session.getTransaction().commit();
//        session.close();
    }
}
