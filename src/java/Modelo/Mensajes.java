package Modelo;
public class Mensajes {
    private String codMensaje;
    private String nombre;
    private String asunto;
    private String contenido;
    private String login;

    public Mensajes(String codMensaje, String nombre, String asunto, String contenido, String login) {
        this.codMensaje = codMensaje;
        this.nombre = nombre;
        this.asunto = asunto;
        this.contenido = contenido;
        this.login = login;
    }

    public String getCodMensaje() {
        return codMensaje;
    }

    public void setCodMensaje(String codMensaje) {
        this.codMensaje = codMensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    
}
