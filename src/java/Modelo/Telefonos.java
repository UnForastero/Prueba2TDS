package Modelo;

public class Telefonos {
    private String login;
    private int telefono;

    public Telefonos(String login, int telefono) {
        this.login = login;
        this.telefono = telefono;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
