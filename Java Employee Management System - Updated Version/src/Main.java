import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Employe> employes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Menu principal
        while (true) {
            System.out.println("===== Menu =====");
            System.out.println("1. Afficher les employés");
            System.out.println("2. Ajouter un employé");
            System.out.println("3. Modifier un employé");
            System.out.println("4. Supprimer un employé");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option : ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour à la ligne après l'entier

            switch (choix) {
                case 1:
                    afficherEmployes();
                    break;
                case 2:
                    ajouterEmploye();
                    break;
                case 3:
                    modifierEmploye();
                    break;
                case 4:
                    supprimerEmploye();
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    return;  // Quitter le programme
                default:
                    System.out.println("Option invalide. Essayez à nouveau.");
            }
        }
    }

    // Méthode pour afficher les employés
    private static void afficherEmployes() {
        System.out.println("Matricule | Nom      | Prénom   | Âge | Poste   | Salaire");
        System.out.println("----------------------------------------------------------");
        for (Employe employe : employes) {
            System.out.println(employe);
        }
        System.out.println("----------------------------------------------------------");
    }

    // Méthode pour ajouter un employé
    private static void ajouterEmploye() {
        System.out.println("Ajout d'un employé :");
        System.out.print("Matricule : ");
        int matricule = scanner.nextInt();
        scanner.nextLine();  // Consommer la ligne

        System.out.print("Nom : ");
        String nom = scanner.nextLine();

        System.out.print("Prénom : ");
        String prenom = scanner.nextLine();

        System.out.print("Âge : ");
        int age = scanner.nextInt();

        System.out.print("Poste (1=Ouvrier, 2=Cadre, 3=Patron) : ");
        int poste = scanner.nextInt();
        scanner.nextLine();  // Consommer la ligne

        Employe employe;
        switch (poste) {
            case 1:
                System.out.print("Ancienneté : ");
                int ancienneté = scanner.nextInt();
                employe = new Ouvrier(matricule, nom, prenom, age, ancienneté);
                break;
            case 2:
                System.out.print("Indice : ");
                int indice = scanner.nextInt();
                employe = new Cadre(matricule, nom, prenom, age, indice);
                break;
            case 3:
                System.out.print("Chiffre d'affaire : ");
                double chiffreAffaire = scanner.nextDouble();
                System.out.print("Pourcentage : ");
                double pourcentage = scanner.nextDouble();
                employe = new Patron(matricule, nom, prenom, age, chiffreAffaire, pourcentage);
                break;
            default:
                System.out.println("Poste invalide.");
                return;
        }

        employes.add(employe);
        System.out.println("Employé ajouté avec succès !");
    }

    // Méthode pour modifier un employé
    private static void modifierEmploye() {
        System.out.print("Entrez le matricule de l'employé à modifier : ");
        int matricule = scanner.nextInt();
        scanner.nextLine();  // Consommer la ligne

        Employe employe = trouverEmploye(matricule);
        if (employe != null) {
            System.out.print("Nom (actuel: " + employe.getNom() + ") : ");
            String nom = scanner.nextLine();
            employe.setNom(nom);

            System.out.print("Prénom (actuel: " + employe.getPrenom() + ") : ");
            String prenom = scanner.nextLine();
            employe.setPrenom(prenom);

            System.out.print("Âge (actuel: " + employe.getAge() + ") : ");
            int age = scanner.nextInt();
            scanner.nextLine();  // Consommer la ligne
            employe.setAge(age);

            System.out.println("Employé modifié avec succès !");
        } else {
            System.out.println("Employé non trouvé.");
        }
    }

    // Méthode pour supprimer un employé
    private static void supprimerEmploye() {
        System.out.print("Entrez le matricule de l'employé à supprimer : ");
        int matricule = scanner.nextInt();
        scanner.nextLine();  // Consommer la ligne

        Employe employe = trouverEmploye(matricule);
        if (employe != null) {
            employes.remove(employe);
            System.out.println("Employé supprimé avec succès !");
        } else {
            System.out.println("Employé non trouvé.");
        }
    }

    // Méthode pour trouver un employé par matricule
    private static Employe trouverEmploye(int matricule) {
        for (Employe employe : employes) {
            if (employe.getMatricule() == matricule) {
                return employe;
            }
        }
        return null;







        /*Employe[] employe = new Employe[3];

        employe[0] = new Ouvrier(123,"habib", "babib" , 20 ,4);
        employe[1] = new Cadre(456, "bylel" , "bylel" , 21 , 3);
        employe[2] = new Patron(789, "iyed","ben cheikh ahmed" , 20 , 1200000 , 15);

        for(int i=0 ; i< employe.length ; i++){
            System.out.println(employe[i]);
            System.out.println( );
        }*/


    }
}