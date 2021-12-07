package solerEjercicio2;

import java.util.Scanner;

public class SolerEjercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String frase = "";

		int vocalA = 0;
		int vocalE = 0;
		int vocalI = 0;
		int vocalO = 0;
		int vocalU = 0;
		
		
		do {
		
		System.out.print("\nIntroduce una frase de máximo 40 caracteres: ");
		
		frase = teclado.nextLine();
		
		}while(frase.length()>40);
		
		for(int i=0; i<frase.length(); i++) {
			
			switch( frase.substring(i ,i+1) ) {
			
				case "a":
					vocalA++;
					break;
				case "e":
					vocalE++;
					break;
				case "i":
					vocalI++;
					break;
				case "o":
					vocalO++;
					break;
				case "u":
					vocalU++;
					break;
				case "A":
					vocalA++;
					break;
				case "E":
					vocalE++;
					break;
				case "I":
					vocalI++;
					break;
				case "O":
					vocalO++;
					break;
				case "U":
					vocalU++;
					break;
			}
		}
		

		System.out.printf("\nFrecuencias de las vocales - A: %d - E: %d - I: %d - O: %d - U: %d", vocalA, vocalE, vocalI, vocalO, vocalU);		
		
		teclado.close();
		
	}

}
