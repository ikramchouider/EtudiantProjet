public class Etudiant {
    private String nom;
    private String prenom;
    private String matricule;
    private double[] module = new double[3];

    public Etudiant(String string, String string2, String string3, double m1, double m2, double m3) {
        nom = string;
        prenom = string2;
        matricule = string3;
        module[0] = m1;
        module[1] = m2;
        module[2] = m3;
    }

    public Etudiant(String string, String string2, String string3) {
        nom = string;
        prenom = string2;
        matricule = string3;
    }

    public double Calculermoyen() {
        double Moyenne;
        double Somme = 0;
        for (int i = 0; i < module.length; i++)
            Somme = module[i] + Somme;
        Moyenne = Somme / module.length;
        return (Moyenne);
    }

    public double getmodule(int numModule) {
        return (module[numModule]);
    }

    public void setmodule(double m, int numModule) {
        module[numModule] = m;
    }

    public void afficher() {
        System.out.println("Nom : " + nom + " Prenom : " + prenom + " Matricule : " + matricule);
        for (int i = 0; i < module.length; i++) {
            System.out.print("Module " + i + " : " + module[i] + "\t");
        }
    }

}