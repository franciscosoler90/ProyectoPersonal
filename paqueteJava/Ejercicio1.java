package paqueteJava;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		
		int numero = teclado.nextInt();
		
		System.out.printf("Has introducido el número %d", numero);		
		
		teclado.close();
		
	}

}
