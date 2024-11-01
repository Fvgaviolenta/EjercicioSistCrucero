/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosistcrucero;

/**
 *
 * @author alfon
 */
public class CruceroSolteros extends Crucero {
    private int cantidadCitas;

    public CruceroSolteros() {
    }

    public CruceroSolteros(int cantidadCitas, String codIdentificador, String nombre, String destino, int duracionDias, int nroPasajerosPermitidos) {
        super(codIdentificador, nombre, destino, duracionDias, nroPasajerosPermitidos);
        this.cantidadCitas = cantidadCitas;
    }

    public int getCantidadCitas() {
        return cantidadCitas;
    }

    public void setCantidadCitas(int cantidadCitas) {
        this.cantidadCitas = cantidadCitas;
    }
    
    

    @Override
    public double valorFinal() {
        var montoTotal = VALOR_BASE_DAY * this.getDuracionDias();
        var valorDesc = (this.getCantidadCitas() > 5) ? (montoTotal * 0.05) : 0;
        var montoFinal = montoTotal + valorDesc;
        System.out.printf("El monto final a pagar por el Crucero para Solteros es de $%.2f", montoFinal);
        System.out.println("\n---------------------\n");
        return montoFinal;
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("""
                          *** Informacion Crucero Solteros ***
                          - Codigo Crucero: %s
                          - Nombre: %s
                          - Destino: %s
                          - Duracion en dias: %d
                          - Nro pasajeros permitidos: %d
                          - Cantidad de Citas: %d\n
                          """, this.getCodIdentificador(), this.getNombre(), this.getDestino(), this.getDuracionDias(), this.getNroPasajerosPermitidos(), this.getCantidadCitas());
    }
    
}
