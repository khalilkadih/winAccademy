package WinAccademy.system;

import java.util.Date;
import java.util.List;

public class Professeur  extends  User{
   int idProfesseur;
   String cin;
   int idSalle;
   int idMatiere;

    public Professeur(int idProfesseur, String cin, int idSalle, int idMatiere) {
        this.idProfesseur = idProfesseur;
        this.cin = cin;
        this.idSalle = idSalle;
        this.idMatiere = idMatiere;
    }

    public Professeur(String cin, String nom, String telephone, String email, String password, int age, List<Adress> adresses, Role role, Date dateInscription, int idProfesseur, String cin1, int idSalle, int idMatiere) {
        super(cin, nom, telephone, email, password, age, adresses, role, dateInscription);
        this.idProfesseur = idProfesseur;
        this.cin = cin1;
        this.idSalle = idSalle;
        this.idMatiere = idMatiere;
    }

    public int getIdProfesseur() {
        return idProfesseur;
    }

    public void setIdProfesseur(int idProfesseur) {
        this.idProfesseur = idProfesseur;
    }

    @Override
    public String getCin() {
        return cin;
    }

    @Override
    public void setCin(String cin) {
        this.cin = cin;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public int getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }
}
