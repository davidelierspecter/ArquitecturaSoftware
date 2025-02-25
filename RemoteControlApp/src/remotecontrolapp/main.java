/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package remotecontrolapp;

import observer.BocinasObservador;
import observer.SintonizadorObservador;

/**
 *
 * @author crazy
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //TV tv = TV.getInstance();

        // Construcción con Builder
        //RemoteControlBuilder builder = new RemoteControlBuilder(tv);

        // Control remoto simple (solo power, volumen, canales 1 y 2)
        //RemoteControl simpleRemote = builder.buildSimple();
        //simpleRemote.pressButton("power"); // Enciende TV
        //simpleRemote.pressButton("channel1"); // Canal 1

        // Control remoto avanzado (power, volumen, canales 0-9)
        //RemoteControl advancedRemote = builder.buildAdvanced();
        //advancedRemote.pressButton("channel5"); // Canal 5


        SmartTV smartTV = SmartTV.getInstance();
        RemoteControl remote = new RemoteControl();
        
        smartTV.agregarObservador(new BocinasObservador());
        smartTV.agregarObservador(new SintonizadorObservador());
        

        // Configurar comandos
        remote.addCommand("power", new PowerCmd(smartTV));
        remote.addCommand("vol_up", new AdjustVolumeCmd(smartTV, 10));

        // Simular pulsación de botones
        remote.pressButton("power"); // Enciende TV
        remote.pressButton("vol_up"); // Volumen ajustado a 10
        remote.pressButton("power");
        
        
        
    }

    
}
