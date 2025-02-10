/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starbuzz_coffee;

/**
 *
 * @author crazy
 */
public class Soya extends Condimento {    
    public Soya(){
        costo = 10;
        nombre = "soya";
    }
    
    public Soya(Condimento wrappee){
        super(wrappee);
        costo = 10;
        nombre = "soya";
    }
}