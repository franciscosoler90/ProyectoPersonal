package unidad5_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		int numero,numErrores=0;
		final int TAM_VECTOR = 5;
		int numeros[] =new int[TAM_VECTOR];
		
		for (int i=0;i<numeros.length;i++) {
			try {
				numero = pideNumero();
				numeros[i]= numero;
			}catch(InputMismatchException ex) {
				System.out.println("No has introducido numero valido:");
				numErrores++;
				i--;
			}
		}
		System.out.println("Se han producido "+numErrores+" errores.");
		muestraNumeros(numeros);
	}//main

/**
 * Método pideNumero
 * @return numero entero obtenido por teclado
 */
	private static int pideNumero() {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		System.out.println("Numero:");
		num = teclado.nextInt();
		return num;
	}
	/**
	 * Metodo muestraNuemeros
	 * @param numeros vector enteros
	 * Muestra por pantalla todos los números del vector.
	 */
	private static void muestraNumeros(int[] numeros) {
		for (int i=0;i<numeros.length;i++) {
			System.out.printf("\n%d ",numeros[i]);
		} 
	}
}