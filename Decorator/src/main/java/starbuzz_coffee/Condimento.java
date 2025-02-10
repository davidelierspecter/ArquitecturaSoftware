/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package starbuzz_coffee;

/**
 *
 * @author crazy
 */
public class Condimento {
    protected float costo;
    protected String nombre;
    
    private Condimento wrappee;
    
    public Condimento(){
    }
    
    public Condimento(Condimento wrappee){
        this.wrappee = wrappee;
    }

    public void imprimirCostoDelCondimento() {
        System.out.print(nombre + ": " + costo + " ");
        if(wrappee != null) wrappee.imprimirCostoDelCondimento();
    }
}
