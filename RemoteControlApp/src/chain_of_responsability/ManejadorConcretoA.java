/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chain_of_responsability;

/**
 *
 * @author crazy
 */
public class ManejadorConcretoA implements Manejador {
    private Manejador siguiente;
    
    public ManejadorConcretoA(Manejador siguiente){
        this.siguiente = siguiente;
    }
    
    @Override
    public void manejar(String solicitud) {
        if (solicitud.equals("A")) {
            System.out.println("Manejador A procesó la solicitud.");
        } else if (siguiente != null) {
            siguiente.manejar(solicitud);
        }
    }
    
}
