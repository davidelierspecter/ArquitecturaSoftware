/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starbuzz_coffee;

/**
 *
 * @author crazy
 */
public class Chocolate extends Condimento {    
    public Chocolate(){
        costo = 20;
        nombre = "chocolate";
    }
    
    public Chocolate(Condimento wrappee){
        super(wrappee);
        costo = 20;
        nombre = "chocolate";
    }
    
    
}