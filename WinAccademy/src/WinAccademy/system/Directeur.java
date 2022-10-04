package WinAccademy.system;

import java.util.Date;
import java.util.List;

public class Directeur extends User{

    int idDirecteur;
    String cin;

    public Directeur(int idDirecteur, String cin) {
        this.idDirecteur = idDirecteur;
        this.cin = cin;
    }

    public Directeur(String cin, String nom, String telephone, String email, String password, int age, int  idAdress, Role role, Date dateInscription, int idDirecteur, String cin1) {
        super(cin, nom, telephone, email, password, age, idAdress, role, dateInscription);
        this.idDirecteur = idDirecteur;
        this.cin = cin1;
    }

    public int getIdDirecteur() {
        return idDirecteur;
    }

    public void setIdDirecteur(int idDirecteur) {
        this.idDirecteur = idDirecteur;
    }

    @Override
    public String getCin() {
        return cin;
    }

    @Override
    public void setCin(String cin) {
        this.cin = cin;
    }

    public void AddProfesseur(){

    }
    public void UpdateProfesseur(){

    }
    public void ShowAllProfesseurs(){

    }
    public void ShowProfesseur(String Cin){

    }
    public void AddStudent(){

    }
    public void UpdateStudent(){

    }
    public void ShowAllStudents(){

    }
    public void ShowPStudent(String Cin){

    }
    public void AddMatiere(){

    }
    public void UpdateMatiere(){

    }
    public void ShowAllMatieres(){

    }
    public void ShowMatiere(String Cin){

    }


}
