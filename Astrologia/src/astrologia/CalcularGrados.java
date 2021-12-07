package astrologia;

public class CalcularGrados {
	
	public static GradoMinutoSigno calcularMedia(int grado1, int minuto1, int grado2, int minuto2, int hour, String signo1, String signo2) {

	    float diferencia = 0;

		int resultadoGrado = 0;	
		int resultadoMinuto = 0;		
		
		String resultadoText = "";
	    	    	 

		if( grado1 <= grado2 ) {
			
			  
		    float suma1 = (grado1 + ( (float)minuto1 / 60) ); 
		    float suma2 = (grado2 + ( (float)minuto2 / 60) ); 
			
			// No cambio de signo
		    if(suma1>=suma2) {
		    	diferencia = suma2 + ((suma1-suma2)/24)*hour;
		    }else {
		    	diferencia = suma1 + ((suma2-suma1)/24)*hour;
		    }
		    
		    resultadoGrado = convertir(diferencia)[0];
		    resultadoMinuto = convertir(diferencia)[1];
		    
			resultadoText = signo1;

			}else {
				
				// Cambio de signo
				float op1 = (float) ((float)grado1 + ((float)minuto1/60));
				float op2 = (float) ((float)grado2 + ((float)minuto2/60));	
				diferencia = ((((30 - op1) + op2) / 24) * hour) - (30 - op1);
				
			    if( diferencia < 0) {
			    	diferencia = 30 + diferencia;
					resultadoText = signo1;
			    }else {
					resultadoText = signo2;
			    }
			    
			    
			    resultadoGrado = convertir(diferencia)[0];
			    resultadoMinuto = convertir(diferencia)[1];

			}

		
		return new GradoMinutoSigno(resultadoGrado, resultadoMinuto, resultadoText);
	}
	
	
	
	
	public static int[] convertir(Float grado) {
		
	    float parteDecimal = grado % 1; // Lo que sobra de dividir al número entre 1
		int parteEntera = (int) (grado - parteDecimal); // Le quitamos la parte decimal usando una resta
		
		parteDecimal = parteDecimal * 60;
		
		
		int[] arr={parteEntera, (int) parteDecimal};
		return arr;  


		
	}	
	
	
	
	
	
}