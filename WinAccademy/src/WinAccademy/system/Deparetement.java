package WinAccademy.system;

public class Deparetement {
    private  int id;
    private  String name;
    int idColege;

    public Deparetement(int id, String name, int idColege) {
        this.id = id;
        this.name = name;
        this.idColege = idColege;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdColege() {
        return idColege;
    }

    public void setIdColege(int idColege) {
        this.idColege = idColege;
    }
}
