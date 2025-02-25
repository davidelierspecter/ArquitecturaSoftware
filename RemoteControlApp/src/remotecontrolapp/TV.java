/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remotecontrolapp;

import java.util.ArrayList;
import java.util.List;
import observer.Observador;
import state.OffState;
import state.OnState;
import state.State;

/**
 *
 * @author crazy
 */
public class TV implements BaseTV {
  // Única instancia estática y privada (eager initialization)
  private static TV instance;
  private State state;
  private List<Observador> observadores = new ArrayList<>();

  
  // Constructor privado para evitar new TV()
  private TV() {
    System.out.println("¡TV inicializada!");
    this.state = new OffState(this);
  }
  
  // Método estático para acceder a la instancia
  public static TV getInstance() {
    if (instance == null) {
      instance = new TV();
    }
    return instance;
  }

  // Métodos de la TV (sin cambios)
  @Override
  public void turnOn() {
      state.onTurnOn();
  }

  @Override
  public void turnOff() {
      state.onTurnOff();
  }

  @Override
  public void changeChannel(int channel) {
    System.out.println("Cambiando al canal " + channel);
  }

  @Override
  public void setVolume(int level) {
    System.out.println("Volumen ajustado a " + level);
  }

  @Override
  public void setState(State state){
      this.state = state;
      System.out.println("Estado de la tele: " + state.getClass());
  }

    @Override
    public void power() {
     if(state instanceof OnState) {
          turnOff();
      } else if (state instanceof OffState){
          turnOn();
      }
     
     notificarObservadores("Se ha cambiado el state de la tv a:" + state.getClass());
     
    }
    
    @Override
    public State getState() {
        return this.state;
    }
    
  @Override
    public void agregarObservador(Observador observador){
        observadores.add(observador);
    }
    
  @Override
    public void notificarObservadores(String mensaje){
        for(Observador o : observadores){
            o.actualizar(mensaje);
        }
    }
  
    
}
