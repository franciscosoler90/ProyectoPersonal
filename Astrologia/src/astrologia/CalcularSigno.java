package astrologia;

public class CalcularSigno {
	
	private static String signosArray[] = {"Aries","Tauro","Géminis","Cáncer","Leo","Virgo","Libra","Escorpio","Sagitario","Capricornio","Acuario","Piscis"};
	private static String elementosArray[] = {"Fuego","Tierra","Aire","Agua"};
	private static String cualidadArray[] = {"Cardinal","Fijo","Mutable"};
	private static String planetasArray[] = {"Sol","Luna","Mercurio","Venus","Marte","Júpiter","Saturno"};

	private int terminoArray[] = new int[5];

	private String signo = "";
	private String elemento = "";	
	private String cualidad = "";
	private String regente = "";	
	private String exaltacion = "";	
	private String detrimento = "";
	private String caida = "";

	private String triplicidad[] = new String[2];
	private String termino[] = new String[5];
	private String decanato[] = new String[3];
	
	private int grado = 0;

	//GETTERS
	public String getRegente() {
		return regente;
	}
	
	public String getSigno() {
		return signo;
	}

	public String getElemento() {
		return elemento;
	}

	public String getCualidad() {
		return cualidad;
	}
	
	public String getExaltacion() {
		return exaltacion;
	}

	public String getDetrimento() {
		return detrimento;
	}

	public String getCaida() {
		return caida;
	}
	
	public int getGrado() {
		return grado;
	}
	
	public String[] getTriplicidad() {
		return triplicidad;
	}

	public String[] getTermino() {
		return termino;
	}

	public String[] getDecanato() {
		return decanato;
	}
	
	public int[] getTerminoArray() {
		return terminoArray;
	}
	
	//CONSTRUCTOR
	public CalcularSigno() {
		this.grado = 0;
		this.signo = "";
	}

