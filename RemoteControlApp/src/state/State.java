/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import remotecontrolapp.BaseTV;

/**
 *
 * @author crazy
 */
public abstract class State {
    protected BaseTV tv;
    
    public State(BaseTV tv){
        this.tv = tv;
    }
    
    public abstract void onTurnOff();
    public abstract void onTurnOn();
    
    
}
