/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosistcrucero;

/**
 *
 * @author alfon
 */
public abstract class Crucero implements Cotizacion {
    protected String codIdentificador, nombre, destino;
    protected int duracionDias, nroPasajerosPermitidos;

    public Crucero() {
    }

    public Crucero(String codIdentificador, String nombre, String destino, int duracionDias, int nroPasajerosPermitidos) {
        this.codIdentificador = codIdentificador;
        this.nombre = nombre;
        this.destino = destino;
        this.duracionDias = duracionDias;
        this.nroPasajerosPermitidos = nroPasajerosPermitidos;
    }

    public String getCodIdentificador() {
        return codIdentificador;
    }

    public void setCodIdentificador(String codIdentificador) {
        this.codIdentificador = codIdentificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public int getNroPasajerosPermitidos() {
        return nroPasajerosPermitidos;
    }

    public void setNroPasajerosPermitidos(int nroPasajerosPermitidos) {
        this.nroPasajerosPermitidos = nroPasajerosPermitidos;
    }
    
    public abstract void mostrarInfo();
}
