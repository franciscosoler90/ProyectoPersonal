package utilidades;

public class Fecha {
	
	private Integer day = 1, month = 1, year = 2022;

	public Fecha(Integer day, Integer month, Integer year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	public Boolean isCorrect() {
		
		
		if(this.day <= 0 || this.day>=32 || this.month <=0 || this.month>=13 || this.year <=1900 || this.year >=2100) {
			
			return false;
			
		}else {
			
			switch(this.month) {
			
			case(1):
				
				if(this.day>=32) {
					return false;
				}else {
					return true;
				}
			
			case (2):
				
				if ((this.year % 4 == 0) && ((this.year % 100 != 0) || (this.year % 400 == 0))) {
					
					// Año bisiesto
					if(this.day>=30) {
						return false;
					}else {
						return true;
					}
					
				}else {
					
					// Año no es bisiesto
					if(this.day>=29) {
						return false;
					}else {
						return true;
					}
				}
			
			case(3):
				
				if(this.day>=32) {
					return false;
				}else {
					return true;
				}
			
			case (4):
				
				if(this.day>=31) {
					return false;
				}else {
					return true;
				}
							
			case (5):
				
				if(this.day>=32) {
					return false;
				}else {
					return true;
				}
							
			case (6):
				
				if(this.day>=31) {
					return false;
				}else {
					return true;
				}
			
			case (7):
				
				if(this.day>=32) {
					return false;
				}else {
					return true;
				}
			
			case (8):
				
				if(this.day>=32) {
					return false;
				}else {
					return true;
				}
					
			case (9):
				
				if(this.day>=31) {
					return false;
				}else {
					return true;
				}
			
			case (10):
				
				if(this.day>=32) {
					return false;
				}else {
					return true;
				}
		
			case (11):
				
				if(this.day>=31) {
					return false;
				}else {
					return true;
				}
			
			case (12):
				
				if(this.day>=32) {
					return false;
				}else {
					return true;
				}

			}
	
		}
		return false;
	}
	
	
	public String toString() {
        String formateo = String.format("%02d" , this.day) + "/" + String.format("%02d" , this.month) + "/" + String.format("%04d" , this.year);
		return formateo;
	}
	
	
}
