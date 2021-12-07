package ejercicios;

import java.util.Scanner;
import java.util.ArrayList;

public class GestionCuentas {
	
	static CuentaCorriente p1 = new CuentaCorriente();
	
	static ArrayList<CuentaCorriente> p2 = new ArrayList<CuentaCorriente>();

	public static void main(String[] args) {
		
		int opcion = 1;
		
		while(opcion!=0) {
			opcion = menu();
			if(opcion!=0) {
				opciones(opcion);
			}
		}	
		
		System.out.println("\nFIN DE PROGRAMA");
	}
	
	private static int menu() {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int op;
		do {
			System.out.println("\n1. Crear nueva cuenta" + "\n2. Ingresar en cuenta" + "\n3. Retirar de cuenta" + "\n4. Visualizar cuenta" + "\n5. Visualiza todas las cuentas" + "\n0. Fin");
			System.out.print("\nElige una opción: ");
			op = teclado.nextInt();
		}while(op< 0 || op>5);
		
		return op;

	}	
	

	private static void opciones(int opcion) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double cantidad;
		
		System.out.printf("\nCuentas corrientes creadas: %d", CuentaCorriente.getNumSiguiente());
		
		if(CuentaCorriente.getNumSiguiente() <= 0) {
			
			if(opcion==1) {
				
				System.out.println("\nCrear nueva cuenta <-----");	
				System.out.print("\nNombre del cliente: ");
				String nombre = teclado.nextLine();
				System.out.print("\nSaldo de la cuenta: ");
				cantidad = teclado.nextDouble();				
				System.out.printf("\nSe ha creado la cuenta del cliente: %s con el saldo: %.2f", nombre, cantidad);	
				System.out.println();
				p1 = new CuentaCorriente(cantidad,nombre);	
				p2.add(p1);
				
			}else {
				System.out.print("\nDebes crear una cuenta primero");	
				System.out.println();
			}

		}else {
			
			switch(opcion) {
			case 0:
				System.out.println("Fin <-----");
				break;
			case 1:
				System.out.println("\nCrear nueva cuenta <-----");	
				System.out.print("\nNombre del cliente: ");
				String nombre = teclado.nextLine();
				System.out.print("\nSaldo de la cuenta: ");
				cantidad = teclado.nextDouble();				
				System.out.printf("\nSe ha creado la cuenta del cliente: %s con el saldo: %.2f", nombre, cantidad);	
				System.out.println();
				p1 = new CuentaCorriente(cantidad,nombre);
				p2.add(p1);
				break;
			case 2:
				System.out.print("\nIngresar en cuenta: ");
				cantidad = teclado.nextDouble();		
				p1.ingresaEfectivo(cantidad);
				break;
			case 3:
				System.out.print("\nRetirar de cuenta: ");
				cantidad = teclado.nextDouble();	
				p1.retiraEfectivo(cantidad);
				break;		
			case 4:
				System.out.println("\nVisualizar cuenta: ");
				p1.visualiza();
				break;
			case 5:
				System.out.println();
				
				for(int i = 0; i<p2.size(); i++) {

					System.out.printf("\nCliente: %s, Número de cuenta: %d, Saldo: %.2f", p2.get(i).getCliente(), p2.get(i).getNumCuenta(), p2.get(i).getSaldo() );	
					
				}

				System.out.println();	
				break;
			default:
				System.out.print("\nFIN");
				break;
			}			
			
		}
		

		
	}		
	
	
	
	
	
	
	
	
	

}