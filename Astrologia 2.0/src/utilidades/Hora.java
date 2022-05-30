package utilidades;

public class Hora {
	
	private Integer minute = 0, hour = 0;
	
	public Hora(Integer minute, Integer hour) {
		this.hour = hour;
		this.minute = minute;
	}
	
	public Integer getMinute() {
		return minute;
	}


	public Integer getHour() {
		return hour;
	}
	
	
	public Boolean isCorrect() {
		if(this.minute < 0 || this.minute>59 || this.hour<0 || this.hour>23) {
			return false;
		}else {
			return true;
		}
	}
	
	
	public String toString() {
        String formateo = String.format("%02d" , this.hour) + ":" + String.format("%02d" , this.minute);
		return formateo;
	}

}
