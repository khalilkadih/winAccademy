package WinAccademy.system;

public class Adress {

    private  int id;
    private  String pays;
    private  String ville;
    private  String street;

    /* Constructor*/

    public Adress(int id, String pays, String ville, String street) {
        this.id = id;
        this.pays = pays;
        this.ville = ville;
        this.street = street;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}
