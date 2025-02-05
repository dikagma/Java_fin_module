import java.util.Arrays;
import java.util.Scanner;

public class GestionEmployes {
    static int nb_ligne=50;
    private static int count = 0;
    //tableau d'employés
    static Employe[] employes = new Employe[nb_ligne];

    //recherche l'index la case contenant l'employé ayant l'id (la méthode renvoi -1 si elle ne trouve pas)
    static double rechercherId(int id){
        double position=-1;
        for(int j=0;j<employes.length;j++) {
            if(employes[j] !=null) { //controler la case vide
                if (employes[j].getId() == id) {
                    position = j;
                }
            }
        }
        return position;
    }

    static void printMenu() {
        System.out.println("-----Gestion des Employés-----");
        System.out.println("1. Ajouter un employé");
        System.out.println("2. Modifier un employé");
        System.out.println("3. Supprimer un employé");
        System.out.println("4. Afficher la liste des employés");
        System.out.println("5. Rechercher un employé");
        System.out.println("6. Calculer la masse salariale");
        System.out.println("7. Trier les employés");
        System.out.println("0. Quitter");
        System.out.println("\n");
    }

//Ajouter un employeur
static void ajouterEmploye(Employe employe)  {
        boolean existe=false;
        int i=0;
        //recherche l'index de la première case vide du tableau
        while(employes[i]!=null) {
                i++; // indexe de la case vide du tableau
        }
        //verifier si l'idenfiant de l'employé existe déjà dans le tableau
        for(int j=0;j<employes.length;j++) {
            if(employes[j]!=null) {
                if (employes[j].getId() == employe.getId()) {
                    existe = true;
                }
            }
        }

        if(!existe) {
            //verifier si le tableau n'est plein
            if(i<employes.length) {
                employes[i]=employe; //Ajouter un nouveau employé
            }
            else {
                //message d'erreur si le tableau est plein
                System.out.println("ERREUR : Vous ne pouvez plus ajouer un employé, il n' y a plus de place !!! ");
                System.out.println("\n");
            }

        }else{
            System.out.println("l'identifiant de l'employé  existe ");
            System.out.println("\n");
        }
}

static void modifierEmploye(int id, String nouveauNom, String nouveauPoste, double nouveauSalaire)  {
  double index =rechercherId(id);
  if(index !=-1) {
     Employe employe= new Employe();
     employe.setId(id);
     employe.setNom(nouveauNom);
     employe.setPoste(nouveauPoste);
     employe.setSalaire(nouveauSalaire);
     employes[(int)index]=employe;
  }
}

//Afficher tous les emplyés du tableau
static void  afficherEmployes(){
    System.out.println(" ------------Liste des Employés -------------");
    System.out.println(" Id  Nom  Poste   Salaire ");
    System.out.println(" --------------------------------------------");
        for(int i=0;i<employes.length;i++) {
            //Contrôle de la case vide
            if(employes[i]!=null) {
             System.out.println(employes[i].toString());
            }
        }
    System.out.println(" -------------------------------------------");
}
//Fonction de trie de la liste des employés par leur salaire. count correspond au nombre d'employé dans la liste
    public static void trierEmployesParSalaire(boolean ordreCroissant) {
        Arrays.sort(employes, 0, count, ordreCroissant ? Employe.compareParSalaire : Employe.compareParSalaire.reversed());
        afficherEmployes();
    }

/*


 */

/* rechercher un employé par nom ou par post; j'ai utilisé l'opérateur OU pour
   comparer le critère
   renseigné au nom ou au post.
 */
static void rechercherEmploye(String critere){
        for(int i=0;i<employes.length;i++) {
            if(employes[i]!=null) {
                if(employes[i].getNom().equals(critere) || employes[i].getPoste().equals(critere)) {
                    System.out.println(employes[i].toString());
                }else{
                    System.out.println("Le employe n'existe pas");
                    System.out.println("\n");
                }
            }
        }
}
//Calcul de la masse salarial
static double calculerMasseSalariale(){
    double masseSalariale=0;
    for(int i=0;i<employes.length;i++) {
        if(employes[i]!=null) {
            masseSalariale+=employes[i].getSalaire();
        }
    }
    return masseSalariale;
}
public static void main(String[] args) {
   while(true) {
       printMenu();
       System.out.println("Choisissez une option:");
       Scanner clavier = new Scanner(System.in);
       int menu=clavier.nextInt(); //variable recevant la valeur du menu choisit
       //déclaration de variable
       int idEmploye;
       String nomEmploye;
       String nomPost;
       double salaireEmploye;
       Employe employe;

       switch(menu) {
           case 1 :
               //recupération des valeurs saisies au clavier
               System.out.println("Saisissez l'id de l'employé");
               idEmploye=clavier.nextInt();
               System.out.println("Saisissez le nom de l'employé");
               nomEmploye=clavier.next();
               System.out.println("Saisissez le salaire de l'employé");
               salaireEmploye=clavier.nextDouble();
               System.out.println("Saisissez le post de l'employé");
               nomPost=clavier.next();
               // Création de l'objet employé et affectation de sa référence à la variable employé
               employe=new Employe();
               employe.setId(idEmploye);
               employe.setNom(nomEmploye);
               employe.setPoste(nomPost);
               employe.setSalaire(salaireEmploye);
               //Ajouter un employé
               ajouterEmploye(employe);
               break;
               case 2 :
                   //recupération des valeurs saisies au clavier
                   System.out.println("Saisissez l'id de l'employé");
                   idEmploye=clavier.nextInt();
                   System.out.println("Saisissez le nom de l'employé");
                   nomEmploye=clavier.next();
                   System.out.println("Saisissez le salaire de l'employé");
                   salaireEmploye=clavier.nextDouble();
                   System.out.println("Saisissez le post de l'employé");
                   nomPost=clavier.next();
                   //Modifier les informations d'employé
                   modifierEmploye(idEmploye, nomEmploye, nomPost, salaireEmploye);
                   break;
                   case 3 :

                       break;
                       case 4 :
                           afficherEmployes();
                           System.out.println("\n");
                           break;
                           case 5 :
                               System.out.println("Saisissez le critère qui es soit le nom ou le poste de l'employé");
                               String critere=clavier.next();
                                rechercherEmploye(critere);
                               break;
                               case 6 :
                                   System.out.println("La masse salariale est : " + calculerMasseSalariale());
                                   System.out.println("\n");
                                   break;
                                   case 7 :
                                       boolean critereValide=false;
                                       String ordre;
                                       do{
                                           System.out.println("Dans quel ordre  voulez vous trier : (c/d) c = croissant; d = décroissant");
                                           ordre=clavier.next();
                                           if(ordre.equals("c")) {
                                               trierEmployesParSalaire(true);
                                               critereValide=true;
                                           }
                                           if(ordre.equals("d")) {
                                               trierEmployesParSalaire(false);
                                               critereValide=true;
                                           }
                                       }while(critereValide!=true);

                                       break;
       }




   }
}

}
