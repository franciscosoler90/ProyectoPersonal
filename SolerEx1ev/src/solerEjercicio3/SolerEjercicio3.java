package solerEjercicio3;

import java.util.Scanner;

public class SolerEjercicio3 {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		
		int dia1 = 0;
		int mes1 = 0;
		int ano1 = 0;
		
		int dia2 = 0;
		int mes2 = 0;
		int ano2 = 0;
		
			do {
			
				System.out.print("\nDame la primera fecha:");
			
				System.out.print("\nDia:");
				dia1 = teclado.nextInt();
			
				System.out.print("\nMes:");
				mes1 = teclado.nextInt();	
	
				System.out.print("\nAño:");
				ano1 = teclado.nextInt();		
				
				if( !validarFecha(dia1,mes1,ano1) ){
					System.out.print("\nFecha incorrecta");
				}
		
			}while( !validarFecha(dia1,mes1,ano1) );
			
			do {
			
				System.out.print("\nDame la segunda fecha:");
			
				System.out.print("\nDia:");
				dia2 = teclado.nextInt();
	
				System.out.print("\nMes:");
				mes2 = teclado.nextInt();	
				
				System.out.print("\nAño:");
				ano2 = teclado.nextInt();	
				
				if( !validarFecha(dia2,mes2,ano2) ){
					System.out.print("\nFecha incorrecta");
				}
			
			}while( !validarFecha(dia2,mes2,ano2) );

			teclado.close();
			
			
			System.out.printf("\nDesde la fecha: %d/%d/%d a la fecha: %d/%d/%d han pasado %d días.", dia1,mes1,ano1,dia2,mes2,ano2, 	restarFechas(dia1,mes1,ano1,dia2,mes2,ano2));
			

		
}
		
		
		
	
	
	
	public static Boolean validarFecha(int dia, int mes, int ano){
		
		//Comprueba si el año y el mes son correctos
		if( (ano>1973 && ano<2022) && (mes>0 && mes<13) ) {
			
				switch(mes) {
					
					//Enero
					case 1:
							if(dia>0 && dia<=31) {
								return true;
							}else {
								return false;
							}
					//Febrero, comprobar si es bisiesto
					case 2:
							//Comprueba si el año es bisiesto
							if(ano%4 == 0 && ano% 100 != 0 || ano%400 == 0) {
								//Es bisiesto
								if(dia>0 && dia<=29) {
									return true;
								}else {
									return false;
								}
							}else {
								if(dia>0 && dia<=28) {
									return true;
								}else {
									return false;
								}
							}
					//Marzo
					case 3:
						if(dia>0 && dia<=31) {
							return true;
						}else {
							return false;
						}
					//Abril
					case 4:
						if(dia>0 && dia<=30) {
							return true;
						}else {
							return false;
						}
					//Mayo
					case 5:
						if(dia>0 && dia<=31) {
							return true;
						}else {
							return false;
						}
					//Junio
					case 6:
						if(dia>0 && dia<=31) {
							return true;
						}else {
							return false;
						}
					//Julio
					case 7:
						if(dia>0 && dia<=31) {
							return true;
						}else {
							return false;
						}
					//Agosto
					case 8:
						if(dia>0 && dia<=31) {
							return true;
						}else {
							return false;
						}			
					//Septiembre
					case 9:
						if(dia>0 && dia<=30) {
							return true;
						}else {
							return false;
						}	
					//Octubre
					case 10:
						if(dia>0 && dia<=31) {
							return true;
						}else {
							return false;
						}	
					//Noviembre
					case 11:
						if(dia>0 && dia<=30) {
							return true;
						}else {
							return false;
						}	
					//Diciembre
					case 12:
						if(dia>0 && dia<=31) {
							return true;
						}else {
							return false;
						}
				}
			
			}else {
				return false;
			}
			return null;

	}		
	
	
	public static Integer restarFechas(int dia1, int mes1, int ano1, int dia2, int mes2, int ano2){
		
		int suma1 = 0;
		int suma2 = 0;

		
		//Comprueba los dias de la primera fecha
		//----------------------------------------------------------------------------

		for(int i=1974; i<ano1-1; i++) {
		
			if(i%4 == 0 && i% 100 != 0 || i%400 == 0) {
				suma1 += 366;
			}else {
				suma1 += 365;
			}
		}

		for(int i=1; i<mes1; i++) {
			
			switch(i) {
				//Enero
				case 1:
					suma1+=31;
					break;
				//Febrero, comprobar si es bisiesto
				case 2:
						//Comprueba si el año es bisiesto
						if(ano1%4 == 0 && ano1% 100 != 0 || ano1%400 == 0) {
							//Es bisiesto
							suma1+=29;
							break;
						}else {
							suma1+=28;
							break;
						}
				//Marzo
				case 3:
					suma1+=31;
					break;
				case 4:
				//Abril
					suma1+=30;
					break;
				//Mayo
				case 5:
					suma1+=31;
					break;
				//Junio
				case 6:
					suma1+=30;
					break;
				//Julio
				case 7:
					suma1+=31;
					break;
				//Agosto
				case 8:
					suma1+=31;	
					break;
				//Septiembre
				case 9:
					suma1+=30;
					break;
				//Octubre
				case 10:
					suma1+=31;
					break;
				//Noviembre
				case 11:
					suma1+=30;
					break;
				//Diciembre
				case 12:
					suma1+=31;
					break;
			}
			
		}		
		
		suma1+=dia1;
		
		//Comprueba los dias de la segunda fecha
		//----------------------------------------------------------------------------

		for(int i=1974; i<ano2-1; i++) {
		
			if(i%4 == 0 && i% 100 != 0 || i%400 == 0) {
				suma2 += 366;
			}else {
				suma2 += 365;
			}
		}
		
		for(int i=1; i<mes2; i++) {
			
			switch(i) {
				//Enero
				case 1:
					suma2+=31;
					break;
				//Febrero, comprobar si es bisiesto
				case 2:
						//Comprueba si el año es bisiesto
						if(ano2%4 == 0 && ano2% 100 != 0 || ano2%400 == 0) {
							//Es bisiesto
							suma2+=29;
							break;
						}else {
							suma2+=28;
							break;
						}
				//Marzo
				case 3:
					suma2+=31;
					break;
				case 4:
				//Abril
					suma2+=30;
					break;
				//Mayo
				case 5:
					suma2+=31;
					break;
				//Junio
				case 6:
					suma2+=30;
					break;
				//Julio
				case 7:
					suma2+=31;
					break;
				//Agosto
				case 8:
					suma2+=31;	
					break;
				//Septiembre
				case 9:
					suma2+=30;
					break;
				//Octubre
				case 10:
					suma2+=31;
					break;
				//Noviembre
				case 11:
					suma2+=30;
					break;
				//Diciembre
				case 12:
					suma2+=31;
					break;
			}
			
		}		
		
		suma2+=dia2;
		
		
		System.out.printf("\n%d",suma1);
		System.out.printf("\n%d",suma2);

		//----------------------------------------------------------------------------
		
		if(suma1>=suma2) {
			
			return suma1-suma2;
			
		}else {
			
			return suma2-suma1;
			
		}

	}		
	

}
