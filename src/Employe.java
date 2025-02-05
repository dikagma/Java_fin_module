import java.util.Comparator;

public class Employe {
    int id;
    String nom;
    String poste;
    double salaire;

    public Employe() {
    }

    public Employe(int id, String nom, String poste, double salaire) {
        this.id = id;
        this.nom = nom;
        this.poste = poste;
        this.salaire = salaire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return
                id + " " + nom + " " +
                " " + poste + " " +
                salaire
                ;
    }
   //Méthode pour comparer les employés par salaire
    public static Comparator<Employe> compareParSalaire = Comparator.comparingDouble(Employe::getSalaire);
}
