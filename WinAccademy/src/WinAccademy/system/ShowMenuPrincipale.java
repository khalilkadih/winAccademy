package WinAccademy.system;

import java.util.Scanner;

public class ShowMenuPrincipale {
    public static void ShowMenuPrincipale(User user) {
        if (user.getRole().equals(Role.Admin)) {
           /* System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println("=================================================================");*/
            System.out.println(" \t\t\t\t   Welcome to WinAccademy!     ");
            System.out.println(" \t\t\t\t   Menu Principale!            ");
            System.out.println(" 1:Ajouter Directeur");
            System.out.println(" 2:Modifier Directeur");
            System.out.println(" 3:Afficher Directeur");
            System.out.println(" 4:Show All College");
            System.out.println(" 5:Afficher Profile");

            Scanner sc = new Scanner(System.in);
            int selectionAdmin;
            do {
                System.out.println("        Veillez-vous Choisir votre choix");
                selectionAdmin = sc.nextInt();

            } while (selectionAdmin < 1 || selectionAdmin > 4);
            switch (selectionAdmin) {
                case 1:
                    System.out.println("1:Ajouter Directeur");


                    break;
                case 2:
                    System.out.println("2: Modifier Directeur\"");
                    System.out.println("Entrer Cin of user");
                    sc=new Scanner(System.in);
                    String cinDirecteur = sc.nextLine();
                   Utilities.modifierDirecteurData(cinDirecteur);
                   ShowMenuPrincipale.ShowMenuPrincipale(user);
                    break;
                case 3:
                    System.out.println("3: Afficher Directeurs");
                    Utilities.InsertDataDirecteur();
                    break;
                case 4:
                    System.out.println("All College Dispo :");
                    Utilities.ShowAllCollege();
                    break;
                case 5:
                    System.out.println("6: Afficher Profile");
                    break;
                default:
                    System.out.println("pour retenir a la menu principale taper une touche");
            }
        } else if (user.getRole().equals(Role.Directeur)) {
     /*   System.out.println("=================================================================");
        System.out.println("=================================================================");
        System.out.println("=================================================================");
        System.out.println("=================================================================");*/
            System.out.println(" \t\t\t\tWelcome to WinAccademy!");
            System.out.println(" \t\t\t\tMenu Principale!");
            System.out.println(" 1:Ajouter professeur");
            System.out.println(" 2:Modifier professeur");
            System.out.println(" 3:afficher professeur/professeurs");
            System.out.println(" 4:Ajouter Matiere");
            System.out.println(" 5:Modifier Matiere");
            System.out.println(" 6:Supprimer Matiere");
            System.out.println(" 7:Ajouter etudiant");
            System.out.println(" 8:Modifier etudiant");
            System.out.println(" 9:afficher etudiant/etudiants");
            System.out.println("10:Show All  Departement");
            System.out.println("11:Show All Classse");
            System.out.println("12:Calcule Moyen Note d'etudiant");
            System.out.println("13:Afficher Profile");

            Scanner sc = new Scanner(System.in);
            int selectionDirecteur;
            do {
/*
                System.out.println("<><><><><> le choix saisir pas disponible dans le menu <><><><><>");
*/
                System.out.println("        Veillez-vous Choisir votre choix");

                selectionDirecteur = sc.nextInt();

            } while (selectionDirecteur < 1 || selectionDirecteur > 14);
            switch (selectionDirecteur) {
                case 1:
                    System.out.println(" 1:Ajouter professeur");
                    Utilities.InsertDataProfesseur();
                    ShowMenuPrincipale(user);
                    break;
                case 2:
                    System.out.println("2: Modifier professeur");
                    System.out.println("Entrer Cin of user");
                    sc=new Scanner(System.in);
                    String cinProfesseur = sc.nextLine();
                    Utilities.modifierProfesseurData(cinProfesseur);
                    break;
                case 3:
                    System.out.println("3: afficher professeurs");
                    Utilities.affichageInfoProfesseur();
                    ShowMenuPrincipale(user);

                    break;
                case 4:
                    System.out.println("4:Ajouter Matiere");
                    break;
                case 5:
                    System.out.println("5 :Modifier Matiere");
                    break;
                case 6:
                    System.out.println(" 6 : Supprimer Matiere");
                    System.out.println("Enter id of Matiere you want to delete");
                    sc=new Scanner(System.in);
                    int idMatiereDelete= sc.nextInt();
                    System.out.println(" Size of Aarray of Matiere Befor :"+Main.matiere.size());
                    Utilities.deleteMatiere(idMatiereDelete);
                    System.out.println(" Size of Aarray of Matiere After :"+Main.matiere.size());
                    break;
                case 7:
                    System.out.println(" 7 : Ajouter etudiant");
                    Utilities.InsertDataEtudiant();
                    Utilities.showAllEtudiant();
                    ShowMenuPrincipale.ShowMenuPrincipale(user);
                    break;
                case 8:
                    System.out.println("8 : Modifier etudiant");
                    break;
                case 9:
                    System.out.println("9: afficher etudiants");
                    Utilities.showAllEtudiant();

                    break;
                case 10:
                    System.out.println("5: Show All  Departement");
                    Utilities.ShowAllDepartement();
                    break;
                case 11:
                    System.out.println("Show All Classe");
                    Utilities.showAllClass();
                    break;
                case 12:
                    System.out.println("Moyen de departement");
                    System.out.println( "La Moyen de la departement est :"+Utilities.avgNoteOfEtudiant(Main.note));
                    System.out.println("end");
                    break;
                case 13:
                    System.out.println("11: Afficher Profile");
                    break;
                default:
                    System.out.println("pour retenir a la menu principale taper une touche");
            }

        } else if (user.getRole().equals(Role.Professeur)) {
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println(" \t\t\t\tWelcome to WinAccademy!");
            System.out.println(" \t\t\t\tMenu Principale!");
            System.out.println(" 1:Ajouter Note");
            System.out.println(" 2: Modifier Note");
            System.out.println(" 2: Afficher Note");
            System.out.println(" 4: Afficher Profile");
            Scanner sc = new Scanner(System.in);
            int selectionProfesseur;
            do {
/*
                System.out.println("<><><><><> le choix saisir pas disponible dans le menu <><><><><>");
*/
                System.out.println("        Veillez-vous Choisir votre choix");

                selectionProfesseur = sc.nextInt();

            } while (selectionProfesseur < 1 || selectionProfesseur > 4);
            switch (selectionProfesseur) {
                case 1:
                    System.out.println("1:Ajouter Note");
                    break;
                case 2:
                    System.out.println(" 2: Modifier Note");
                    break;
                case 3:
                    System.out.println("2: Afficher Note");
                    break;
                case 4:
                    System.out.println("Afficher Profile");
                    ShowProfils(user);
                    break;
                default:
                    System.out.println("pour retenir a la menu principale taper une touche");
            }


        } else if (user.getRole().equals(Role.Etudiant)) {
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println(" \t\t\t\tWelcome to WinAccademy!");
            System.out.println(" \t\t\t\tMenu Principale!");
            System.out.println(" 1: Afficher votre note ");
            System.out.println(" 2: Afficher votre profile ");
            Scanner sc = new Scanner(System.in);
            int selectionEtudiant;
            do {
/*
                System.out.println("<><><><><> le choix saisir pas disponible dans le menu <><><><><>");
*/
                System.out.println("        Veillez-vous Choisir votre choix");

                selectionEtudiant = sc.nextInt();

            } while (selectionEtudiant < 1 || selectionEtudiant > 2);
            switch (selectionEtudiant) {
                case 1:
                    System.out.println(" 1: Afficher votre note ");
                    Utilities.afficherNoteEtudiant();
                    break;
                case 2:
                    System.out.println("2: Afficher votre profile ");
                    ShowProfils(user);
                    break;
                default:
                    System.out.println("pour retenir a la menu principale taper une touche");
            }
        } else if (user.getRole().equals(Role.Parent)) {
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println(" \t\t\t\tWelcome to WinAccademy!");
            System.out.println(" \t\t\t\tMenu Principale!");
            System.out.println(" 1: Afficher la note ");
            System.out.println(" 2: Afficher votre profile ");
            Scanner sc = new Scanner(System.in);
            int selectionParent;
            do {
/*
                System.out.println("<><><><><> le choix saisir pas disponible dans le menu <><><><><>");
*/
                System.out.println("        Veillez-vous Choisir votre choix");
                selectionParent = sc.nextInt();
            } while (selectionParent < 1 || selectionParent > 2);
            switch (selectionParent) {
                case 1:
                    System.out.println("1: Afficher la note");
                    Utilities.afficherNoteEtudiant();
                    break;
                case 2:
                    System.out.println("2: Afficher votre profile");
                    ShowProfils(user);
                    break;
                default:
                    System.out.println("pour retenir a la menu principale taper une touche");
            }
        }
    }
    public static void ShowProfils(User user) {
        System.out.println(user.toString());

    }


}
