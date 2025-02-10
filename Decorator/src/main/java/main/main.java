/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import decorator.*;
import notifier.FacebookDecorator;
import notifier.INotifier;
import notifier.Notifier;
import notifier.WhatsappDecorator;
import starbuzz_coffee.BebidaDecorable;
import starbuzz_coffee.Chocolate;
import starbuzz_coffee.Crema;
import starbuzz_coffee.Expresso;
import starbuzz_coffee.Condimento;
import starbuzz_coffee.Leche;
import starbuzz_coffee.Soya;


/**
 *
 * @author crazy
 */
public class main {
    public static void main(String[] args) {
        BebidaDecorable expresso = new Expresso(new Crema(new Chocolate(new Soya())));
        expresso.imprimirCostos();
        BebidaDecorable expres = new Expresso();
    }
}