
package javaapplication18;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class GuardarArchivo {
    static void writeToFile(String fileName, String text){
        try{
            FileWriter file = new FileWriter(fileName);
            BufferedWriter buffer = new BufferedWriter(file);
            
            buffer.append(text);
            
            buffer.close();
        }
        catch(Exception e){
            System.out.println("No se pudo guardar el archivo");
        }
    }
}
