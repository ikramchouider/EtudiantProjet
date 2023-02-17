public class Scolarite {
    private int NBetudiant;
    private Etudiant[] etudiant = new Etudiant[500];

    public Scolarite() {

    }

    public void Add(Etudiant etudiant) {

        if (this.etudiant.length < NBetudiant) {
            this.etudiant[NBetudiant] = etudiant;
            NBetudiant++;
        } else {
            System.out.println("vous ne pouvez pas ajouter un nouveau etudiant");

        }

    }

    public int nbEtudiant() {
        return (NBetudiant);
    }

    public void afficher() {
        System.out.println("******Scholarite********");
        for (int i = 0; i < NBetudiant; i++) {
            etudiant[i].afficher();
            System.out.println("Moyenne: " + etudiant[i].Calculermoyen());
        }
    }

    public void afficher(double m) {
        System.out.println("******Scholarite********");
        for (int i = 0; i < NBetudiant; i++) {
            if (etudiant[i].Calculermoyen() > m) {
                etudiant[i].afficher();
                System.out.println("Moyenne: " + etudiant[i].Calculermoyen());
            }
        }

    }

}
