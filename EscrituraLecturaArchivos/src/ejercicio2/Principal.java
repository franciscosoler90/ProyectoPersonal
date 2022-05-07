package ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	public static void main(String[] args) {

		// Ingrese datos usando BufferReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num1=0, num2=0;
		boolean correcto;
		
		
		try {
			do {
				try {
					// Leyendo datos usando readLine
					System.out.println("Introduce un numero");
					num1 = Integer.parseInt(reader.readLine());
					System.out.println("Introduce otro numero");
					num2 = Integer.parseInt(reader.readLine());
					correcto=true;
				}catch(NumberFormatException e) {
					System.out.println("Error. Debe ser un número!!");
					correcto=false;
				}	
			}while(!correcto);
			
			// Imprimir la línea de lectura
			if (num1 == num2) {
				System.out.println("Son iguales");
			} else {
				System.out.println("Son distintos");
			}
		
		}catch (IOException e) {
			System.err.println("Error en la lectura del teclado");
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.err.println("Error al cerrar el teclado");
			}
		}

	}

}