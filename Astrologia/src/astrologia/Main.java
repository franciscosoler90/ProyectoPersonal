package astrologia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
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
	        Line1[] Line1Array = lector.leer();
	        
	        //----------------------------------------------------------------------

	        Line2 cartas[] = new Line2[2];
	        cartas = CalcularCartas.leer(Line1Array);

	        //----------------------------------------------------------------------       
	        
	        CalcularAspectos.infoCarta(cartas);
	        CalcularAspectos.sinastria(cartas);
	        
	        
	        teclado.close();
	        //----------------------------------------------------------------------			
			break;
		case 2:
	        System.out.println();
	        
	        teclado.close();
	        
	        System.out.print("---------- FIN ----------");
			break;
		case 3:
	        System.out.println();
	        
	        teclado.close();
	        
	        System.out.print("---------- FIN ----------");
			break;
		case 4:
	        System.out.println();
	        
	        teclado.close();
	        
	        System.out.print("---------- FIN ----------");
			break;
		default:
	        System.out.println();
	        
	        teclado.close();
	        
	        System.out.print("---------- FIN ----------");
			break;
		}
	}
}