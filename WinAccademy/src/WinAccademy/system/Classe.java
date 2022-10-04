package WinAccademy.system;

import java.util.Date;

public class Classe {
    int idClasse ;
    String nomClasse;
    Date annescolaire;
    int iddepartement;

 public Classe(int idClasse, String nomClasse, Date annescolaire, int iddepartement) {
        this.idClasse = idClasse;
        this.nomClasse = nomClasse;
        this.annescolaire = annescolaire;
        this.iddepartement = iddepartement;
    }

    public int getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }

    public Date getAnnescolaire() {
        return annescolaire;
    }

    public void setAnnescolaire(Date annescolaire) {
        this.annescolaire = annescolaire;
    }

    public int getIddepartement() {
        return iddepartement;
    }

    public void setIddepartement(int iddepartement) {
        this.iddepartement = iddepartement;
    }

    @Override
    public String toString() {
        return "Classe{" +
                "idClasse=" + idClasse +
                ", nomClasse='" + nomClasse + '\'' +
                ", annescolaire=" + annescolaire +
                ", iddepartement=" + iddepartement +
                '}';
    }
}
