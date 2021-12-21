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
	Line1(String[] lineasArray, int hour, int minute, String name)
	{
		this.lineas = lineasArray;
		this.hour = hour;
		this.minute = minute;
		this.name = name;
	}
}