	public CalcularSigno(String caracter) {
			super();
			switch (caracter.toLowerCase()) {
			
				// ARIES
		        case "a":  
			        this.signo = signosArray[0];
			        
			        this.elemento = elementosArray[0];	
			        
			        this.cualidad = cualidadArray[0];	
			        
			        this.regente = planetasArray[4];
			        
			        this.exaltacion = planetasArray[0];
			        
			        this.triplicidad[0] = planetasArray[0];
			        this.triplicidad[1] = planetasArray[5];
			        
			        this.termino[0] = planetasArray[5];
			        this.termino[1] = planetasArray[3];
			        this.termino[2] = planetasArray[2];
			        this.termino[3] = planetasArray[4];
			        this.termino[4] = planetasArray[6];
			        
			        this.terminoArray[0] = 6;
			        this.terminoArray[1] = 14;
			        this.terminoArray[2] = 21;
			        this.terminoArray[3] = 26;
			        this.terminoArray[4] = 30;
			        
			        this.decanato[0] = planetasArray[4];
			        this.decanato[1] = planetasArray[0];
			        this.decanato[2] = planetasArray[3];
			        
			        this.detrimento = planetasArray[3];
			        
			        this.caida = planetasArray[6];
			        
			        this.grado = 0;
			        
			        break;
			        
			    // TAURO
		        case "b":  
			        this.signo = signosArray[1];
			        
			        this.elemento = elementosArray[1];	
			        
			        this.cualidad = cualidadArray[1];	
			        
			        this.regente = planetasArray[3];
			        
			        this.exaltacion = planetasArray[1];
			        
			        this.triplicidad[0] = planetasArray[4];
			        this.triplicidad[1] = planetasArray[1];
			        
			        this.termino[0] = planetasArray[4];
			        this.termino[1] = planetasArray[2];
			        this.termino[2] = planetasArray[5];
			        this.termino[3] = planetasArray[6];
			        this.termino[4] = planetasArray[3];
			        
			        this.terminoArray[0] = 8;
			        this.terminoArray[1] = 15;
			        this.terminoArray[2] = 22;
			        this.terminoArray[3] = 26;
			        this.terminoArray[4] = 30;
			        
			        this.decanato[0] = planetasArray[2];
			        this.decanato[1] = planetasArray[1];
			        this.decanato[2] = planetasArray[6];
			        
			        this.detrimento = planetasArray[4];
			        
			        this.grado = 30;
			        
			        break;
			        
			    // GÉMINIS
		        case "c":  
		        	
			        this.signo = signosArray[2];
			        
			        this.elemento = elementosArray[2];	
			        
			        this.cualidad = cualidadArray[2];	
			        
			        this.regente = planetasArray[2];
			        
			        this.triplicidad[0] = planetasArray[6];
			        this.triplicidad[1] = planetasArray[2];
			        
			        this.termino[0] = planetasArray[2];
			        this.termino[1] = planetasArray[5];
			        this.termino[2] = planetasArray[3];
			        this.termino[3] = planetasArray[6];
			        this.termino[4] = planetasArray[4];
			        
			        this.terminoArray[0] = 7;
			        this.terminoArray[1] = 13;
			        this.terminoArray[2] = 21;
			        this.terminoArray[3] = 25;
			        this.terminoArray[4] = 30;
			        
			        this.decanato[0] = planetasArray[5];
			        this.decanato[1] = planetasArray[4];
			        this.decanato[2] = planetasArray[0];
			        
			        this.detrimento = planetasArray[5];
			        
			        this.grado = 60;
			        
			        break;
			        
			    // CÁNCER
		        case "d":  
		        	
			        this.signo = signosArray[3];
			        
			        this.elemento = elementosArray[3];		
			        
			        this.cualidad = cualidadArray[0];	
			        
			        this.regente = planetasArray[1];
			        
			        this.triplicidad[0] = planetasArray[4];
			        this.triplicidad[1] = planetasArray[4];
			        
			        this.termino[0] = planetasArray[4];
			        this.termino[1] = planetasArray[5];
			        this.termino[2] = planetasArray[2];
			        this.termino[3] = planetasArray[3];
			        this.termino[4] = planetasArray[6];
			        
			        this.terminoArray[0] = 6;
			        this.terminoArray[1] = 13;
			        this.terminoArray[2] = 20;
			        this.terminoArray[3] = 27;
			        this.terminoArray[4] = 30;
			        
			        this.decanato[0] = planetasArray[4];
			        this.decanato[1] = planetasArray[2];
			        this.decanato[2] = planetasArray[1];
			        
			        this.exaltacion = planetasArray[5];
			        
			        this.detrimento = planetasArray[6];
			        
			        this.caida = planetasArray[4];
			        
			        this.grado = 90;
			        
			        break;
			        
				// LEO			        
		        case "e":  
		        	
			        this.signo = signosArray[4];
			        
			        this.elemento = elementosArray[0];	
			        
			        this.cualidad = cualidadArray[1];	
			        
			        this.regente = planetasArray[0];
			        
			        this.triplicidad[0] = planetasArray[0];
			        this.triplicidad[1] = planetasArray[5];
			        
			        this.termino[0] = planetasArray[6];
			        this.termino[1] = planetasArray[2];
			        this.termino[2] = planetasArray[3];
			        this.termino[3] = planetasArray[5];
			        this.termino[4] = planetasArray[4];
			        
			        this.terminoArray[0] = 6;
			        this.terminoArray[1] = 13;
			        this.terminoArray[2] = 19;
			        this.terminoArray[3] = 25;
			        this.terminoArray[4] = 30;
			        
			        this.decanato[0] = planetasArray[6];
			        this.decanato[1] = planetasArray[5];
			        this.decanato[2] = planetasArray[4];
			        
			        this.detrimento = planetasArray[6];
			        
			        this.grado = 120;
			        
			        break;

				// VIRGO		        
		        case "f":  
		        	
			        this.signo = signosArray[5];
			        
			        this.elemento = elementosArray[1];	
			        
			        this.cualidad = cualidadArray[2];	
			        
			        this.regente = planetasArray[2];
			        
			        this.exaltacion = planetasArray[2];
			        
			        this.triplicidad[0] = planetasArray[3];
			        this.triplicidad[1] = planetasArray[1];
			        
			        this.termino[0] = planetasArray[5];
			        this.termino[1] = planetasArray[3];
			        this.termino[2] = planetasArray[2];
			        this.termino[3] = planetasArray[4];
			        this.termino[4] = planetasArray[6];
			        
			        this.terminoArray[0] = 7;
			        this.terminoArray[1] = 13;
			        this.terminoArray[2] = 18;
			        this.terminoArray[3] = 24;
			        this.terminoArray[4] = 30;
			        
			        this.decanato[0] = planetasArray[0];
			        this.decanato[1] = planetasArray[3];
			        this.decanato[2] = planetasArray[2];
			        
			        this.detrimento = planetasArray[5];
			        
			        this.caida = planetasArray[3];
			        
			        this.grado = 150;
			        
			        break;

				// LIBRA		        
		        case "g":  
		        	
			        this.signo = signosArray[6];
			        
			        this.elemento = elementosArray[2];	
			        
			        this.cualidad = cualidadArray[0];	
			        
			        this.regente = planetasArray[3];
			        
			        this.triplicidad[0] = planetasArray[6];
			        this.triplicidad[1] = planetasArray[2];
			        
			        this.termino[0] = planetasArray[6];
			        this.termino[1] = planetasArray[4];
			        this.termino[2] = planetasArray[5];
			        this.termino[3] = planetasArray[2];
			        this.termino[4] = planetasArray[4];
			        
			        this.terminoArray[0] = 6;
			        this.terminoArray[1] = 11;
			        this.terminoArray[2] = 19;
			        this.terminoArray[3] = 24;
			        this.terminoArray[4] = 30;
			        
			        this.decanato[0] = planetasArray[1];
			        this.decanato[1] = planetasArray[6];
			        this.decanato[2] = planetasArray[5];
			        
			        this.exaltacion = planetasArray[6];
			        
			        this.detrimento = planetasArray[4];
			        
			        this.caida = planetasArray[0];
			        
			        this.grado = 180;
			        
			        break;

				// ESCORPIO			        
		        case "h": 
		        	
			        this.signo = signosArray[7];
			        
			        this.elemento = elementosArray[3];		
			        
			        this.cualidad = cualidadArray[1];	
			        
			        this.regente = planetasArray[4];
			        
			        this.triplicidad[0] = planetasArray[4];
			        this.triplicidad[1] = planetasArray[4];
			        
			        this.termino[0] = planetasArray[4];
			        this.termino[1] = planetasArray[5];
			        this.termino[2] = planetasArray[3];
			        this.termino[3] = planetasArray[2];
			        this.termino[4] = planetasArray[6];
			        
			        this.terminoArray[0] = 6;
			        this.terminoArray[1] = 14;
			        this.terminoArray[2] = 21;
			        this.terminoArray[3] = 27;
			        this.terminoArray[4] = 30;
			        
			        this.decanato[0] = planetasArray[4];
			        this.decanato[1] = planetasArray[0];
			        this.decanato[2] = planetasArray[3];
			        
			        this.detrimento = planetasArray[3];
			        
			        this.caida = planetasArray[1];
			        
			        this.grado = 210;
			        
			        break;

				// SAGITARIO		        
		        case "i":  
		        	
			        this.signo = signosArray[8];
			        
			        this.elemento = elementosArray[0];	
			        
			        this.cualidad = cualidadArray[2];	
			        
			        this.triplicidad[0] = planetasArray[0];
			        this.triplicidad[1] = planetasArray[5];
			        
			        this.termino[0] = planetasArray[5];
			        this.termino[1] = planetasArray[3];
			        this.termino[2] = planetasArray[2];
			        this.termino[3] = planetasArray[6];
			        this.termino[4] = planetasArray[4];
			        
			        this.terminoArray[0] = 8;
			        this.terminoArray[1] = 14;
			        this.terminoArray[2] = 19;
			        this.terminoArray[3] = 25;
			        this.terminoArray[4] = 30;
			        
			        this.decanato[0] = planetasArray[2];
			        this.decanato[1] = planetasArray[1];
			        this.decanato[2] = planetasArray[6];
			        
			        this.regente = planetasArray[5];
			        
			        this.detrimento = planetasArray[2];
			        
			        this.grado = 240;
			        
			        break;

				// CAPRICORNIO		        
		        case "j":  
		        	
			        this.signo = signosArray[9];
			        
			        this.elemento = elementosArray[1];	
			        
			        this.cualidad = cualidadArray[0];	
			        
			        this.regente = planetasArray[6];
			        
			        this.triplicidad[0] = planetasArray[2];
			        this.triplicidad[1] = planetasArray[1];
			        
			        this.termino[0] = planetasArray[3];
			        this.termino[1] = planetasArray[2];
			        this.termino[2] = planetasArray[5];
			        this.termino[3] = planetasArray[3];
			        this.termino[4] = planetasArray[6];
			        
			        this.terminoArray[0] = 6;
			        this.terminoArray[1] = 12;
			        this.terminoArray[2] = 19;
			        this.terminoArray[3] = 25;
			        this.terminoArray[4] = 30;
			        
			        this.decanato[0] = planetasArray[5];
			        this.decanato[1] = planetasArray[3];
			        this.decanato[2] = planetasArray[0];
			        
			        this.exaltacion = planetasArray[4];
			        
			        this.detrimento = planetasArray[1];
			        
			        this.caida = planetasArray[5];
			        
			        this.grado = 270;
			        
			        break;

				// ACUARIO			        
		        case "k":  
		        	
			        this.signo = signosArray[10];
			        
			        this.elemento = elementosArray[2];	
			        
			        this.cualidad = cualidadArray[1];
			        
			        this.triplicidad[0] = planetasArray[6];
			        this.triplicidad[1] = planetasArray[2];
			        
			        this.termino[0] = planetasArray[6];
			        this.termino[1] = planetasArray[2];
			        this.termino[2] = planetasArray[3];
			        this.termino[3] = planetasArray[5];
			        this.termino[4] = planetasArray[4];
			        
			        this.terminoArray[0] = 6;
			        this.terminoArray[1] = 12;
			        this.terminoArray[2] = 20;
			        this.terminoArray[3] = 25;
			        this.terminoArray[4] = 30;
			        
			        this.decanato[0] = planetasArray[3];
			        this.decanato[1] = planetasArray[2];
			        this.decanato[2] = planetasArray[1];
			        
			        this.regente = planetasArray[6];
			        
			        this.detrimento = planetasArray[0];
			        
			        this.grado = 300;
			        
			        break;

				// PISCIS		        
		        case "l":  
		        	
			        this.signo = signosArray[11];
			        
			        this.elemento = elementosArray[3];	
			        
			        this.cualidad = cualidadArray[2];	
			        
			        this.triplicidad[0] = planetasArray[4];
			        this.triplicidad[1] = planetasArray[4];
			        
			        this.termino[0] = planetasArray[3];
			        this.termino[1] = planetasArray[5];
			        this.termino[2] = planetasArray[2];
			        this.termino[3] = planetasArray[3];
			        this.termino[4] = planetasArray[6];
			        
			        this.terminoArray[0] = 8;
			        this.terminoArray[1] = 14;
			        this.terminoArray[2] = 20;
			        this.terminoArray[3] = 26;
			        this.terminoArray[4] = 30;
			        
			        this.decanato[0] = planetasArray[6];
			        this.decanato[1] = planetasArray[5];
			        this.decanato[2] = planetasArray[4];
			        
			        this.regente = planetasArray[5];
			        
			        this.exaltacion = planetasArray[3];
			        
			        this.detrimento = planetasArray[2];
			        
			        this.caida = planetasArray[2];
			        
			        this.grado = 330;
			        
			        break;
			        
		        default: 
		        	
			        this.signo = "Inválido";
			        
			        break;
		    }
	}
}