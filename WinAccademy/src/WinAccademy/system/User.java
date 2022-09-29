package WinAccademy.system;

import java.util.Date;
import java.util.List;

public class User {

    private String cin ;
    private  String nom;
    private String telephone;
    private String email;
    private  String password;
    private int age ;
    private List<Adress> adresses;
    private  List<Role> roles;
    private Date dateInscription;

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

    public List<Adress> getAdresses() {
        return adresses;
    }

    public List<Role> getRoles() {
        return roles;
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

    public void setAdresses(List<Adress> adresses) {
        this.adresses = adresses;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }
    //Added adress of user

    public void AddAdress(Adress adrees)
    {
        adresses.add(adrees);

    }
    //Added Role of usder
    public void AddRole(Role role){
        roles.add(role);
    }

    public User(String cin, String nom, String telephone, String email, String password, int age, List<Adress> adresses, List<Role> roles, Date dateInscription) {
        this.cin = cin;
        this.nom = nom;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
        this.age = age;
        this.adresses = adresses;
        this.roles = roles;
        this.dateInscription = dateInscription;
    }

}