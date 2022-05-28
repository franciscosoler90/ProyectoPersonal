package astrologia;

public class Line1 {
	
	//ATRIBUTOS
	private String lineas[] = new String[2];
	private String name = "";	
	private int hour = 0;
	private int minute = 0;
	
	//GETTERS
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public String getName() {
		return name;
	}
	
	public String[] getLineasArray() {
		return lineas;
	}	
	
	//CONSTRUCTOR
	Line1(String[] lineas, int hour, int minute, String name)
	{
		this.lineas = lineas;
		this.hour = hour;
		this.minute = minute;
		this.name = name;
	}
	
	public String toString() {
		
		String lineasArray = "";
		
		for(int i = 0; i < lineas.length; i++) {
			
			lineasArray+= lineas[i] + "\n";
			
		}
		
		
		return "Nombre: " + name + " - " + "Hora: " + hour + ":" + minute + "\n" + lineasArray;
		}
	}