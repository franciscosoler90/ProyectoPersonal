package astrologia;

public class CalcularCartas {
	
	public static Line2[] leer( Line1[] lineas ) {
		
	String values[] = null;
	Line2 cartas[] = new Line2[2];	
	
	int gradoSol = 0;
	int minutoSol = 0;
	int gradoSol2 = 0;
	int minutoSol2 = 0;	
	
	int gradoLuna = 0;
	int minutoLuna = 0;
	int gradoLuna2 = 0;
	int minutoLuna2 = 0;
	
	int gradoMercurio = 0;
	int minutoMercurio = 0;
	int gradoMercurio2 = 0;
	int minutoMercurio2 = 0;
	
	int gradoVenus = 0;
	int minutoVenus = 0;
	int gradoVenus2 = 0;
	int minutoVenus2 = 0;
	
	int gradoMarte = 0;
	int minutoMarte = 0;
	int gradoMarte2 = 0;
	int minutoMarte2 = 0;
	
	int gradoJupiter = 0;
	int minutoJupiter = 0;
	int gradoJupiter2 = 0;
	int minutoJupiter2 = 0;
	
	int gradoSaturno = 0;
	int minutoSaturno = 0;
	int gradoSaturno2 = 0;
	int minutoSaturno2 = 0;

	String[] lineas2 = null;
	
	String signoSol = "";
	String signoSol2 = "";
	
	String signoLuna = "";
	String signoLuna2 = "";
	
	String signoMercurio = "";
	String signoMercurio2 = "";
	
	String signoVenus = "";
	String signoVenus2 = "";
	
	String signoMarte = "";
	String signoMarte2 = "";
	
	String signoJupiter = "";
	String signoJupiter2 = "";
	
	String signoSaturno = "";
	String signoSaturno2 = "";
	
	int year = 0;
	int month = 0;
	int day = 0;

	//------------------------------------------------------------------------------

	for(int i = 0; i < 2; i++) {
		
		lineas2 = lineas[i].getLineasArray();
		year = Integer.parseInt(lineas2[0].toString().split(",")[4]);
		month = Integer.parseInt(lineas2[0].toString().split(",")[3]);
		day = Integer.parseInt(lineas2[0].toString().split(",")[2]);

		for(int j = 0; j < 2; j++) {
			
			values = lineas2[j].toString().split(",");
			
			switch(j) {
				case 0:
					gradoSol = Integer.parseInt(values[9]);
					minutoSol = Integer.parseInt(values[10]);
					signoSol = values[12];
					
					gradoLuna = Integer.parseInt(values[13]);
					minutoLuna = Integer.parseInt(values[14]);
					signoLuna = values[15];
					
					gradoMercurio = Integer.parseInt(values[16]);
					minutoMercurio = Integer.parseInt(values[17]);
					signoMercurio = values[18];
					
					gradoVenus = Integer.parseInt(values[20]);
					minutoVenus = Integer.parseInt(values[21]);
					signoVenus = values[22];
					
					gradoMarte = Integer.parseInt(values[24]);
					minutoMarte = Integer.parseInt(values[25]);
					signoMarte = values[26];
					
					gradoJupiter = Integer.parseInt(values[28]);
					minutoJupiter = Integer.parseInt(values[29]);
					signoJupiter = values[30];
					
					gradoSaturno = Integer.parseInt(values[32]);
					minutoSaturno = Integer.parseInt(values[33]);
					signoSaturno = values[34];
					
					break;
				case 1:
					gradoSol2 = Integer.parseInt(values[9]);
					minutoSol2 = Integer.parseInt(values[10]);
					signoSol2 = values[12];
					
					gradoLuna2 = Integer.parseInt(values[13]);
					minutoLuna2 = Integer.parseInt(values[14]);
					signoLuna2 = values[15];
					
					gradoMercurio2 = Integer.parseInt(values[16]);
					minutoMercurio2 = Integer.parseInt(values[17]);
					signoMercurio2 = values[18];
					
					gradoVenus2 = Integer.parseInt(values[20]);
					minutoVenus2 = Integer.parseInt(values[21]);
					signoVenus2 = values[22];
					
					gradoMarte2 = Integer.parseInt(values[24]);
					minutoMarte2 = Integer.parseInt(values[25]);
					signoMarte2 = values[26];
					
					gradoJupiter2 = Integer.parseInt(values[28]);
					minutoJupiter2 = Integer.parseInt(values[29]);
					signoJupiter2 = values[30];
					
					gradoSaturno2 = Integer.parseInt(values[32]);
					minutoSaturno2 = Integer.parseInt(values[33]);
					signoSaturno2 = values[34];
					
					break;
				default:
					System.out.print("\nInvalido\n");
					break;
			}

		}	
		//------------------------------------------------------------------------------
 
        GradoMinutoSigno Sol = CalcularGrados.calcularMedia(gradoSol, minutoSol, gradoSol2, minutoSol2, lineas[i].getHour(), signoSol, signoSol2);
		GradoMinutoSigno Luna = CalcularGrados.calcularMedia(gradoLuna, minutoLuna, gradoLuna2, minutoLuna2, lineas[i].getHour(), signoLuna, signoLuna2);   
		GradoMinutoSigno Mercurio = CalcularGrados.calcularMedia(gradoMercurio, minutoMercurio, gradoMercurio2, minutoMercurio2, lineas[i].getHour(), signoMercurio, signoMercurio2);  
		GradoMinutoSigno Venus = CalcularGrados.calcularMedia(gradoVenus, minutoVenus, gradoVenus2, minutoVenus2, lineas[i].getHour(), signoVenus, signoVenus2);    
		GradoMinutoSigno Marte = CalcularGrados.calcularMedia(gradoMarte, minutoMarte, gradoMarte2, minutoMarte2, lineas[i].getHour(), signoMarte, signoMarte2);  
		GradoMinutoSigno Jupiter = CalcularGrados.calcularMedia(gradoJupiter, minutoJupiter, gradoJupiter2, minutoJupiter2, lineas[i].getHour(), signoJupiter, signoJupiter2);  
		GradoMinutoSigno Saturno = CalcularGrados.calcularMedia(gradoSaturno, minutoSaturno, gradoSaturno2, minutoSaturno2, lineas[i].getHour(), signoSaturno, signoSaturno2);  

		//------------------------------------------------------------------------------

   
        cartas[i] = new Line2(day, month, year, lineas[i].getHour(), lineas[i].getMinute(), lineas[i].getName(), Sol.getGrado(), Sol.getMinuto(), Luna.getGrado(), Luna.getMinuto(), Mercurio.getGrado(), Mercurio.getMinuto(), Venus.getGrado(), Venus.getMinuto(), Marte.getGrado(), Marte.getMinuto(), Jupiter.getGrado(), Jupiter.getMinuto(), Saturno.getGrado(), Saturno.getMinuto(), Sol.getSigno(), Luna.getSigno(), Mercurio.getSigno(), Venus.getSigno(), Marte.getSigno(), Jupiter.getSigno(), Saturno.getSigno() );       

        
        Escribir.escribir(cartas[i]);
        
		}
	return cartas;
	}
}
