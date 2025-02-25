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
public class OnState extends State {

    public OnState(BaseTV tv) {
        super(tv);
    }

    @Override
    public void onTurnOff() {
        tv.setState(new OffState(tv));
    }

    @Override
    public void onTurnOn() {
    }
    
    
}
