package astrologia;

import java.util.Scanner;

public class Main {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcion = -1;
		
		do {
			
			opcion = menu();
			opciones(opcion);
			
		}while(opcion > 0 && opcion <= 3);
		
		teclado.close();
	}
	
	
	public static void opciones(int opcion) {
		
		switch(opcion) {
			case 1:
			
			String confirmacion = "";
			
	        CsvReader lector = new CsvReader();
	        Line1 Line1Array = lector.searchCharts(teclado);
			
	        Line2 carta = null;
	        carta = CalcularCartas.leer(Line1Array);
			
	        CalcularAspectos.infoCarta(carta);
	        
			System.out.print("\n¿Guardar la carta? (Y/N): ");  
			
			teclado.nextLine();
			
			confirmacion = teclado.nextLine();
			
			if( confirmar(confirmacion) ) {
				System.out.println("Carta guardada");  
				Escribir.escribir(carta);
			}
			
			System.out.println();
			
		break;
		case 2:
		
		String nombre = "";
		
		System.out.print("\nIntroduce el nombre: ");  
		
		teclado.nextLine();
		
		nombre = teclado.nextLine();
		
		CsvReader.searchName(nombre, teclado);
		
		break;
		case 3:
		finalizar();
		break;
		case 4:
		finalizar();
		break;
		default:
		finalizar();
		break;
		}
		
		}
		
		
		public static Integer menu() {
		
		
		int input = 0;
		
        System.out.print("1. Introducir nueva carta"
		+ "\n2. Buscar una carta"
		+ "\n3. Sinastria"
		+ "\n0. Salir"
		);      
        
		System.out.println();
		System.out.println();
        
		do {
		System.out.print("Elige una opción: ");
		while (!teclado.hasNextInt()) {
		System.out.println("Valor no válido");
		teclado.next();
		System.out.print("Elige una opción: ");                               
		}
		input = teclado.nextInt();
		
		if(input < 0 || input > 3){
		System.out.println("El número debe ser 0 - 3");                                           
		}
		} while (input < 0 || input > 3);
		
		
        System.out.println();
		return input;
		}
		
		
		public static void finalizar() {
        System.out.println("---------- FIN ----------");	
        System.out.println();
		}
		
		public static Boolean confirmar(String cadena) {
			
		System.out.print("¿Confirmar? (Y/N): ");
		
		if( cadena.length()>0 ) {
		
		if( String.valueOf( cadena.toLowerCase().charAt(0) ).equals("y") ) {
		return true;
		}else {
		return false;
		}
		
		}else {
		
		return false;
		
		}
		
		
		
		}
		
		
		
		
		
		}		