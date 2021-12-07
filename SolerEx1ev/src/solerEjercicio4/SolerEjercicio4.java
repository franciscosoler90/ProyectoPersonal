package solerEjercicio4;

import java.util.Scanner;

public class SolerEjercicio4 {

	public static void main(String[] args) {

		String cadena = "";
		String caracter = "";
		
		Integer numero = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("\nIntroduce una cadena: ");
		
		cadena = teclado.nextLine();
		
		System.out.println();
		
		for(int i = 0; i< cadena.length(); i++) {
			
			caracter = cadena.substring(i,i+1);
			
			try {
				
				numero = (int) Integer.parseInt(caracter);
				
				i++;
				caracter = cadena.substring(i,i+1);
				
				for(int j = 0; j < numero; j++) {
					
					System.out.printf("%s", caracter );
					
				}
				
			}catch(Exception e) {
				

				System.out.printf("%s", caracter );
			
				
			}
			


				

			
			
		}
		
		
		
		teclado.close();
		
	}

}
