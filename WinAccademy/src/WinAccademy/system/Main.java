package WinAccademy.system;

import java.util.*;

public class Main {
     static List<User> users = new ArrayList<>();
     static List<Adress> adresses = new ArrayList<>();
     static List<Classe> classe = new ArrayList<>();
     static List<College> college = new ArrayList<>();
     static List<Deparetement> departement = new ArrayList<>();
     static List<Matiere> matiere = new ArrayList<>();
     static List<Note> note = new ArrayList<>();
     static List<Responsable> responsable = new ArrayList<>();
/*
     static List<Salle> salle = new ArrayList<>();
*/

     static  User loggedInUser ;
    public static void main(String[] args) {
        insertData();
        while(!Utilities.login()){
            System.out.println("Les infos Incorrect !!!");
        };
        ShowMenuPrincipale.ShowMenuPrincipale(loggedInUser);


    }
     public  static  void insertData(){

         Adress adress1 =new Adress(1,"maroc","Agadir","av agadir");
         Adress adress2 =new Adress(1,"maroc","youssoufia","av Youssoufia");
         adresses.add(adress1);
         adresses.add(adress2);
        users.add(new User("JT42796","khalil","0666666666","khalil@gmail.com","khalil@",28,Arrays.asList(adress1) , Role.Etudiant,new Date()));
        users.add(new User("JT11111","BOUCHRA","066666666","bouchra@gmail.com","bouchra@",30, Arrays.asList(adress1),Role.Professeur,new Date()));
        users.add(new User("JT22222","Mourad","0666666666","mourad@gmail.com","mourad@",33, Arrays.asList(adress1),Role.Directeur,new Date()));
        users.add(new User("JT33333","Adil","0666666666","adil@gmail.com","adil@",33, Arrays.asList(adress1),Role.Admin,new Date()));
        users.add(new User("JT44444","ABDO","0666666666","abdo@gmail.com","abdo@",55, Arrays.asList(adress1),Role.Parent,new Date()));
       //Ajouter les classe
        classe.add(new Classe(1,"class of java",new Date(2022,10,22),1));
        classe.add(new Classe(2,"class of js",new Date(2022,10,22),1));

        //Ajouter les colleges

         college.add(new College(1,"compus youssoufia",1,1));
         college.add(new College(2,"Asfi",2,2));

         //Ajouter departement
         departement.add( new Deparetement(1,"departement of java ",1));
         departement.add( new Deparetement(2,"departement of js ",1));

         //ajouter Matiere
         matiere.add(new Matiere(1,"concept of java",Salle.Salle1));
         matiere.add(new Matiere(2,"concept of js",Salle.salle2));
         matiere.add(new Matiere(3,"concept of c3",Salle.salle4));

         //Ajouter Note
         note.add(new Note(1,"tres bien ",16,new Date(2022,10,22),"sprint 1",1,1));
         note.add(new Note(2,"bien ",15,new Date(2022,10,22),"sprint 1",1,2));
         note.add(new Note(3,"tres bien ",16,new Date(2022,10,22),"sprint 1",1,3));

         // Ajouter Responsable
         responsable.add(new Responsable(1,1,1));
         responsable.add(new Responsable(2,1,2));
         responsable.add(new Responsable(3,1,3));


         //ajouter salle






    }
}