/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosistcrucero;

import java.util.ArrayList;

/**
 *
 * @author alfon
 */
public class GestionFlotaCrucero {
    private ArrayList<Crucero> listaCrucerosDisponibles;

    public GestionFlotaCrucero() {
        listaCrucerosDisponibles = new ArrayList<>();
    }

    public ArrayList<Crucero> getListaCrucerosDisponibles() {
        return listaCrucerosDisponibles;
    }

    public void setListaCrucerosDisponibles(ArrayList<Crucero> listaCrucerosDisponibles) {
        this.listaCrucerosDisponibles = listaCrucerosDisponibles;
    }
    
    public boolean validarCodigo(String codIdentificador){
        for (Crucero cruc : listaCrucerosDisponibles) {
            if(codIdentificador.equals(cruc.getCodIdentificador())){
                return true;
            }
        }
        return false;
    }
    
    public void agregarCrucero(Crucero cruce){
        if (validarCodigo(cruce.getCodIdentificador()) == false) {
            listaCrucerosDisponibles.add(cruce);
            System.out.println("Crucero agregado con exito!\n");
        } else {
            System.out.println("Crucero ya se encuentra listado\n");
        } 
    }
    
    public void listarCruceros(){
        System.out.println("\n*** CRUCEROS DISPONIBLES PARA COTIZACION ***");
        for (Crucero cruce : listaCrucerosDisponibles) {
            cruce.mostrarInfo();
            cruce.valorFinal();
        }
        System.out.println("");
    }
    
    public void totalCruceros(){
        System.out.println("\nEl total de Cruceros disponibles es de: " + listaCrucerosDisponibles.size());
    }
    
    public void filtrarPorTipo(Class<?> tipo){
        for (Crucero cru : listaCrucerosDisponibles) {
            if (tipo.isInstance(cru)) {
                cru.mostrarInfo();
                System.out.println("--------------");
            }
        }
    }
    
    
    
    
}
