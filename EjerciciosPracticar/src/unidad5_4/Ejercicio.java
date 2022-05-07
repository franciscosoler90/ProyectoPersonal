package unidad5_4;

/*Ejercicio 4
Realizar un programa para que pida los datos para realizar 5 divisiones entre n�meros enteros
(y realice las divisiones). Si se introducen datos incorrectos (n�meros no v�lidos o que el
denominador sea 0) no debe abortar.
Para cada divisi�n debe pedir su numerador y su denominador y mostrar el resultado.
Al final del programa decir cu�ntas veces se han introducido datos incorrectos y cu�ntas veces
se ha intentado dividir por 0.
Tiene que llegar a hacer 5 divisiones correctas.
Puedes utilizar la clase Leer.*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		int numerador, denominador,datosIncorrectos, 
				divPorCero, divCorrectas;
		divPorCero = datosIncorrectos = divCorrectas = 0;

		Scanner sc = new Scanner(System.in);

		do{
			System.out.println("Introduzca numerador y despues denominador");
			try {			
				numerador = pedirNum(sc);				
				denominador = pedirNum(sc);
				System.out.println("El cociente de la division entera es: " + numerador/denominador);
				divCorrectas++;
			}catch(InputMismatchException exc) {
				sc.nextLine();
				datosIncorrectos++;
				System.out.println("Datos incorretos, tiene que ser un n�mero");
			}catch(ArithmeticException exc) {
				divPorCero++;
				System.out.println("no se puede dividir entre 0 " + exc.getMessage());
			}
		}while(divCorrectas < 5);
		System.out.println("Datos incorrectos: " + datosIncorrectos);
		System.out.println("Divisiones por cero: " + divPorCero);

		sc.close();
	}//main


	/**
	 * pedirNum metodo que pide un numero 
	 * @param sc
	 * @return devuelve un numero asignado por teclado.
	 */
	private static int pedirNum(Scanner sc) {

		int n;
		n = sc.nextInt();
		return n;
	}

}