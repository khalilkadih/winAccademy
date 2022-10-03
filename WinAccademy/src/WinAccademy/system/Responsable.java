package WinAccademy.system;

public class Responsable {
    int idResponsable;
    int idProfesseur;
    int idDepartement ;

    public Responsable(int idResponsable, int idProfesseur, int idDepartement) {
        this.idResponsable = idResponsable;
        this.idProfesseur = idProfesseur;
        this.idDepartement = idDepartement;
    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    public int getIdProfesseur() {
        return idProfesseur;
    }

    public void setIdProfesseur(int idProfesseur) {
        this.idProfesseur = idProfesseur;
    }

    public int getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(int idDepartement) {
        this.idDepartement = idDepartement;
    }
}
