package WinAccademy.system;

import java.util.Date;

public class Note {
     public int idNote;
    public String nomNote;
    public float note;
    public Date anneScolaire;
    public String sprint ;
    public int idEtudiant ;
    public int idMatiere ;

    public Note(int idNote, String nomNote, float note, Date anneScolaire, String sprint, int idEtudiant, int idMatiere) {
        this.idNote = idNote;
        this.nomNote = nomNote;
        this.note = note;
        this.anneScolaire = anneScolaire;
        this.sprint = sprint;
        this.idEtudiant = idEtudiant;
        this.idMatiere = idMatiere;
    }

    public int getIdNote() {
        return idNote;
    }

    public void setIdNote(int idNote) {
        this.idNote = idNote;
    }

    public String getNomNote() {
        return nomNote;
    }

    public void setNomNote(String nomNote) {
        this.nomNote = nomNote;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public Date getAnneScolaire() {
        return anneScolaire;
    }

    public void setAnneScolaire(Date anneScolaire) {
        this.anneScolaire = anneScolaire;
    }

    public String getSprint() {
        return sprint;
    }

    public void setSprint(String sprint) {
        this.sprint = sprint;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public int getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }
    public String toString(){
        return "Votre Note est "+this.note+" Caractéristique  "+this.nomNote+" "+"de l'anne  annee scolaire "+this.anneScolaire+ "Pour etudiant "+this.idEtudiant+" de la matiere"+this.idMatiere;
    }

}
