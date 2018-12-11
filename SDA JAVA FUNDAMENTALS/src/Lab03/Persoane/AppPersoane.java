package Lab03.Persoane;

import java.util.Scanner;

public class AppPersoane {

    public static void main(String[] args) {

        Student stud1 = new Student("Deuterium", "Hanibal", 33, "jandarm");
        stud1.setStudii("brutar");
        stud1.setSpecialitate("Kung Fu fighter");
        stud1.setGrupa(1);

        Persoana[] om = new Persoana[4];

        Scanner in = new Scanner(System.in);


        om[0]= new Student("Corcodelius", "Ablachim", 18,"zidar");
        om[1]= new Profesor();
        om[2]= stud1;
        om[3]= new Profesor();
        ((Student)om[0]).setSpecialitate("Hornar");

    for (int i=0; i< om.length;i++) {
        System.out.println(om[i]);
    }


    System.out.println("Introduceti nume de cautat:");
    String nume = in.nextLine();
        for (int i=0; i< om.length;i++){
            if (nume.equals(om[i].nume)) {
                System.out.println("Bingo, avem un match.Numele cautat este " + om[i].nume);
            }
        }

    }

}
