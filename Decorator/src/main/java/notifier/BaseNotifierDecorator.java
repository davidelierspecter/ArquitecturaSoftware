/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notifier;

/**
 *
 * @author crazy
 */
public abstract class BaseNotifierDecorator implements INotifier{
    private final INotifier wrapped;
    protected final DatabaseService databaseService;
    
    BaseNotifierDecorator(INotifier wrapped){
        this.wrapped = wrapped;
        databaseService = new DatabaseService();
    }
    
    @Override
    public void send(String message){
        wrapped.send(message);
    }
    
    @Override
    public String getUsername(){
        return wrapped.getUsername();
    }
    
}
