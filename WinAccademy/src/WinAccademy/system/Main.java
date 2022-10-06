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


     static  User loggedInUser ;
    public static void main(String[] args) {
        insertData();
      while(!Utilities.login()){
            System.out.println("Les infos Incorrect !!!");
        };
        ShowMenuPrincipale.ShowMenuPrincipale(loggedInUser)
;
    }
     public  static  void insertData(){
        Adress agadirAdress =new Adress(1,"maroc","Agadir","av agadir");
        Adress youssoufiaAdress =new Adress(2,"maroc","youssoufia","av Youssoufia");
        adresses.add(agadirAdress);
        adresses.add(youssoufiaAdress);

        users.add(new Etudiant("JT42796","khalil","0666666666","khalil@gmail.com","khalil@",28,agadirAdress.getId() , Role.Etudiant,new Date(),1,1,1,1));
        users.add(new Professeur("JT11111","BOUCHRA","066666666","bouchra@gmail.com","bouchra@",30, agadirAdress.getId(),Role.Professeur,new Date(),1,1,1));
        users.add(new User("JT22222","Mourad","0666666666","mourad@gmail.com","mourad@",33, agadirAdress.getId(),Role.Directeur,new Date()));
        users.add(new User("JT33333","Adil","0666666666","adil@gmail.com","adil@",33, agadirAdress.getId(),Role.Admin,new Date()));
        users.add(new User("JT44444","ABDO","0666666666","abdo@gmail.com","abdo@",55, agadirAdress.getId(),Role.Parent,new Date()));
        users.add(new Admin("JT12345","adilo","0666666666","adilo@gmail.com","adilo@",44,youssoufiaAdress.getId(),Role.Admin,new Date()));
        users.add(new Etudiant("JT42799","omar","066666","omar@gmail.com","omar@",26,agadirAdress.getId(),Role.Etudiant,new Date(),2,1,2,1));
        users.add(new Etudiant("JT42798","agra","066666","agra@gmail.com","agra@",26,agadirAdress.getId(),Role.Etudiant,new Date(),2,1,2,1));
        users.add(new Professeur("JT66765","ahmed","09876543","ahmed@gmail.com","ahmed@",30,agadirAdress.getId(),Role.Professeur,new Date(),6,5,2));
        users.add(new Directeur("jttttt","Mohamed","06666666666","med@gmail.com","med@",44,1,Role.Directeur,new Date(),6));

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
         note.add(new Note(1,"tres bien ",20,new Date(2022,10,22),"sprint 1",1,1));
         note.add(new Note(2,"bien ",15,new Date(2022,10,22),"sprint 1",1,2));
         note.add(new Note(3,"tres bien ",16,new Date(2022,10,22),"sprint 1",1,3));

         // Ajouter Responsable
         responsable.add(new Responsable(1,1,1));
         responsable.add(new Responsable(2,1,2));
         responsable.add(new Responsable(3,1,3));

    }
}