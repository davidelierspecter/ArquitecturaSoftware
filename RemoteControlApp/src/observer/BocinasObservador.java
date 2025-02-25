/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author crazy
 */
public class BocinasObservador implements Observador {

    @Override
    public void actualizar(String mensaje) {
        System.out.println("el observador de las bocinas recibió: " + mensaje);
    }
    
    
}
