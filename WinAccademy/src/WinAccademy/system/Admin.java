package WinAccademy.system;

import java.util.Date;
import java.util.List;

public class Admin extends User {

    public Admin(String cin, String nom, String telephone, String email, String password, int age, List<Adress> adresses, List<Role> roles, Date dateInscription)
    {
        super(cin, nom, telephone, email, password, age, adresses, roles, dateInscription);
    }

    public void Showprofil()
    {
        //get info of admin
    }
    public void AddDirecteur(){

    }

}
