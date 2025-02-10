/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author crazy
 */
public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;
    
    DataSourceDecorator(DataSource source){
        this.wrappee = source;
    }
    
    @Override
    public void writeData(String Data) {
        wrappee.writeData(Data);
    }
    
    @Override
    public String readData() {
        return wrappee.readData();
    }
    
}
