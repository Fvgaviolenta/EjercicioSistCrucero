/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosistcrucero;

/**
 *
 * @author alfon
 */
public class CruceroPerfectDay extends Crucero{
    private String isla;

    public CruceroPerfectDay() {
    }

    public CruceroPerfectDay(String isla, String codIdentificador, String nombre, String destino, int duracionDias, int nroPasajerosPermitidos) {
        super(codIdentificador, nombre, destino, duracionDias, nroPasajerosPermitidos);
        this.isla = isla;
    }

    public String getIsla() {
        return isla;
    }

    public void setIsla(String isla) {
        this.isla = isla;
    }
    

    @Override
    public double valorFinal() {
        var montoTotal = VALOR_BASE_DAY * this.getDuracionDias();
        var valorDesc = (this.getDuracionDias()> 8) ? (montoTotal * 0.1) : 0;
        var montoFinal = montoTotal + valorDesc;
        System.out.printf("El monto total a pagar por el Crucero familiar es de: $%.2f", montoFinal);
        System.out.println("\n--------------------- \n");
        return montoFinal;
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("""
                          *** Informacion Crucero Perfect Day ***
                          - Codigo Crucero: %s
                          - Nombre: %s
                          - Destino: %s
                          - Duracion en dias: %d
                          - Nro pasajeros permitidos: %d
                          - Isla: %s\n
                          """, this.getCodIdentificador(), this.getNombre(), this.getDestino(), this.getDuracionDias(), this.getNroPasajerosPermitidos(), this.getIsla());
    }
}
