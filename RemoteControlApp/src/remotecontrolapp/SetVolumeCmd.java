/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remotecontrolapp;

import chain_of_responsability.Manejador;

/**
 *
 * @author crazy
 */
public class SetVolumeCmd implements Command, Manejador{
  private final BaseTV tv;
  private final int level;
  
  private Manejador manejador;

  public SetVolumeCmd(BaseTV tv, int level) {
    this.tv = tv;
    this.level = level;
  }

  @Override
  public void execute() {
    tv.setVolume(level);
  }
  
    public void setManejadorSiguiente(Manejador manejador){
        this.manejador = manejador;
    }
  
    @Override
    public void manejar(String solicitud) {

    }
}
