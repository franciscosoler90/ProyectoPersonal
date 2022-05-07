package unidad5_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal{

	public static void main(String[] args){

		int edad = 0;
		Scanner teclado = new Scanner(System.in);
		
		
		
		
		try {
			edad = pedirEdad(teclado);
			System.out.println("La edad introducida es: "+edad);
		} catch (MiExcepcion e) {
			System.out.println(e.getMessage());
		} catch(InputMismatchException e) {
			System.out.println("El dato introducido no es un digito");
		}

	}
	
	public static int pedirEdad(Scanner teclado) throws MiExcepcion {
		
		int edad = 0;

		System.out.println("Introduce una edad entre 18 y 65 años: ");
		
		edad = teclado.nextInt();
			

		if(edad < 18 || edad > 65) {
			throw new MiExcepcion();
		}
					
		return edad;
	}

}