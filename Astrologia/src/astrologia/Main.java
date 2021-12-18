package astrologia;

import java.util.Scanner;

public class Main {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcion = -1;
		
		do {
			
			opcion = menu();
			opciones(opcion);
			
		}while(opcion < 1 || opcion > 4);
		
		teclado.close();
	}

        
	public static void opciones(int opcion) {
			
		switch(opcion) {
		case 1:

			String confirmacion = "";
			
	        CsvReader lector = new CsvReader();
	        Line1 Line1Array = lector.leer(teclado);

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
			
			finalizar();    
			break;
		case 2:
			finalizar();
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
        		+ "\n4. Salir"
        		);      
        
		System.out.println();
        
		do {
            System.out.print("Elige una opción: ");
            while (!teclado.hasNextInt()) {
				System.out.println("Valor no válido");
				teclado.next();
				System.out.print("Elige una opción: ");                               
			}
            input = teclado.nextInt();
            
            if(input <= 0 || input>= 5){
				System.out.println("El número debe ser 1 - 4");                                           
			}
		} while (input <= 0 || input>= 5);
		
		
        System.out.println();
		return input;
	}
	
	
	public static void finalizar() {
        System.out.println("---------- FIN ----------");	
	}
	
	public static Boolean confirmar(String cadena) {
		
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