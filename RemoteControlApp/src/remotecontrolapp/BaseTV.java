/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package remotecontrolapp;

import observer.Observador;
import state.OffState;
import state.State;

/**
 *
 * @author crazy
 */
public interface BaseTV{
  // Métodos de la TV (sin cambios)
  public void turnOn();

  public void turnOff();

  public void changeChannel(int channel);

  public void setVolume(int level);

  public void setState(State state);
    
  public void power();
  
  public State getState();
  
  public void agregarObservador(Observador observador);
  
  public void notificarObservadores(String mensaje);


  
}

