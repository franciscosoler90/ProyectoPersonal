package paqueteJava;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un n�mero: ");
		
		int numero = teclado.nextInt();
		
		System.out.printf("Has introducido el n�mero %d", numero);		
		
		teclado.close();
		
	}

}
