/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starbuzz_coffee;

/**
 *
 * @author crazy
 */
public class Crema extends Condimento {    
    public Crema(){
        costo = 45;
        nombre = "crema";
    }
    
    public Crema(Condimento wrappee){
        super(wrappee);
        costo = 45;
        nombre = "crema";
    }
}