package WinAccademy.system;

import java.util.Date;
import java.util.List;

public class Directeur extends User{

    int idDirecteur;

    public Directeur(){}

    public Directeur(String cin, String nom, String telephone, String email, String password, int age, int  idAdress, Role role, Date dateInscription, int idDirecteur) {
        super(cin, nom, telephone, email, password, age, idAdress, role, dateInscription);
        this.idDirecteur = idDirecteur;
    }

    public int getIdDirecteur() {
        return idDirecteur;
    }

    public void setIdDirecteur(int idDirecteur) {
        this.idDirecteur = idDirecteur;
    }




    @Override
    public String toString() {
        return "Directeur{" +
                "idDirecteur=" + idDirecteur +
                ", cin='" + cin + '\'' +
                ", cin='" + cin + '\'' +
                ", nom='" + nom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", idAdress=" + idAdress +
                ", role=" + role +
                ", dateInscription=" + dateInscription +
                '}';
    }
}
