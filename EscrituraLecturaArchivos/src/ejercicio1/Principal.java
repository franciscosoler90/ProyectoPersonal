package ejercicio1;

import utilidades.Leer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class Principal {

	public static void main(String[] args) {

		ObjectOutputStream fichEscribir = null;
		
		
		try {
			
			
			File fichero = new File("Fichero1.txt");
			
			FileOutputStream fos = new FileOutputStream(fichero);
			
			fichEscribir = new ObjectOutputStream(fos);
			
			fichEscribir.writeChars("Hola"); 


		}catch(FileNotFoundException e){
			 System.out.println("Error. no se encuentra el fichero");
		}catch(IOException e){
			 System.out.println("Error E/S: " + e.getMessage());
		} 
			
			
		

	}

}