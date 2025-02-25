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
public class OffState extends State{

    public OffState(BaseTV tv) {
        super(tv);
    }

    @Override
    public void onTurnOff() {
    }

    @Override
    public void onTurnOn() {
        tv.setState(new OnState(tv));
    }
    
}
