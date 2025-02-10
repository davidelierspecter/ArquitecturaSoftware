/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notifier;

/**
 *
 * @author crazy
 */
public class FacebookDecorator extends BaseNotifierDecorator {
    
    public FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }
    
    @Override
    public void send(String message){
        super.send(message);
        String mail = databaseService.getMainFromUsername(getUsername());
        System.out.println("Sending via faacebook to " + mail);
    }
    
}
