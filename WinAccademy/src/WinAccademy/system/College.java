package WinAccademy.system;

public class College {
    int idColege ;
    String nomCollege;
    int idAdmin;
    int idDirecteur;

    public College(int idColege, String nomCollege, int idAdmin, int idDirecteur) {
        this.idColege = idColege;
        this.nomCollege = nomCollege;
        this.idAdmin = idAdmin;
        this.idDirecteur = idDirecteur;
    }

    public int getIdColege() {
        return idColege;
    }

    public void setIdColege(int idColege) {
        this.idColege = idColege;
    }

    public String getNomCollege() {
        return nomCollege;
    }

    public void setNomCollege(String nomCollege) {
        this.nomCollege = nomCollege;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public int getIdDirecteur() {
        return idDirecteur;
    }

    public void setIdDirecteur(int idDirecteur) {
        this.idDirecteur = idDirecteur;
    }
}
