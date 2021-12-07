package astrologia;

public class CalcularDiferenciaGrados {
	
	public static int[] diferencia(int grado1, int minuto1, int grado2, int minuto2, int margen){
		
		//[0 = Aspecto; 1 = Grado; 2 = Minuto]
        int[] result = new int[3];
        
		int difGrado = 0;
		int difMinuto = 0;

		if(margen>0 && margen<=8){
				

			
	        //Diferencia grados
		    if(grado1>=0 && grado1<360 && grado2>=0 && grado2<360) {
		    	
		    	
		    		//Grado 1 > Grado 2
			    	if(grado1>grado2) {
			    		if((grado1-grado2)>=180) {
			    			difGrado = 360-grado1+grado2;
			    			}else {
			    			difGrado = grado1-grado2;
			    		}
			    		
				        //Diferencia minutos
					    if(minuto1>=0 && minuto1<60 && minuto2>=0 && minuto2<60) {
							
							if(minuto1>=minuto2) {
								
								difMinuto = minuto1 - minuto2;
				
							}else {
								
								difMinuto = (minuto1 - minuto2) + 60;
								difGrado--;
				
							}
						}			    		
			    		
			    		
			    		
			    	}
		    		//Grado 1 > Grado 2	
			    	else if(grado1<grado2) {
			    		if((grado2-grado1)>=180) {
			    			difGrado = 360-grado2+grado1;
			    			}else {
			    			difGrado = grado2-grado1;
			    		}
			    		
			    		
			    		
				        //Diferencia minutos
					    if(minuto1>=0 && minuto1<60 && minuto2>=0 && minuto2<60) {
							
							if(minuto2>=minuto1) {
								
								difMinuto = minuto2 - minuto1;
				
							}else {
								
								difMinuto = (minuto2 - minuto1) + 60;
								difGrado--;
				
							}
						}				    		
			    		
			    		
			    		
			    		
			    		
			    	}
			    	
		    		//Grado 1 = Grado 2
			    	else {
			    		
			    		
				        //Diferencia minutos
					    if(minuto1>=0 && minuto1<60 && minuto2>=0 && minuto2<60) {
							
							if(minuto1>=minuto2) {
								
								difMinuto = minuto1 - minuto2;
				
							}else {
								
								difMinuto = minuto2 - minuto1;
				
							}
						}
			    		
			    		
			    	}

		    }
				

		    
		    //Si es negativo
		    if(difGrado<0) {
		    	difGrado = difGrado * -1;
		    }
		    

				if(difGrado<margen){
					
					// Conjunción
					result[0] = 1;
			        result[1] = difGrado;
			        result[2] = difMinuto;
					return result;
					
					}else if( difGrado>=(60-margen) && difGrado<=(60+margen) ) {
					
					// Sextil
					result[0] = 2;
			        result[2] = difMinuto;
					if(difGrado>=60) {
						result[1] = difGrado - 60;
						}else {
				        result[1] = 60 - difGrado;
					}
					return result;
					
					}else if( difGrado>=(90-margen) && difGrado<=(90+margen) ) {
					
					// Cuadratura
						result[0] = 3;
				        result[2] = difMinuto;
					if(difGrado>=90) {
						result[1] = difGrado - 90;
						}else {
				        result[1] = 90 - difGrado;
					}
					return result;
					
					}else if( difGrado>=(120-margen) && difGrado<=(120+margen) ) {
					
					// Trigono
						result[0] = 4;
				        result[2] = difMinuto;
					if(difGrado>=120) {
						result[1] = difGrado - 120;
						}else {
				        result[1] = 120 - difGrado;
					}
					return result;
					
					}else if( difGrado>=(180-margen) ) {
					
					// Oposición
						result[0] = 5;
				        result[2] = difMinuto;
					if(difGrado>=180) {
						result[1] = difGrado - 180;
						}else {
				        result[1] = 180 - difGrado;
					}
					
					return result;
					
					
		}else {
			
			//Otros Aspectos
			result[0] = 0;
			result[1] = difGrado;
	        result[2] = difMinuto;
			return result;
			
		}
				
				
				
				
		}else {
		
			//Más del rango de margen
			result[0] = 0;
			result[1] = 0;
	        result[2] = 0;
			return result;
			
			
			}
		
	}		     
}