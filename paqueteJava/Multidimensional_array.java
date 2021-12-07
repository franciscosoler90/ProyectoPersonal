package paqueteJava;

public class Multidimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        int[] carta1 = {0, 1, 2};
        int[] carta2 = {3, 4, 5};
        int[] carta3 = {6, 7, 8};
         
        //array of arrays
        int[][] cartas = {carta1, carta2, carta3};
        
        for(int i = 0; i < cartas[0].length; i++) {
        	
        	for(int j = 1; j < cartas.length; j++) {
        		
				for(int k = 0; k < cartas[j].length; k++) {
					
					System.out.printf("\n[%d,%d] [%d,%d,%d]", cartas[0][i], cartas[j][k], i,j,k);
					
				}
				
        	}
        	
        	System.out.println();
        	
        }

		

}
	
}
