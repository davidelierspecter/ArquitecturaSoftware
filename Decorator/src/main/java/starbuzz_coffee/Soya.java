/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starbuzz_coffee;

/**
 *
 * @author crazy
 */
public class Soya implements ICondimento {
    private ICondimento wrappee;
    
    public Soya(){
    }
    
    public Soya(ICondimento wrappee){
        this.wrappee = wrappee;
    }

    
    @Override
    public void imprimir() {
        System.out.print("Soya ");
        if(wrappee != null) wrappee.imprimir();
    }

    @Override
    public void imprimirCostoDelCondimento() {
        System.out.print("$40 ");
        if(wrappee != null) wrappee.imprimirCostoDelCondimento();
    }
}