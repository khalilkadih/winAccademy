package WinAccademy.system;

import java.util.Arrays;
import java.util.Date;

public class ShowMenuPrincipale {
    public static void ShowMenuPrincipale( User user)
    {

        Adress adress = new Adress(1,"maroc","Agadir","av agadir");
        //todo delete this
        user= new User("JT42796","khalil","0666666666","khalil@gmail.com","khalil@",28, Arrays.asList(new Adress[]{adress}),Role.Admin,new Date());

        if(user.getRole().equals(Role.Admin)){
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println(" \t\t\t\tWelcome to WinAccademy!");
            System.out.println(" \t\t\t\tMenu Principale!");
            System.out.println("Login!!!");
            Login l= new Login();
            l.login();
            System.out.println(" 1:Ajouter Directeur");
            System.out.println(" 2: Modifier Directeur");
            System.out.println(" 3: Supprimer Directeur");
            System.out.println(" 4: Afficher Profile");

        }


            // if(user.equals("Etudant")){

        }


}
