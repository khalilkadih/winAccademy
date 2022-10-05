package WinAccademy.system;

import com.sun.org.glassfish.external.statistics.Stats;

import java.util.*;
import java.util.function.Predicate;

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
    public static void afficherNoteEtudiant(){
        System.out.println("Note  disponible est ");
        Main.note.stream().filter(note -> note instanceof Note).forEach(System.out::println);
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
        else System.out.println("user Not Found !!!");

    }
    public static void deleteMatiere( int idMatiere){
        Optional<Matiere> optionalMatiere = Main.matiere.stream().filter(matiere -> matiere instanceof Matiere && matiere.getIdMatiere()==((idMatiere))).findFirst();
        if(optionalMatiere.isPresent()){
            Matiere matiere= (Matiere) optionalMatiere.get();
            Main.matiere.remove(matiere);
            System.out.println("Matiere deleted Successfully");
        }
        else {
            System.out.println("Something Wrong !!!!");
        }

    }
    public static void showAllEtudiant(){
        System.out.println("les etudiant disponible est ");
        Main.users.stream().filter(user -> user instanceof Etudiant).forEach(System.out::println);


    }
    public static void showAllClass(){
        Main.classe.stream().filter(classe -> classe instanceof  Classe).forEach(System.out::println);
    }
    public static void ShowAllDepartement(){
        System.out.println("hello");
        Main.departement.stream().filter(dep -> dep instanceof Deparetement).forEach(System.out::println);
    }

    public static void ShowAllCollege() {
    Main.college.stream().filter(college -> college instanceof  College).forEach(System.out::println);

    }

    public static float avgNoteOfEtudiant(List<Note> list){
        float sum= 0;
        float avg=0;
        for (Note note : list){
            sum+=note.getNote();
            avg= sum/list.size();
            //System.out.println(avg);
        }
        return avg;
    }

    //insert data etudiant
    public static void InsertDataEtudiant() {
        Etudiant etudiant = new Etudiant();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer Cin");
        etudiant.setCin(sc.nextLine());
        System.out.println("Entrer Nom");
        etudiant.setNom(sc.nextLine());
        System.out.println("Entrer telephone");
        etudiant.setTelephone(sc.nextLine());
        System.out.println("Entrer Email");
        etudiant.setEmail(sc.nextLine());
        System.out.println("Entrer Password");
        etudiant.setPassword(sc.nextLine());
        System.out.println("Entrer professeur");
        etudiant.setIdProfesseur(sc.nextInt());
        System.out.println("Entrer class");
        etudiant.setIdClasse(sc.nextInt());
        System.out.println("Entrer parent");
        etudiant.setIdParent(sc.nextInt());
        System.out.println("Entrer Age");
        etudiant.setAge(sc.nextInt());
        System.out.println("Entrer Date d'inscription (jj/MM/AAAA");
        etudiant.setDateInscription(new Date());
        System.out.println("entrer votre adress");
        etudiant.setAdresses(sc.nextInt());
        Main.users.add(etudiant);
    }
    public static void InsertDataDirecteur() {
        Directeur directeur = new Directeur();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer Cin");
        directeur.setCin(sc.nextLine());
        System.out.println("Entrer Nom");
        directeur.setNom(sc.nextLine());
        System.out.println("Entrer telephone");
        directeur.setTelephone(sc.nextLine());
        System.out.println("Entrer Email");
        directeur.setEmail(sc.nextLine());
        System.out.println("Entrer Password");
        directeur.setPassword(sc.nextLine());
        System.out.println("Entrer directeur");
        directeur.setIdDirecteur(sc.nextInt());
        System.out.println("Entrer Age");
        directeur.setAge(sc.nextInt());
        System.out.println("Entrer Date d'inscription (jj/MM/AAAA");
        directeur.setDateInscription(new Date());
        System.out.println("entrer votre adress");
        directeur.setAdresses(sc.nextInt());
        Main.users.add(directeur);
    }
    public static void modifierDirecteurData(String cinProf){
        Optional<User> optionalDirecteur = Main.users.stream().filter(user -> user instanceof Directeur && user.getCin().equals((cinProf))).findFirst();
        if(optionalDirecteur.isPresent()){
            Professeur prof= (Professeur) optionalDirecteur.get();
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
            affichageInfoDirecteur();
        }
        else System.out.println("user Not Found !!!");

    }
    public static void affichageInfoDirecteur() {
        System.out.println("les Directeur disponible est ");
        Main.users.stream().filter(user -> user instanceof Directeur).forEach(System.out::println);
    }

    public static void InsertDataMatiere() {
        Matiere matiere = new Matiere();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer idMatiere");
        matiere.setIdMatiere(sc.nextInt());
        System.out.println("Entrer Nom Mateire");
        matiere.setNomMatiere(sc.nextLine());
        System.out.println("Entrer Salle Matiere");
        matiere.setSalle((Salle.Salle1));
        Main.matiere.add(matiere);
    }
    public static void affichageInfoMatiere() {
        System.out.println("les Matiere disponible est ");
        Main.matiere.stream().filter(matiere -> matiere instanceof Matiere).forEach(System.out::println);
    }

}






