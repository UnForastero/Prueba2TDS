
package Modelo;

public class Tarifas {
    private int codTarifa;
    private int nombreTarifa;

    public Tarifas(int codTarifa, int nombreTarifa) {
        this.codTarifa = codTarifa;
        this.nombreTarifa = nombreTarifa;
    }

    public int getCodTarifa() {
        return codTarifa;
    }

    public void setCodTarifa(int codTarifa) {
        this.codTarifa = codTarifa;
    }

    public int getNombreTarifa() {
        return nombreTarifa;
    }

    public void setNombreTarifa(int nombreTarifa) {
        this.nombreTarifa = nombreTarifa;
    }
    
    
}
