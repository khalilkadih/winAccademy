package WinAccademy.system;

import java.util.Date;
import java.util.List;

public class Parent extends User {

    int idParent ;
    String cin;

    public Parent(int idParent, String cin) {
        this.idParent = idParent;
        this.cin = cin;
    }

    public Parent(String cin, String nom, String telephone, String email, String password, int age, int idAdress, Role role, Date dateInscription, int idParent, String cin1) {
        super(cin, nom, telephone, email, password, age, idAdress, role, dateInscription);
        this.idParent = idParent;
        this.cin = cin1;
    }

    public int getIdParent() {
        return idParent;
    }

    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }

    @Override
    public String getCin() {
        return cin;
    }

    @Override
    public void setCin(String cin) {
        this.cin = cin;
    }
}
