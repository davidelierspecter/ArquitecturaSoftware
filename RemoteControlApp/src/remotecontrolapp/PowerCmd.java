/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remotecontrolapp;

import chain_of_responsability.Manejador;
import state.OffState;
import state.OnState;

/**
 *
 * @author crazy
 */
public class PowerCmd implements Command, Manejador {
  private final BaseTV tv;
  
    private Manejador manejador;


  public PowerCmd(BaseTV tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
      tv.power();
  }

    public void setManejadorSiguiente(Manejador manejador){
        this.manejador = manejador;
    }
  
    @Override
    public void manejar(String solicitud) {
        
    }
  
}
