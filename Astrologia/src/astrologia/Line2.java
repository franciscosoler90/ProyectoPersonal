package astrologia;

public class Line2 {

	private int GradoSol = 0;
	private int GradoLuna = 0;
	private int GradoMercurio = 0;
	private int GradoVenus = 0;
	private int GradoMarte = 0;
	private int GradoJupiter = 0;
	private int GradoSaturno = 0;		
	
	private int MinutoSol = 0;
	private int MinutoLuna = 0;
	private int MinutoMercurio = 0;
	private int MinutoVenus = 0;
	private int MinutoMarte = 0;
	private int MinutoJupiter = 0;
	private int MinutoSaturno = 0;	
	
	private int year = 0;
	private int month = 0;
	private int day = 0;
    private int hour = 0;
	private int minute = 0;
	
	private String name = "";	

	private String signoSol = "";
	private String signoLuna = "";
	private String signoMercurio = "";
	private String signoVenus = "";
	private String signoMarte = "";
	private String signoJupiter = "";
	private String signoSaturno = "";
	
    public String getName() {
		return name;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}
	
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getGradoSol() {
		return GradoSol;
	}

	public int getGradoLuna() {
		return GradoLuna;
	}

	public int getGradoMercurio() {
		return GradoMercurio;
	}

	public int getGradoVenus() {
		return GradoVenus;
	}

	public int getGradoMarte() {
		return GradoMarte;
	}

	public int getGradoJupiter() {
		return GradoJupiter;
	}

	public int getGradoSaturno() {
		return GradoSaturno;
	}
	
	public int getMinutoSol() {
		return MinutoSol;
	}

	public int getMinutoLuna() {
		return MinutoLuna;
	}

	public int getMinutoMercurio() {
		return MinutoMercurio;
	}

	public int getMinutoVenus() {
		return MinutoVenus;
	}

	public int getMinutoMarte() {
		return MinutoMarte;
	}

	public int getMinutoJupiter() {
		return MinutoJupiter;
	}

	public int getMinutoSaturno() {
		return MinutoSaturno;
	}	

	public String getSignoSol() {
		return signoSol;
	}

	public String getSignoLuna() {
		return signoLuna;
	}

	public String getSignoMercurio() {
		return signoMercurio;
	}

	public String getSignoVenus() {
		return signoVenus;
	}

	public String getSignoMarte() {
		return signoMarte;
	}

	public String getSignoJupiter() {
		return signoJupiter;
	}

	public String getSignoSaturno() {
		return signoSaturno;
	}	
	
	public String getAllInfo() {
		return 	String.valueOf( this.year ) + ";" + 
				String.valueOf( this.month ) + ";" + 
				String.valueOf( this.day ) + ";" + 
				String.valueOf( this.hour ) + ";" + 
				String.valueOf( this.minute ) + ";" + 
				name + ";" + 
				String.valueOf( this.GradoSol ) + ";" + 
				String.valueOf( this.MinutoSol ) + ";" + 
				String.valueOf( this.GradoLuna ) + ";" + 
				String.valueOf( this.MinutoLuna ) + ";" + 
				String.valueOf( this.GradoMercurio ) + ";" + 
				String.valueOf( this.MinutoMercurio ) + ";" + 
				String.valueOf( this.GradoVenus ) + ";" + 
				String.valueOf( this.MinutoVenus ) + ";" + 
				String.valueOf( this.GradoMarte ) + ";" + 
				String.valueOf( this.MinutoMarte ) + ";" + 
				String.valueOf( this.GradoJupiter ) + ";" + 
				String.valueOf( this.MinutoJupiter ) + ";" + 
				String.valueOf( this.GradoSaturno ) + ";" + 
				String.valueOf( this.MinutoSaturno ) + ";" + 
				String.valueOf( this.signoSol ) + ";" + 
				String.valueOf( this.signoLuna ) + ";" + 
				String.valueOf( this.signoMercurio ) + ";" + 
				String.valueOf( this.signoVenus ) + ";" + 
				String.valueOf( this.signoMarte ) + ";" + 
				String.valueOf( this.signoJupiter ) + ";" + 
				String.valueOf( this.signoSaturno );	
	}
	
    Line2(int year, int month, int day, int hour, int minute, String name, int GradoSol, int MinutoSol, int GradoLuna, int MinutoLuna, int GradoMercurio, int MinutoMercurio, int GradoVenus, int MinutoVenus, int GradoMarte, int MinutoMarte, int GradoJupiter, int MinutoJupiter, int GradoSaturno, int MinutoSaturno, String signoSol, String signoLuna, String signoMercurio, String signoVenus, String signoMarte, String signoJupiter, String signoSaturno)
    {
    	this.year = year;
    	this.month = month;
    	this.day = day;
    	this.hour = hour;
    	this.minute = minute;
    	
    	this.name = name;
    	
    	this.GradoSol = GradoSol;
    	this.GradoLuna = GradoLuna;
    	this.GradoMercurio = GradoMercurio;
    	this.GradoVenus = GradoVenus;
    	this.GradoMarte = GradoMarte;
    	this.GradoJupiter = GradoJupiter;
    	this.GradoSaturno = GradoSaturno;	
    	
    	this.MinutoSol = MinutoSol;
    	this.MinutoLuna = MinutoLuna;
    	this.MinutoMercurio = MinutoMercurio;
    	this.MinutoVenus = MinutoVenus;
    	this.MinutoMarte = MinutoMarte;
    	this.MinutoJupiter = MinutoJupiter;
    	this.MinutoSaturno = MinutoSaturno;	
    	
    	this.signoSol = signoSol;
    	this.signoLuna = signoLuna;
    	this.signoMercurio = signoMercurio;
    	this.signoVenus = signoVenus;
    	this.signoMarte = signoMarte;
    	this.signoJupiter = signoJupiter;
    	this.signoSaturno = signoSaturno;
    }	
	
	

}
