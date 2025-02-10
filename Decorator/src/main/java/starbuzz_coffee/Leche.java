/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starbuzz_coffee;

/**
 *
 * @author crazy
 */
public class Leche extends Condimento {    
    public Leche(){
        costo = 15;
        nombre = "leche";
    }
    
    public Leche(Condimento wrappee){
        super(wrappee);
        costo = 15;
        nombre = "leche";
    }
    
}
