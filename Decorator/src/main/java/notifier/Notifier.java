/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notifier;

/**
 *
 * @author crazy
 */
public class Notifier implements INotifier{
    private final String username;
    private final DatabaseService databaseService;
    
    public Notifier(String username){
        this.username = username;
        databaseService = new DatabaseService();
    }

    @Override
    public void send(String message) {
        String mail = databaseService.getMainFromUsername(username);
        System.out.println("Sending " + message + " by Main to " + mail);
    }

    @Override
    public String getUsername() {
        return username;
    }
    
}
