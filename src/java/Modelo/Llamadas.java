package Modelo;
public class Llamadas {
    private int codLlamada;
    private int telefono;
    private String Destino;
    private int duracion;
    private int codTarifa;
    private int costo;
    private String fecha;

    public Llamadas(int codLlamada, int telefono, String Destino, int duracion, int codTarifa, int costo, String fecha) {
        this.codLlamada = codLlamada;
        this.telefono = telefono;
        this.Destino = Destino;
        this.duracion = duracion;
        this.codTarifa = codTarifa;
        this.costo = costo;
        this.fecha = fecha;
    }

    public int getCodLlamada() {
        return codLlamada;
    }

    public void setCodLlamada(int codLlamada) {
        this.codLlamada = codLlamada;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCodTarifa() {
        return codTarifa;
    }

    public void setCodTarifa(int codTarifa) {
        this.codTarifa = codTarifa;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
