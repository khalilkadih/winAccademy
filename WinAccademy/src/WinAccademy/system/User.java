package WinAccademy.system;

import java.util.Date;
import java.util.List;

public class User {

    protected String cin ;
    protected  String nom;
    protected String telephone;
    protected String email;
    protected  String password;
    protected int age ;
    protected int idAdress;
    protected  Role role;
    protected Date dateInscription;
    //default construtor
    public User(){}


    public String getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public int getIdAdress() {
        return idAdress;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdresses(int idAdress) {
        this.idAdress = idAdress;
    }

    public Role getRole() {
        return role;
    }


    public void setDateInscription(Date dateInscription) {

        this.dateInscription = dateInscription;
    }


    public User(String cin, String nom, String telephone, String email, String password, int age, int idAdress, Role role, Date dateInscription) {
        this.cin = cin;
        this.nom = nom;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
        this.age = age;
        this.idAdress = idAdress;
        this.role = role;
        this.dateInscription = dateInscription;
    }

    public String toString(){
        return  "your profil: you cin is "+this.cin+" your name :"+this.nom+" your telephone "+this.telephone+" your email is: "+this.email+" your age : "+this.age+" your adress is"+this.idAdress+" Role :"+this.role+" "+this.dateInscription;
    }


}
