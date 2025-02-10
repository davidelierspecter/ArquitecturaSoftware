/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author crazy
 */
public class FileDataSource implements DataSource {
    private String name;
    
    public FileDataSource(String name){
        this.name = name;
    }
    
    @Override
    public void writeData(String Data) {
        File file = new File(name);
        try (OutputStream fos = new FileOutputStream(file)){
            fos.write(Data.getBytes(), 0, Data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)){
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
    
}         
