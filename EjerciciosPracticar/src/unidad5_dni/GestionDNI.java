package unidad5_dni;

import java.util.Scanner;

public class GestionDNI {

	public static void main(String[] args) {

		String sDni;
		DNI objDni;
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			opcion = Menu();
			//System.out.println(opcion);
			switch (opcion) {
			case 1:
				System.out.println("Dame un dni: ");
				sDni = sc.nextLine();
				try {
					objDni = new DNI(sDni);
					System.out.println(objDni);
				} catch (LetraIncorrecta e) {
					System.out.println(e.getMessage());
					System.out.println("Introduce de nuevo el DNI");
				} catch (NumberFormatException e) {
					System.out.println("Formato 00000000L");
				}

				break;
			}
		} while (opcion != 0);

		sc.close();
	}

	public static int Menu() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("\n1. Pedir DNI\n0. Salir");
			opcion = sc.nextInt();
		} while (opcion != 0 && opcion != 1);
		//System.out.println(opcion);
		return opcion;
	}

}