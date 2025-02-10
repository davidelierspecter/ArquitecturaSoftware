/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starbuzz_coffee;

/**
 *
 * @author crazy
 */
public class Crema implements ICondimento {
    private ICondimento wrappee;
    
    public Crema(){
    }
    
    public Crema(ICondimento wrappee){
        this.wrappee = wrappee;
    }

    
    @Override
    public void imprimir() {
        System.out.print("Crema ");
        if(wrappee != null) wrappee.imprimir();
    }

    @Override
    public void imprimirCostoDelCondimento() {
        System.out.print("$25 ");
        if(wrappee != null) wrappee.imprimirCostoDelCondimento();
    }
    
}