package solerEjercicio1;



public class SolerEjercicio1 {

	public static void main(String[] args) {
		

		int matriz[][];
		
		matriz = new int[5][5];
		
		
		for(int i=0; i<matriz.length; i++) {
			
			for(int j = 0; j <matriz[i].length; j++) {
				
				matriz[i][j] = (int) (Math.random()*10)+1;
				System.out.printf("[%d] ", matriz[i][j]);
				
			}
			
			System.out.printf("\nLa media de la fila %d es %.2f", i, calculoMediaFila(matriz[i]));
			
			calculoMediaFila(matriz[i]);
			System.out.println();
			System.out.println();
			System.out.println();

		}
		
		calculoMinimoColumna(matriz,1);

	

	}
	
	public static int calculoMinimoColumna(int matriz[][], int columna){
		
		int matriz2[][];
		
		matriz2 = new int[5][5];
		
		int minimo = 100;
		
		for(int i = 0; i<matriz.length;i++) {
			
			minimo = 100;
			
			for(int j = 0; j<matriz[i].length; j++) {
				
				matriz2[i][j] = matriz[j][i];
				//System.out.printf("[%d] ", matriz2[i][j]);
				
				if(minimo>matriz2[i][j]) {
					
					minimo = matriz2[i][j];
					
				}
				
				
			}
			
			System.out.println("El valor minimo de la columna "+i+" es: " + minimo);
			System.out.println();
			
			
		}
		
		
		return minimo;

	}	
	
	public static float calculoMediaFila(int[] fila){
		
		float media = 0;
		
		for(int i = 0; i<fila.length; i++) {	
			media+=fila[i];
		}
		
		media = media / fila.length;
		return media;
	}		
	
	

}
