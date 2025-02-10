/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starbuzz_coffee;

/**
 *
 * @author crazy
 */
public class Leche implements ICondimento {
    private ICondimento wrappee;
    
    public Leche(){
    }
    
    public Leche(ICondimento wrappee){
        this.wrappee = wrappee;
    }
    
    @Override
    public void imprimir() {
        System.out.print("Leche ");
        if(wrappee != null) wrappee.imprimir();
    }

    @Override
    public void imprimirCostoDelCondimento() {
        System.out.print("$15 ");
        if(wrappee != null) wrappee.imprimirCostoDelCondimento();
    }
    
}
