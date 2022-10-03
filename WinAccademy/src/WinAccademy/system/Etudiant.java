package WinAccademy.system;

public class Etudiant {
    int idEtudiant ;
    String Cin;
    int idClasse;
    int idParent;

    public Etudiant(int idEtudiant, String cin, int idClasse, int idParent) {
        this.idEtudiant = idEtudiant;
        Cin = cin;
        this.idClasse = idClasse;
        this.idParent = idParent;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getCin() {
        return Cin;
    }

    public void setCin(String cin) {
        Cin = cin;
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
