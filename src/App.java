import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Etudiant etudiant = new Etudiant("Chouider", "Ikram", "210217", 04.5, 1.0, 6.5);
        etudiant.afficher();
        System.out.println("Moyenne : " + etudiant.Calculermoyen());
        Etudiant etudian2 = new Etudiant("Dorbane", "Serine", "210218");
        Scanner sc = new Scanner(System.in);
        System.out.print("Module1 : ");
        double m1 = sc.nextDouble();
        etudian2.setmodule(m1, 0);
        System.out.print("Module2 : ");
        double m2 = sc.nextDouble();
        etudian2.setmodule(m2, 1);
        System.out.print("Module3 : ");
        double m3 = sc.nextDouble();
        etudian2.setmodule(m3, 2);
        sc.close();
        etudian2.afficher();
        System.out.println("Moyenne : " + etudian2.Calculermoyen());
        Scolarite school = new Scolarite();
        school.Add(etudiant);
        school.Add(etudian2);
        school.Add(new Etudiant("kim", "soekjin", "2107219", 19.0, 18.5, 17));
        school.afficher();
        school.afficher(12);
    }
}
