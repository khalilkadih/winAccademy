package WinAccademy.system;

import java.util.Date;
import java.util.List;

public class Etudiant  extends User{
    int idEtudiant ;

    int idClasse;
    int idParent;

    public Etudiant(String cin, String nom, String telephone, String email, String password, int age,int  idAdress, Role role, Date dateInscription, int idEtudiant,  int idClasse, int idParent) {
        super(cin, nom, telephone, email, password, age, idAdress, role, dateInscription);
        this.idEtudiant = idEtudiant;
        this.idClasse = idClasse;
        this.idParent = idParent;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }



    public int getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }

    public int getIdParent() {
        return idParent;
    }

    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }
}
