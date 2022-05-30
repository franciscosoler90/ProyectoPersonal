package utilidades;

public class CalcularGrados {
	
	public static String calcularMedia(int grado1, int minuto1, int grado2, int minuto2, String signo1, String signo2, Hora hora) {
		
	    float diferencia = 0, suma1 = (grado1 + ( (float)minuto1 / 60) ), suma2 = (grado2 + ( (float)minuto2 / 60) ), suma3 = 0; 
		Integer resultadoGrado = 0, resultadoMinuto = 0;		
		String resultadoTextSigno = "";
		Signo signo = new Signo();
		
		// No cambia de signo
		if( grado1 <= grado2 ) {
		    if(suma1>=suma2) {
		    	diferencia = suma2 + ((suma1-suma2)/24)*hora.getHour() + ((suma1-suma2)/1440)*hora.getMinute();
				}else {
		    	diferencia = suma1 + ((suma2-suma1)/24)*hora.getHour() + ((suma2-suma1)/1440)*hora.getMinute();
			}
		    
		    resultadoGrado = convertir(diferencia).getGrado();
		    resultadoMinuto = convertir(diferencia).getMinuto();
		    resultadoTextSigno = signo1;
			
		// Cambio de signo	
		}else {

			suma3 = ( (30 - suma1) + suma2);
			
			diferencia = ( ( suma3 / 24) * hora.getHour() + ( suma3 / 1440) * hora.getMinute() ) - (30 - suma1);
			
			if( diferencia < 0) {
					diferencia = 30 + diferencia;
					resultadoTextSigno = signo1;
			}else {
			    	resultadoTextSigno = signo2;
			}
			
			
			resultadoGrado = convertir(diferencia).getGrado();
			resultadoMinuto = convertir(diferencia).getMinuto();
			
		}
		
		return resultadoGrado.toString() + "º" +  resultadoMinuto.toString() + "'' de " + signo.toString(resultadoTextSigno);
	}
	
	
	public static Grado convertir(Float grado) {
		float parteDecimal = grado % 1; // Lo que sobra de dividir al numero entre 1
		int parteEntera = (int) (grado - parteDecimal); // Le quitamos la parte decimal usando una resta
		
		parteDecimal = parteDecimal * 60;
		
		Grado grado1 = new Grado(parteEntera, (int) parteDecimal);

		return grado1;  
	}	
	
	
}	