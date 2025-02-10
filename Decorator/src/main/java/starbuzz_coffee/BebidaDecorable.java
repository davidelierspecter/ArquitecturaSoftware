/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starbuzz_coffee;

/**
 *
 * @author crazy
 */
public class BebidaDecorable {
    private ICondimento condimentos;
    
    public BebidaDecorable(){
    }
    
    public BebidaDecorable(ICondimento condimento){
        this.condimentos = condimento;
    }
    
    public void imprimirCostos(){
        if (condimentos != null) condimentos.imprimirCostoDelCondimento();
    }
    
}
