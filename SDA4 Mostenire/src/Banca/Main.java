package Banca;

import Banca.Angajat.RolAngajat;

import java.util.Scanner;

public class Main
{
	public static void afiseazaMeniu () {
        System.out.println("1.Adauga angajat");
        System.out.println("2.Stergere angajat");
        System.out.println("3.Adaugare client");
        System.out.println("4.Stergere client");
        System.out.println("5.Afisare client");
        System.out.println("6.Afisare angajat");
        System.out.println("7.Retragere");
        System.out.println("8.Depunere");
        System.out.println("9.Interogare sold");
        System.out.println("10.Iesire");
        System.out.println("Introduceti optiunea: ");

    }
    public static void adaugaClient(Scanner scan, Angajat angajat)
    {
        System.out.println("Numele clientului");
        String nume = scan.next();
        System.out.println("CNP: ");
        String cnp = scan.next();
        Client client = new Client(cnp, nume);
        angajat.deschidereCont(client);
        System.out.println(" A fost creat clientul" + client);

    }
    public static void afiseazaClienti(Banca banca) {
        System.out.println(banca.getClienti());
    }

    public static void depunere (Scanner scan, Banca banca)
    {
        System.out.println("1.Depunere pe baza CNP");
        System.out.println("2.Depunere pe baza IBAN");
        Integer opt = scan.nextInt();
        if (opt ==1) {
            System.out.println("CNP: ");
            String cnp = scan.next();


        }
        else if (opt==2) {
            System.out.println("IBAN: ");
            String iban = scan.next();
            Client client = banca.cautareClientDupaIBAN(iban);
            if (client == null){
                //nu am gasit client cu acel IBAN
                //depunere();
                System.err.println("Nu am gasit contul");
                return;
            }
            System.out.println("Suma: ");
            Double suma = scan.nextDouble();
            client.alimentareCont(suma);

        }


    }

    public static void main(String[] args)
	{
		// aici se va intampla ceva
        Scanner scan = new Scanner(System.in);
        Banca banca= new Banca();
        Angajat angajat = new Angajat("1", "Ion", banca, RolAngajat.AGENT_VANZARI, "112");
        banca.adaugaAngajat(angajat);

        while (true)
        {
            afiseazaMeniu();
            Integer optiune= scan.nextInt();
            switch ( optiune)
            {
                case 3:
                    adaugaClient(scan, angajat);
                    break;
                case 5:
                    afiseazaClienti(banca);
                    break;
                case 8:
                    depunere(scan, banca);
                    break;
                case 9:
                    scan.close();
                    return;
                default:
                    System.err.println("Optiune inexistenta");

            }

        }

		
	}
}
