/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosistcrucero;

/**
 *
 * @author alfon
 */
public class CruceroFamiliar extends Crucero {
    private int piscinaAdolescente, piscinaInfantes;

    public CruceroFamiliar() {
    }

    public CruceroFamiliar(int piscinaAdolescente, int piscinaInfantes, String codIdentificador, String nombre, String destino, int duracionDias, int nroPasajerosPermitidos) {
        super(codIdentificador, nombre, destino, duracionDias, nroPasajerosPermitidos);
        this.piscinaAdolescente = piscinaAdolescente;
        this.piscinaInfantes = piscinaInfantes;
    }

    public int getPiscinaAdolescente() {
        return piscinaAdolescente;
    }

    public void setPiscinaAdolescente(int piscinaAdolescente) {
        this.piscinaAdolescente = piscinaAdolescente;
    }

    public int getPiscinaInfantes() {
        return piscinaInfantes;
    }

    public void setPiscinaInfantes(int piscinaInfantes) {
        this.piscinaInfantes = piscinaInfantes;
    }
    

    @Override
    public double valorFinal() {
        var montoTotal = VALOR_BASE_DAY * this.getDuracionDias();
        var valorDesc = (this.getNroPasajerosPermitidos()> 200) ? (montoTotal * 0.08) : 0;
        var montoFinal = montoTotal + valorDesc;
        System.out.printf("El monto total a pagar por el Crucero familiar es de: $%.2f", montoFinal);
        System.out.println("\n---------------------\n");
        return montoFinal;
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("""
                          *** Informacion Crucero Familiar ***
                          - Codigo Crucero: %s
                          - Nombre: %s
                          - Destino: %s
                          - Duracion en dias: %d
                          - Nro pasajeros permitidos: %d
                          - Piscinas para Adolescentes: %d
                          - Piscinas para Infancias: %d\n
                          """, this.getCodIdentificador(), this.getNombre(), this.getDestino(), this.getDuracionDias(), this.getNroPasajerosPermitidos(), this.getPiscinaAdolescente(), this.getPiscinaInfantes());
    }
}
