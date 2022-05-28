package principal;

import java.io.*;

public class Principal {

	public static void main(String[] args) {

		Escribir();

	}
	
	
	
	
	
	
	public static void Leer() {
		
		try {
			FileInputStream FichAbiertoParaLectura = new FileInputStream ("C:\\Users\\Fran\\Downloads\\prueba.jpg");
					
			boolean FinalFichero=false;
			
			int AlmacenandoByte = 0;
			
			while (!FinalFichero)
			{

				AlmacenandoByte=FichAbiertoParaLectura.read();

				if (AlmacenandoByte==-1)	{
					FinalFichero=true;
				}else {
					System.out.println(AlmacenandoByte);
				}
			}
			FichAbiertoParaLectura.close();

		}catch (IOException e) {
			System.out.println("Fichero no existe");
		}
	}
	
	
	public static void Escribir() {
		try {
			FileOutputStream FichAbiertoParaEscritura = new FileOutputStream ("C:\\Users\\Fran\\Downloads\\prueba.dat");
			
			for(int i = 1000; i< 2000; i++) {
				
				FichAbiertoParaEscritura.write(254);
				
			}
					
			System.out.println("Fin de escritura");
			FichAbiertoParaEscritura.close();
			
		}catch (IOException e) {
			System.out.println("Fichero no existe");
		}
	}


	
	
	
	
	
	
	
	
	
}