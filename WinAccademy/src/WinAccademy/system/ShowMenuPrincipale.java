package WinAccademy.system;

import java.util.Scanner;

public class ShowMenuPrincipale {
    public static void ShowMenuPrincipale( User user)
    {
        if(user.getRole().equals(Role.Admin)){
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println(" \t\t\t\tWelcome to WinAccademy!");
            System.out.println(" \t\t\t\tMenu Principale!");
            System.out.println(" 1:Ajouter Directeur");
            System.out.println(" 2: Modifier Directeur");
            System.out.println(" 3: Afficher Directeur");
            System.out.println(" 3: Afficher Profile");
            System.out.println("Veillez-vous Choisir votre choix");
            Scanner sc = new Scanner(System.in);
            int selectionAdmin= sc.nextInt();
            do{
                System.out.println("<><><><><> le choix saisir pas disponible dans le menu <><><><><>");
                System.out.println("        Veillez-vous Choisir votre choix");

                selectionAdmin= sc.nextInt();

            }while (selectionAdmin<1 || selectionAdmin>4);
            switch (selectionAdmin){
                case 1:
                    System.out.println("option 1 selected");
                    break;
                case 2:
                    System.out.println("option 2 selected");
                    break;
                case 3:
                    System.out.println("option 3 selected");
                    break;
                case 4:
                    System.out.println("option 4 selected");
                    break;
                default:
                    System.out.println("pour retenir a la menu principale taper une touche");
            }


        }else if (user.getRole().equals(Role.Directeur)){
        System.out.println("=================================================================");
        System.out.println("=================================================================");
        System.out.println("=================================================================");
        System.out.println("=================================================================");
        System.out.println(" \t\t\t\tWelcome to WinAccademy!");
        System.out.println(" \t\t\t\tMenu Principale!");
        System.out.println(" 1:Ajouter professeur");
        System.out.println(" 2: Modifier professeur");
        System.out.println(" 3: afficher professeur/professeurs");
        System.out.println(" 4:Ajouter Matiere");
        System.out.println(" 5: Modifier Matiere");
        System.out.println(" 6: Supprimer Matiere");
        System.out.println(" 7:Ajouter etudiant");
        System.out.println(" 8: Modifier etudiant");
        System.out.println(" 9: afficher etudiant/etudiantS");
            System.out.println(" &à: Afficher Profile");System.out.println("Veillez-vous Choisir votre choix");
            Scanner sc = new Scanner(System.in);
            int selectionDirecteur= sc.nextInt();
            do{
                System.out.println("<><><><><> le choix saisir pas disponible dans le menu <><><><><>");
                System.out.println("        Veillez-vous Choisir votre choix");

                selectionDirecteur= sc.nextInt();

            }while (selectionDirecteur<1 || selectionDirecteur>9);
            switch (selectionDirecteur){
                case 1:
                    System.out.println("option 1 selected");
                    break;
                case 2:
                    System.out.println("option 2 selected");
                    break;
                case 3:
                    System.out.println("option 3 selected");
                    break;
                case 4:
                    System.out.println("option 4 selected");
                    break;
                case 5:
                    System.out.println("option 4 selected");
                    break;
                case 6:
                    System.out.println("option 4 selected");
                    break;
                case 7:
                    System.out.println("option 4 selected");
                    break;
                case 8:
                    System.out.println("option 4 selected");
                    break;
                case 9:
                    System.out.println("option 4 selected");
                    break;
                default:
                    System.out.println("pour retenir a la menu principale taper une touche");
            }


        }
        else if(user.getRole().equals(Role.Professeur)){
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
            System.out.println("Veillez-vous Choisir votre choix");
            Scanner sc = new Scanner(System.in);
            int selectionProfesseur= sc.nextInt();
            do{
                System.out.println("<><><><><> le choix saisir pas disponible dans le menu <><><><><>");
                System.out.println("        Veillez-vous Choisir votre choix");

                selectionProfesseur= sc.nextInt();

            }while (selectionProfesseur<1 || selectionProfesseur>4);
            switch (selectionProfesseur){
                case 1:
                    System.out.println("option 1 selected");
                    break;
                case 2:
                    System.out.println("option 2 selected");
                    break;
                case 3:
                    System.out.println("option 3 selected");
                    break;
                case 4:
                    System.out.println("option 4 selected");
                    break;
                default:
                    System.out.println("pour retenir a la menu principale taper une touche");
            }


        }
        else if(user.getRole().equals(Role.Etudiant)){
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println(" \t\t\t\tWelcome to WinAccademy!");
            System.out.println(" \t\t\t\tMenu Principale!");
            System.out.println(" 1: Afficher votre note ");
            System.out.println(" 2: Afficher votre profile ");
            System.out.println("Veillez-vous Choisir votre choix");
            Scanner sc = new Scanner(System.in);
            int selectionEtudiant= sc.nextInt();
            do{
                System.out.println("<><><><><> le choix saisir pas disponible dans le menu <><><><><>");
                System.out.println("        Veillez-vous Choisir votre choix");

                selectionEtudiant= sc.nextInt();

            }while (selectionEtudiant<1 || selectionEtudiant>2);
            switch (selectionEtudiant){
                case 1:
                    System.out.println("option 1 selected");
                    break;
                case 2:
                    System.out.println("option 2 selected");
                    break;
                default:
                    System.out.println("pour retenir a la menu principale taper une touche");
            }


        }else if(user.getRole().equals(Role.Parent)){
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println(" \t\t\t\tWelcome to WinAccademy!");
            System.out.println(" \t\t\t\tMenu Principale!");
            System.out.println(" 1: Afficher la note ");
            System.out.println(" 1: Afficher votre profile ");
            //System.out.println(user.getAge());
            System.out.println("Veillez-vous Choisir votre choix");
            Scanner sc = new Scanner(System.in);
            int selectionParent= sc.nextInt();
            do{
                System.out.println("<><><><><> le choix saisir pas disponible dans le menu <><><><><>");
                System.out.println("        Veillez-vous Choisir votre choix");

                selectionParent= sc.nextInt();

            }while (selectionParent<1 || selectionParent>2);
            switch (selectionParent){
                case 1:
                    System.out.println("option 1 selected");
                    break;
                case 2:
                    System.out.println("option 2 selected");
                    break;

                default:
                    System.out.println("pour retenir a la menu principale taper une touche");
            }


        }

        }



}
