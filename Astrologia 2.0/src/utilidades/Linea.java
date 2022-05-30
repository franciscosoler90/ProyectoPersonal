package utilidades;

public class Linea {
	
	private String linea1 = null, linea2 = null;
	private Hora hora = null;

	public Linea (String linea1, String linea2, Hora hora) {
		this.linea1 = linea1;
		this.linea2 = linea2;
		this.hora = hora;
	}
	
	public String SunToString() {

		String texto1[] = linea1.split(","), signo1 = texto1[12];
		String texto2[] = linea2.split(","), signo2 = texto2[12];
		
		Integer grado1 = Integer.parseInt(texto1[9]) , minuto1 = Integer.parseInt(texto1[10]) ;
		Integer grado2 = Integer.parseInt(texto2[9]) , minuto2 = Integer.parseInt(texto2[10]) ;
				
		return "Sol en " + CalcularGrados.calcularMedia(grado1, minuto1, grado2, minuto2, signo1, signo2, this.hora);
	}
	
	public String MoonToString() {

		String texto1[] = linea1.split(","), signo1 = texto1[15];
		String texto2[] = linea2.split(","), signo2 = texto2[15];
		
		Integer grado1 = Integer.parseInt(texto1[13]) , minuto1 = Integer.parseInt(texto1[14]) ;
		Integer grado2 = Integer.parseInt(texto2[13]) , minuto2 = Integer.parseInt(texto2[14]) ;
				
		return "Luna en " + CalcularGrados.calcularMedia(grado1, minuto1, grado2, minuto2, signo1, signo2, this.hora);
	}
	
	public String MercuryToString() {

		String texto1[] = linea1.split(","), signo1 = texto1[18];
		String texto2[] = linea2.split(","), signo2 = texto2[18];
		
		Integer grado1 = Integer.parseInt(texto1[16]) , minuto1 = Integer.parseInt(texto1[17]) ;
		Integer grado2 = Integer.parseInt(texto2[16]) , minuto2 = Integer.parseInt(texto2[17]) ;
				
		return "Mercurio en " + CalcularGrados.calcularMedia(grado1, minuto1, grado2, minuto2, signo1, signo2, this.hora);
	}
	
	public String VenusToString() {

		String texto1[] = linea1.split(","), signo1 = texto1[22];
		String texto2[] = linea2.split(","), signo2 = texto2[22];
		
		Integer grado1 = Integer.parseInt(texto1[20]) , minuto1 = Integer.parseInt(texto1[21]) ;
		Integer grado2 = Integer.parseInt(texto2[20]) , minuto2 = Integer.parseInt(texto2[21]) ;
				
		return "Venus en " + CalcularGrados.calcularMedia(grado1, minuto1, grado2, minuto2, signo1, signo2, this.hora);
	}
	
	public String MarsToString() {

		String texto1[] = linea1.split(","), signo1 = texto1[26];
		String texto2[] = linea2.split(","), signo2 = texto2[26];
		
		Integer grado1 = Integer.parseInt(texto1[24]) , minuto1 = Integer.parseInt(texto1[25]) ;
		Integer grado2 = Integer.parseInt(texto2[24]) , minuto2 = Integer.parseInt(texto2[25]) ;
				
		return "Marte en " + CalcularGrados.calcularMedia(grado1, minuto1, grado2, minuto2, signo1, signo2, this.hora);
	}
	
	public String JupiterToString() {

		String texto1[] = linea1.split(","), signo1 = texto1[30];
		String texto2[] = linea2.split(","), signo2 = texto2[30];
		
		Integer grado1 = Integer.parseInt(texto1[28]) , minuto1 = Integer.parseInt(texto1[29]) ;
		Integer grado2 = Integer.parseInt(texto2[28]) , minuto2 = Integer.parseInt(texto2[29]) ;
				
		return "Júpiter en " + CalcularGrados.calcularMedia(grado1, minuto1, grado2, minuto2, signo1, signo2, this.hora);
	}
	
	public String SaturnToString() {

		String texto1[] = linea1.split(","), signo1 = texto1[34];
		String texto2[] = linea2.split(","), signo2 = texto2[34];
		
		Integer grado1 = Integer.parseInt(texto1[32]) , minuto1 = Integer.parseInt(texto1[33]) ;
		Integer grado2 = Integer.parseInt(texto2[32]) , minuto2 = Integer.parseInt(texto2[33]) ;
				
		return "Saturno en " + CalcularGrados.calcularMedia(grado1, minuto1, grado2, minuto2, signo1, signo2, this.hora);
	}

	

}