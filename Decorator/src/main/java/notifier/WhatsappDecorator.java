/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notifier;

/**
 *
 * @author crazy
 */
public class WhatsappDecorator extends BaseNotifierDecorator {
    
    public WhatsappDecorator(INotifier wrapped) {
        super(wrapped);
    }
    
    @Override
    public void send(String message) {
        super.send(message);
        String phoneNbr = databaseService.getPhoneNumber(message);
        System.out.println("Sending " + message + " by Whatsapp on " + phoneNbr);
    }
    
}
