package astrologia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Escribir {
 
    public static void escribir(Line2 carta) {
    	
    	String resultado = carta.getAllInfo();
    	
        try {
         BufferedWriter output = new BufferedWriter(new FileWriter("Cartas.txt", true));
         
            output.write(resultado);
            output.newLine();
            output.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }
}