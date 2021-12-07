package monopoly;
import java.util.Random;
import java.util.Scanner;

public class Monopoly {

	//Francisco José Soler Conchello
	public static void main(String[] args) {

		Random ran = new Random();
		int dado1 = 0;
		int dado2 = 0;
		int dobles = 0;
		int posicion = 1;
		int vuelta = 0;
		int carcelTurnos = 0;
		int dinero = 1500;
		boolean esCarcel = false;
		
		Scanner teclado = new Scanner(System.in);
		
	    System.out.print("\nPulsa cualquier tecla para lanzar los dados. Pulsa 0 para salir: ");
		
		//while(!cadena.equals("0")) {
			
		for(int i = 0; i < 100; i++) {	
			
	    //System.out.print("\nPulsa cualquier tecla para lanzar los dados. Pulsa 0 para salir: ");
	    //cadena = teclado.nextLine();

		//Sacar los dados
		dado1 = ran.nextInt(6) + 1;
		dado2 = ran.nextInt(6) + 1;

		// Cárcel
		if(posicion==11 && esCarcel==true) {
			
			if(dado1==dado2 || carcelTurnos >= 3) {
				System.out.printf("\nSales de la Carcel. Los dados son %d y %d. Turnos de carcel: %d", dado1, dado2, carcelTurnos);
				posicion += (dado1 + dado2);
				carcelTurnos = 0;
				esCarcel=false;
			}else {
				System.out.printf("\nEsperas un turno. Los dados son %d y %d. Turnos de carcel: %d", dado1, dado2, carcelTurnos);
				carcelTurnos++;
			}
			
		// No está en la cárcel
		}else {
			
			//Comprobar dobles
			if(dado1 == dado2) {
				dobles++;
			} else {
				dobles = 0;
			}
			
			// Comprobacion
			if(dobles >= 3) {
				posicion = 11;
				esCarcel=true;
			    dobles = 0;
				System.out.printf("\nVas a la carcel por sacar por tres dobles --- %d - %d", dado1, dado2);
			}else {
				posicion += (dado1 + dado2);

				// Vuelta completa
				if(posicion>40) {
					posicion-=40;
					vuelta++;
					dinero+=200;
				}
			
			switch (posicion) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				//System.out.printf("\nCaja de la comunidad 01");
				break;
			case 4:
				
				break;
			case 5:
				//System.out.printf("\nPagas 200");
				dinero-=200;
				break;
			case 6:
				//System.out.printf("\nEstación 01");
				break;
			case 7:
				
				break;
			case 8:
				//System.out.printf("\nSuerte 01");
				break;
			case 9:
				
				break;
			case 10:
				
				break;
			case 11:
				//System.out.printf("\nVisitas la Carcel");
				break;
			case 12:
				
				break;
			case 13:
				//System.out.printf("\nServicio de electricidad");
				break;
			case 14:
				
				break;
			case 15:
				
				break;
			case 16:
				//System.out.printf("\nEstación 02");
				break;
			case 17:
				
				break;
			case 18:
				//System.out.printf("\nCaja de la comunidad 02");
				break;
			case 19:
				
				break;
			case 20:
				
				break;
			case 21:
				
				break;
			case 22:
				
				break;
			case 23:
				//System.out.printf("\nSuerte 02");
				break;
			case 24:
				
				break;
			case 25:
				
				break;
			case 26:
				//System.out.printf("\nEstación 03");
				break;
			case 27:
				
				break;
			case 28:
				
				break;
			case 29:
				//System.out.printf("\nServicio de aguas");
				break;
			case 30:
				
				break;
			case 31:
				posicion=11;
				vuelta++;
				esCarcel=true;
				System.out.printf("\nVas a la carcel por estar en la casilla de carcel (casilla 31)", dado1, dado2);
				break;
			case 32:
				
				break;
			case 33:
				
				break;
			case 34:
				//System.out.printf("\nCaja de la comunidad 03");
				break;
			case 35:
				
				break;
			case 36:
				//System.out.printf("\nEstación 04");
				break;
			case 37:
				//System.out.printf("\nSuerte 03");
				break;
			case 38:
				
				break;
			case 39:
				//System.out.printf("\nPagas 100");
				dinero-=100;
				break;
			case 40:
				
				break;
			default:
				System.out.printf("ERROR");
				break;
			}
			}
		
		dobles = 0;
		System.out.printf("\nDados %d - %d, Avanzas %d casillas. Posición actual: %d - Vuelta: %d, Dinero: %d", dado1, dado2, dado1+dado2,posicion,vuelta, dinero);
		}
	}
		teclado.close();
		System.out.print("\nFin de partida");
}
}	

