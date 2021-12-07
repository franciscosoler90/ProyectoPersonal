package astrologia;

public class CalcularDignidades {
	
	public static void dignidades(Line2 carta) {

		String planeta = "";
		
		int grado = 0;
		int puntos = 0;
		
		// Comprobar si es dia o noche
		boolean dia = true;
		
	    System.out.println();
	    System.out.println();
        System.out.printf("---------- Dignidades planetarias de %s ----------", carta.getName());
	    System.out.println();
	    System.out.println();
		
		CalcularSigno calcular = new CalcularSigno();
		
		for(int i = 0; i < 7; i++) {
			
			switch(i) {
			
			case 0:
				calcular = new CalcularSigno(carta.getSignoSol());		
				grado = carta.getGradoSol();
				planeta = CalcularPlaneta.nombre(1);
				break;
				
			case 1:
				calcular = new CalcularSigno(carta.getSignoLuna());	
				grado = carta.getGradoLuna();
				planeta = CalcularPlaneta.nombre(2);
				break;
				
			case 2:
				calcular = new CalcularSigno(carta.getSignoMercurio());			
				grado = carta.getGradoMercurio();
				planeta = CalcularPlaneta.nombre(3);
				break;
				
			case 3:
				calcular = new CalcularSigno(carta.getSignoVenus());	
				grado = carta.getGradoVenus();
				planeta = CalcularPlaneta.nombre(4);
				break;
				
			case 4:
				calcular = new CalcularSigno(carta.getSignoMarte());		
				grado = carta.getGradoMarte();
				planeta = CalcularPlaneta.nombre(5);
				break;
				
			case 5:
				calcular = new CalcularSigno(carta.getSignoJupiter());			
				grado = carta.getGradoJupiter();
				planeta = CalcularPlaneta.nombre(6);
				break;
				
			case 6:
				calcular = new CalcularSigno(carta.getSignoSaturno());	
				grado = carta.getGradoSaturno();
				planeta = CalcularPlaneta.nombre(7);
				break;
	
			}			
			
			
			for(int j = 0; j < 7; j++) {
				
				switch(j) {
					
					// DOMICILIO
					case 0:
					
						if( planeta.equals(calcular.getRegente()) ) {
							puntos+=5;
						}						
					
					break;
					
					// EXALTACION
					case 1:
					
						if( planeta.equals(calcular.getExaltacion()) ) {
							puntos+=4;
						}
					break;
					
					// TRIPLICIDAD
					case 2:
					
						if(dia) {
							
							if( planeta.equals(calcular.getTriplicidad()[0]) ) {
								puntos+=3;
							}
							break;
							
							}else {
							
							if( planeta.equals(calcular.getTriplicidad()[1]) ) {
								puntos+=3;
							}
							break;
						}

					// TERMINOS
					case 3:
					
					for(int k = 0; k < 5; k++) {
						
						
						switch(k) {
							
							case 0:
							if( grado < calcular.getTerminoArray()[k] && planeta.equals(calcular.getTermino()[k]) ) {
								puntos+=2;
							}
							break;							
							
							case 1:
							if( grado < calcular.getTerminoArray()[k] && grado > calcular.getTerminoArray()[0] && planeta.equals(calcular.getTermino()[k]) ) {
								puntos+=2;
							}
							break;							
							
							case 2:
							if( grado < calcular.getTerminoArray()[k] && grado > calcular.getTerminoArray()[1] && planeta.equals(calcular.getTermino()[k]) ) {
								puntos+=2;
							}
							break;							
							
							case 3:
							if( grado < calcular.getTerminoArray()[k] && grado > calcular.getTerminoArray()[2] && planeta.equals(calcular.getTermino()[k]) ) {
								puntos+=2;
							}
							break;
							
							case 4:
							if( grado < calcular.getTerminoArray()[k] && grado > calcular.getTerminoArray()[3] && planeta.equals(calcular.getTermino()[k]) ) {
								puntos+=2;
							}
							break;
							
						}
					}
					
					break;
					
					// DECANATOS		
					case 4:
					
					for(int k = 0; k < 3; k++) {
						

						switch(k) {
						case 0:
							if( grado < 10 && planeta.equals(calcular.getDecanato()[k]) ) {
								puntos+=1;
							}
							break;
						case 1:
							if( grado >= 10 && grado < 20 && planeta.equals(calcular.getDecanato()[k]) ) {
								puntos+=1;
							}
							break;
						case 2:
							if( grado > 20 && planeta.equals(calcular.getDecanato()[k]) ) {
								puntos+=1;
							}
							break;
						}
						
					}
					
					break;
					
					// DETRIMENTO
					case 5:
					
						if( planeta.equals(calcular.getDetrimento()) ) {
							puntos-=5;
						}
						
					break;
					
					// CAIDA
					case 6:
					
						if( planeta.equals(calcular.getCaida()) ) {
							puntos-=4;
						}
					
					break;
					
				}	
			}
			
			System.out.printf("%d puntos - %s en %dº de %s", puntos, planeta, grado, calcular.getSigno() );
			System.out.println();
			puntos = 0;
			
			
		}
	}
}