/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosistcrucero;

/**
 *
 * @author alfon
 */
public class EjercicioSistCrucero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestionFlotaCrucero gfc = new GestionFlotaCrucero();
        CruceroSolteros cs01 = new CruceroSolteros(8, "S2F34J0", "Crucero del Amor", "Islas Barbados", 10, 500);
        CruceroSolteros cs02 = new CruceroSolteros(10, "S41HJ34", "Crucero del SuperAmor", "Islas Caiman", 18, 1200);
        CruceroSolteros cs03 = new CruceroSolteros(4, "S01HGF22", "Crucero del Amor Piola", "Nuevo Mexico", 5, 800);
        CruceroSolteros cs04 = new CruceroSolteros(2, "S33JIE98", "Crucero del Amorcito", "Culiakan", 3, 360);
        
        CruceroFamiliar cf01 = new CruceroFamiliar(3, 4, "F0231JF3", "Crucero FAMILAND", "New Deli", 22, 1500);
        gfc.agregarCrucero(new CruceroFamiliar(1, 1, "F2832JFI", "El Familion Crucero", "Valparaiso", 10, 150));
        CruceroFamiliar cf02 = new CruceroFamiliar(2, 6, "F03FG32", "CRU FAMILIA CERO", "Antofogasta", 2, 200);
        gfc.agregarCrucero(new CruceroFamiliar(6, 8, "F8734SRR", "EL SUPER MEGA FAMILIA CRUCERIL", "Bs. Aires", 22, 2000));
        
        gfc.agregarCrucero(new CruceroPerfectDay("Perfect Day Mexico", "PD634HGF", "Luxury Mexican Bahia Crucero", "Txlacnan", 7, 850));
        gfc.agregarCrucero(new CruceroPerfectDay("Perfect Day Coco Cay", "PD9341HF", "EL MEJOR EL MAS PULENTO EL CRUCERO", "Thailandia", 50, 1200));
        gfc.agregarCrucero(new CruceroPerfectDay("Perfect Day Coco Cay", "PD245JEW", "VIP Mega experience Crucero", "Bali", 8, 900));
        CruceroPerfectDay cpd01 = new CruceroPerfectDay("Perfect Day Mexico", "PD9341NF", "SUPER SUPER SUPER CRUCERO", "Puebla", 6, 600);
        
        
        cs01.mostrarInfo();
        cs01.valorFinal();
        
        cf02.mostrarInfo();
        cf02.valorFinal();
        
        cpd01.mostrarInfo();
        cpd01.valorFinal();
        
        gfc.getListaCrucerosDisponibles();
        
        gfc.agregarCrucero(cs01);
        gfc.agregarCrucero(cs01);
        gfc.agregarCrucero(cs02);
        gfc.agregarCrucero(cs03);
        gfc.agregarCrucero(cs04);
        gfc.agregarCrucero(cf01);
        gfc.agregarCrucero(cf02);
        gfc.agregarCrucero(cs03);
        gfc.agregarCrucero(cpd01);
        
        gfc.totalCruceros();
        
        gfc.listarCruceros();
        
        gfc.filtrarPorTipo(CruceroSolteros.class);
        
        gfc.filtrarPorTipo(CruceroPerfectDay.class);
        
    }
    
   
    
}
