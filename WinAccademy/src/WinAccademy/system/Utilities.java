package WinAccademy.system;

import java.util.*;

public class Utilities {
    public static boolean login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre your username");
        String name = sc.nextLine();
        System.out.println("Enter your password");
        String password = sc.nextLine();
        Optional<User> userOptional = Main.users.stream().filter(user -> user.getNom().equalsIgnoreCase(name) && user.getPassword().equals(password)).findFirst();
        if (userOptional.isPresent()) {
            Main.loggedInUser = userOptional.get();
        }
        return userOptional.isPresent();
    }
    public static void InsertDataProfesseur() {
        Professeur user = new Professeur();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer Cin");
        user.setCin(sc.nextLine());
        System.out.println("Entrer Nom");
        user.setNom(sc.nextLine());
        System.out.println("Entrer telephone");
        user.setTelephone(sc.nextLine());
        System.out.println("Entrer Email");
        user.setEmail(sc.nextLine());
        System.out.println("Entrer Age");
        user.setAge(sc.nextInt());
        System.out.println("Entrer Date d'inscription (jj/MM/AAAA");
        user.setDateInscription(new Date());
        System.out.println("entrer votre adress");
        user.setAdresses(sc.nextInt());
        Main.users.add(user);
    }
    public static void affichageInfoProfesseur() {
        System.out.println("les professeurs disponible est ");
        Main.users.stream().filter(user -> user instanceof Professeur).forEach(System.out::println);
    }
    public static void modifierProfesseurData(String cinProf){
       Optional<User> optionalProfesseur = Main.users.stream().filter(user -> user instanceof Professeur && user.getCin().equals((cinProf))).findFirst();
       if(optionalProfesseur.isPresent()){
           Professeur prof= (Professeur) optionalProfesseur.get();
           System.out.println("you can update now");
           Scanner sc= new Scanner(System.in);
           System.out.println("Entrer Nom");
           prof.setNom(sc.nextLine());
           System.out.println("Entrer telephone");
           prof.setTelephone(sc.nextLine());
           System.out.println("Entrer Email");
           prof.setEmail(sc.nextLine());
           System.out.println("Entrer Age");
           prof.setAge(sc.nextInt());
           System.out.println("Entrer Date d'inscription (jj/MM/AAAA");
           prof.setDateInscription(new Date());
           System.out.println("entrer votre adress");
           prof.setAdresses(sc.nextInt());
           System.out.println("Update Successfully");
           affichageInfoProfesseur();
       }
       else {
           System.out.println("user Not Found !!!");
       }
    }

    public static void afficherNoteEtudiant(){
        System.out.println("Note  disponible est ");
        Main.note.stream().filter(note -> note instanceof Note).forEach(System.out::println);
    }

}






