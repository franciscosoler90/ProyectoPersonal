package utilidades;

public class Signo {
	

	public String toString(String cadena) {
		
		if(cadena!=null && cadena.length()>0) {
			
			cadena = cadena.toLowerCase();
			char caracter = cadena.charAt(0);

			switch(caracter) {
			
			case('a'):
				return "Aries";
			case('b'):
				return "Tauro";
			case('c'):
				return "Géminis";
			case('d'):
				return "Cáncer";
			case('e'):
				return "Leo";
			case('f'):
				return "Virgo";
			case('g'):
				return "Libra";
			case('h'):
				return "Escorpio";
			case('i'):
				return "Sagitario";
			case('j'):
				return "Capricornio";
			case('k'):
				return "Acuario";
			case('l'):
				return "Piscis";
			}
			return "No válido";
		}else {
			return "No válido";
		}
	}
}