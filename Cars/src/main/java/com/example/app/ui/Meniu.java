package com.example.app.ui;

import Main.Bl;
import com.example.app.masini.db.Masini;
import com.example.app.masini.logic.LogicMasina;
import com.example.app.utilizatori.db.Utilizator;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Meniu {

    private Bl bl;

    public Meniu (Bl bl){
        this.bl=bl;
    }

    public void adaugaUtilizator (Scanner scan) {
        System.out.println("Care este numele utilizatorului? ");
        String nume = scan.nextLine();
        bl.adaugaUtilizator (new Utilizator(null, nume));
    }

    public void stergeUtilizator (Scanner scan) {
        System.out.println("Ce utilizator stergem?");
        Integer Id = scan.nextInt();
        bl.stergeUtilizator(new Utilizator(Id,null));
    }

    public void adaugaMasina (Scanner scan) {
        System.out.println("Care este marca masinii?");
        String marca = scan.nextLine();
        System.out.println("Care este modelul masinii?");
        String model = scan.nextLine();
        System.out.println("Care este numarul masinii?");
        String numar = scan.nextLine();
        bl.adaugaMasina(new Masini(null, marca, model, numar));
    }

    public void stergeMasina (Scanner scan){
        System.out.println("Care este id masinii?");
        Integer id = scan.nextInt();
        bl.stergeMasina(new Masini(id, null, null, null));
    }

    public void listeazaUtilizatori(){
        System.out.println("Listam utilizatorii");
        List<Utilizator> utilizatori= bl.listeazaUtilizatori();
        for (Utilizator u:utilizatori) {
            System.out.println("Id: " +u.getId());
            System.out.println("Nume: " +u.getNume());
            System.out.println("Masina" + u.getMasini());
            System.out.println("----------------------");
        }
    }

    public void listeazaMasini(){
        System.out.println("Listam masinile");
        List<Masini> masini = bl.listeazaMasini();
        for(Masini m :masini) {
            System.out.println("Id: " + m.getId());
            System.out.println("Marca: " + m.getMarca());
            System.out.println("Model: " + m.getModel());
            System.out.println("Numar: " + m.getNumar());
            System.out.println("-----------------------");
        }
    }

    public void listeazaMasiniUtilizator(Scanner scan) {
        System.out.println("Id utilizator?");
        Integer id = scan.nextInt();
        List<Utilizator> utilizatori = bl.listeazaUtilizatori();
        for (Utilizator u : utilizatori) {
            if(u.getId()==id) {
                System.out.println("Id: " + id);
                System.out.println("Nume: " + u.getNume());
                System.out.println("Masina" + u.getMasini());
                System.out.println("----------------------");
            }
        }
    }

    public void inregistreazaMasinaUtilizatorului(Scanner scan){
        System.out.println("Id masina?");
        Integer id_masina = scan.nextInt();
        System.out.println("Id utilizator?");
        Integer id_utilizator = scan.nextInt();
        bl.inregistreazaMasinaUtilizatorului(id_masina, id_utilizator);
    }

    public void deinregistreazaMasinaUtilizatorului (Scanner scan){
        System.out.println("Id masina?");
        Integer id_masina = scan.nextInt();
        System.out.println("Id utilizator?");
        Integer id_utilizator = scan.nextInt();
        bl.deinregistreazaMasinaUtilizatorului(id_masina, id_utilizator);
    }

    private void printMainMenu(){
        System.out.println("1. Adauga utilizator");
        System.out.println("2. Adauga masina");
        System.out.println("3. Listeaza utilizatori");
        System.out.println("4. Listeaza masini");
        System.out.println("5. Inregistreaza masina unui utilizator");
        System.out.println("6. Deinregistreaza masina");
        System.out.println("7. Sterge utilizator");
        System.out.println("8. Sterge masina");
        System.out.println("9. Listeaza masinile unui utilizator");
        System.out.println("10. Exit");

    }

    public void init() {
        Scanner scan = new Scanner(System.in);

        while (true)
        {
            printMainMenu();
            System.out.println("Va rugam introduceti un numar corespunzator unei optiuni");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice){
                case 1:
                adaugaUtilizator(scan);
                    break;
                case 2:
                    adaugaMasina(scan);
                    break;
                case 3:
                    listeazaUtilizatori();
                    break;
                case 4:
                    listeazaMasini();
                    break;
                case 5:
                inregistreazaMasinaUtilizatorului(scan);
                break;
                case 6:
                deinregistreazaMasinaUtilizatorului(scan);
                    break;
                case 7:
                stergeUtilizator(scan);
                break;
                case 8:
                stergeMasina(scan);
                break;
                case 9:
                listeazaMasiniUtilizator(scan);
                break;
                case 10:
                    return;
                default:
                    break;
            }
        }
    }
}
