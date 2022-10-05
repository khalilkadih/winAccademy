package WinAccademy.system;

public class Matiere {
int idMatiere;
String nomMatiere;
Salle salle;
public Matiere(){

}

    public Matiere(int idMatiere, String nomMatiere, Salle salle) {
        this.idMatiere = idMatiere;
        this.nomMatiere = nomMatiere;
        this.salle = salle;
    }

    public int getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }

    public String getNomMatiere() {
        return nomMatiere;
    }

    public void setNomMatiere(String nomMatiere) {
        this.nomMatiere = nomMatiere;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    @Override
    public String toString() {
        return "Matiere{" +
                "idMatiere=" + idMatiere +
                ", nomMatiere='" + nomMatiere + '\'' +
                ", salle=" + salle +
                '}';
    }
}
