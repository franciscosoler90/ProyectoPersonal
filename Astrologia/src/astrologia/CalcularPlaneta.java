package astrologia;

public class CalcularPlaneta {
	
	public static String nombre(int planeta) {
		
		switch (planeta) 
	    {
	        case 0:
			return "Ascendente";
	        case 1:  
			return "Sol";
	        case 2:  
			return "Luna";
	        case 3:  
			return "Mercurio";
	        case 4:  
			return "Venus";
	        case 5:  
			return "Marte";
	        case 6:  
			return "Júpiter";
	        case 7:  
			return "Saturno";
	        default: 
			return "Inválido";
		}
	}
}