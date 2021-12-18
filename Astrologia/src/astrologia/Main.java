package astrologia;

import java.util.Scanner;

public class Main {
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
	
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
        

		switch(input) {
		case 1:
	        System.out.println();
			
	        CsvReader lector = new CsvReader();
	        Line1 Line1Array = lector.leer();

	        Line2 carta = null;
	        carta = CalcularCartas.leer(Line1Array);

	        CalcularAspectos.infoCarta(carta);

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
	
	
	public static void finalizar() {
        teclado.close();
        System.out.println("---------- FIN ----------");	
	}
	
	
}