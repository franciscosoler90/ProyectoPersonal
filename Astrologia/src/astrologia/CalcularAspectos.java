package astrologia;

public class CalcularAspectos {
	
	public static void infoCarta(Line2 carta) {
		
		CalcularSigno calcular = null;
		
		System.out.println();
		System.out.printf("---------- Carta de %s ----------", carta.getName());
		System.out.println();
		System.out.println();
		
		System.out.printf("%d/%02d/%02d - %02d:%02d", carta.getDay() , carta.getMonth() , carta.getYear(), carta.getHour(), carta.getMinute() );
		System.out.println();
		System.out.println();
		
		calcular = new CalcularSigno(carta.getSignoSol());
		System.out.printf("Sol en %d,%02d de %s", carta.getGradoSol(), carta.getMinutoSol(), calcular.getSigno() );
		System.out.println();
		
		calcular = new CalcularSigno(carta.getSignoLuna());
		System.out.printf("Luna en %d,%02d de %s", carta.getGradoLuna(), carta.getMinutoLuna(), calcular.getSigno() );
		System.out.println();
		
		calcular = new CalcularSigno(carta.getSignoMercurio());
		System.out.printf("Mercurio en %d,%02d de %s", carta.getGradoMercurio(), carta.getMinutoMercurio(), calcular.getSigno() );
		System.out.println();
		
		calcular = new CalcularSigno(carta.getSignoVenus());
		System.out.printf("Venus en %d,%02d de %s", carta.getGradoVenus(), carta.getMinutoVenus(), calcular.getSigno() );
		System.out.println();
		
		calcular = new CalcularSigno(carta.getSignoMarte());
		System.out.printf("Marte en %d,%02d de %s", carta.getGradoMarte(), carta.getMinutoMarte(), calcular.getSigno() );
		System.out.println();
		
		calcular = new CalcularSigno(carta.getSignoJupiter());
		System.out.printf("Júpiter en %d,%02d de %s", carta.getGradoJupiter(), carta.getMinutoJupiter(), calcular.getSigno() );
		System.out.println();
		
		calcular = new CalcularSigno(carta.getSignoSaturno());
		System.out.printf("Saturno en %d,%02d de %s", carta.getGradoSaturno(), carta.getMinutoSaturno(), calcular.getSigno() );
		System.out.println();
		
		System.out.println();
		
		aspectosCarta(carta);
		
		CalcularDignidades.dignidades(carta);
		
	System.out.println();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------
	
	public static void aspectosCarta(Line2 carta) {	
	
	CalcularSigno calcular = null;		
	CalcularSigno calcular2 = null;	
	
	int Grado1 = 0;
	int Minuto1 = 0;
	int Grado2 = 0;
	int Minuto2 = 0;
	
	int[] result3;
	
	String n1 = "";
	String n2 = "";
	
	System.out.println();
	System.out.printf("---------- Aspectos de la carta de %s ----------", carta.getName());
	System.out.println();
	
	for(int i = 0; i < 7 ; i++) {
	
	switch(i) {
	
	case 0:
	calcular = new CalcularSigno(carta.getSignoSol());		
	Grado1 = carta.getGradoSol();
	Minuto1 = carta.getMinutoSol();
	n1 = CalcularPlaneta.nombre(1);
	break;
	case 1:
	calcular = new CalcularSigno(carta.getSignoLuna());	
	Grado1 = carta.getGradoLuna();
	Minuto1 = carta.getMinutoLuna();
	n1 = CalcularPlaneta.nombre(2);
	break;
	case 2:
	calcular = new CalcularSigno(carta.getSignoMercurio());			
	Grado1 = carta.getGradoMercurio();
	Minuto1 = carta.getMinutoMercurio();
	n1 = CalcularPlaneta.nombre(3);
	break;
	case 3:
	calcular = new CalcularSigno(carta.getSignoVenus());	
	Grado1 = carta.getGradoVenus();
	Minuto1 = carta.getMinutoVenus();
	n1 = CalcularPlaneta.nombre(4);
	break;
	case 4:
	calcular = new CalcularSigno(carta.getSignoMarte());		
	Grado1 = carta.getGradoMarte();
	Minuto1 = carta.getMinutoMarte();
	n1 = CalcularPlaneta.nombre(5);
	break;
	case 5:
	calcular = new CalcularSigno(carta.getSignoJupiter());			
	Grado1 = carta.getGradoJupiter();
	Minuto1 = carta.getMinutoJupiter();
	n1 = CalcularPlaneta.nombre(6);
	break;
	case 6:
	calcular = new CalcularSigno(carta.getSignoSaturno());	
	Grado1 = carta.getGradoSaturno();
	Minuto1 = carta.getMinutoSaturno();
	n1 = CalcularPlaneta.nombre(7);
	break;
	
	}
	
	for(int j = 0; j < 7 ; j++) {
	
	switch(j) {
	
	case 0:
	calcular2 = new CalcularSigno(carta.getSignoSol());	
	Grado2 = carta.getGradoSol();
	Minuto2 = carta.getMinutoSol();
	n2 = CalcularPlaneta.nombre(1);
	break;
	case 1:
	calcular2 = new CalcularSigno(carta.getSignoLuna());	
	Grado2 = carta.getGradoLuna();
	Minuto2 = carta.getMinutoLuna();
	n2 = CalcularPlaneta.nombre(2);
	break;
	case 2:
	calcular2 = new CalcularSigno(carta.getSignoMercurio());
	Grado2 = carta.getGradoMercurio();
	Minuto2 = carta.getMinutoMercurio();
	n2 = CalcularPlaneta.nombre(3);
	break;
	case 3:
	calcular2 = new CalcularSigno(carta.getSignoVenus());		
	Grado2 = carta.getGradoVenus();
	Minuto2 = carta.getMinutoVenus();
	n2 = CalcularPlaneta.nombre(4);
	break;
	case 4:
	calcular2 = new CalcularSigno(carta.getSignoMarte());	
	Grado2 = carta.getGradoMarte();
	Minuto2 = carta.getMinutoMarte();
	n2 = CalcularPlaneta.nombre(5);
	break;
	case 5:
	calcular2 = new CalcularSigno(carta.getSignoJupiter());		
	Grado2 = carta.getGradoJupiter();
	Minuto2 = carta.getMinutoJupiter();
	n2 = CalcularPlaneta.nombre(6);
	break;
	case 6:
	calcular2 = new CalcularSigno(carta.getSignoSaturno());	
	Grado2 = carta.getGradoSaturno();
	Minuto2 = carta.getMinutoSaturno();
	n2 = CalcularPlaneta.nombre(7);
	break;
	
	}	
	
	result3 = CalcularDiferenciaGrados.diferencia( Grado1 + calcular.getGrado(), Minuto1, Grado2 + calcular2.getGrado(), Minuto2, 4 );
	
	//Aspectos
	if(result3[0]>0 && i<j) {
	System.out.println();
	System.out.printf("Aspecto: %dº - Diferencia: %d,%02d | %s en %d,%02d de %s - %s en %d,%02d de %s", result3[0], result3[1], result3[2], n1, Grado1, Minuto1, calcular.getSigno(), n2, Grado2, Minuto2, calcular2.getSigno() );			
	}
	
	}
	}
	}
	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------	
	
	public static void sinastria(Line2 carta1, Line2 carta2) {	
	
	CalcularSigno calcular = null;		
	CalcularSigno calcular2 = null;
	
	int Grado1 = 0;
	int Minuto1 = 0;
	int Grado2 = 0;
	int Minuto2 = 0;
	
	int[] result3;
	
	String n1 = "";
	String n2 = "";
	
	System.out.println();		
	System.out.printf("---------- Sinastra entre %s y %s ----------", carta1.getName(), carta2.getName() );
	System.out.println();
	
	for(int i = 0; i < 7 ; i++) {
	
	switch(i) {
	
	case 0:
	calcular = new CalcularSigno(carta1.getSignoSol());		
	Grado1 = carta1.getGradoSol();
	Minuto1 = carta1.getMinutoSol();
	n1 = CalcularPlaneta.nombre(1);
	break;
	case 1:
	calcular = new CalcularSigno(carta1.getSignoLuna());	
	Grado1 = carta1.getGradoLuna();
	Minuto1 = carta1.getMinutoLuna();
	n1 = CalcularPlaneta.nombre(2);
	break;
	case 2:
	calcular = new CalcularSigno(carta1.getSignoMercurio());			
	Grado1 = carta1.getGradoMercurio();
	Minuto1 = carta1.getMinutoMercurio();
	n1 = CalcularPlaneta.nombre(3);
	break;
	case 3:
	calcular = new CalcularSigno(carta1.getSignoVenus());	
	Grado1 = carta1.getGradoVenus();
	Minuto1 = carta1.getMinutoVenus();
	n1 = CalcularPlaneta.nombre(4);
	break;
	case 4:
	calcular = new CalcularSigno(carta1.getSignoMarte());		
	Grado1 = carta1.getGradoMarte();
	Minuto1 = carta1.getMinutoMarte();
	n1 = CalcularPlaneta.nombre(5);
	break;
	case 5:
	calcular = new CalcularSigno(carta1.getSignoJupiter());			
	Grado1 = carta1.getGradoJupiter();
	Minuto1 = carta1.getMinutoJupiter();
	n1 = CalcularPlaneta.nombre(6);
	break;
	case 6:
	calcular = new CalcularSigno(carta1.getSignoSaturno());	
	Grado1 = carta1.getGradoSaturno();
	Minuto1 = carta1.getMinutoSaturno();
	n1 = CalcularPlaneta.nombre(7);
	break;
	
	}
	
	for(int j = 0; j < 7 ; j++) {
	
	switch(j) {
	
	case 0:
	calcular2 = new CalcularSigno(carta2.getSignoSol());	
	Grado2 = carta2.getGradoSol();
	Minuto2 = carta2.getMinutoSol();
	n2 = CalcularPlaneta.nombre(1);
	break;
	case 1:
	calcular2 = new CalcularSigno(carta2.getSignoLuna());	
	Grado2 = carta2.getGradoLuna();
	Minuto2 = carta2.getMinutoLuna();
	n2 = CalcularPlaneta.nombre(2);
	break;
	case 2:
	calcular2 = new CalcularSigno(carta2.getSignoMercurio());
	Grado2 = carta2.getGradoMercurio();
	Minuto2 = carta2.getMinutoMercurio();
	n2 = CalcularPlaneta.nombre(3);
	break;
	case 3:
	calcular2 = new CalcularSigno(carta2.getSignoVenus());		
	Grado2 = carta2.getGradoVenus();
	Minuto2 = carta2.getMinutoVenus();
	n2 = CalcularPlaneta.nombre(4);
	break;
	case 4:
	calcular2 = new CalcularSigno(carta2.getSignoMarte());	
	Grado2 = carta2.getGradoMarte();
	Minuto2 = carta2.getMinutoMarte();
	n2 = CalcularPlaneta.nombre(5);
	break;
	case 5:
	calcular2 = new CalcularSigno(carta2.getSignoJupiter());		
	Grado2 = carta2.getGradoJupiter();
	Minuto2 = carta2.getMinutoJupiter();
	n2 = CalcularPlaneta.nombre(6);
	break;
	case 6:
	calcular2 = new CalcularSigno(carta2.getSignoSaturno());	
	Grado2 = carta2.getGradoSaturno();
	Minuto2 = carta2.getMinutoSaturno();
	n2 = CalcularPlaneta.nombre(7);
	break;
	
	}	
	
	result3 = CalcularDiferenciaGrados.diferencia( Grado1 + calcular.getGrado(), Minuto1, Grado2 + calcular2.getGrado(), Minuto2, 4 );
	
	
	//Aspectos
	if(result3[0]>0) {
	System.out.println();
	System.out.printf("Aspecto: %dº - Diferencia: %d,%02d | %s en %d,%02d de %s - %s en %d,%02d de %s", result3[0], result3[1], result3[2], n1, Grado1, Minuto1, calcular.getSigno(), n2, Grado2, Minuto2, calcular2.getSigno() );			
	}
	
	}
	}
	
	}
	}		