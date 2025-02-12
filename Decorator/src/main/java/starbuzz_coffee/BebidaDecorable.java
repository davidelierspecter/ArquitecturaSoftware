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
    private Condimento condimentos;
    protected BebidaDecorable(){}
    protected BebidaDecorable(Condimento condimento){
        this.condimentos = condimento;
    }
    public void imprimirCostos(){
        if (condimentos != null) condimentos.imprimirCostoDelCondimento();
    }
}
