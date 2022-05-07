package unidad6_abstraccion;

public class Digimon{
	
	private String name;
	private Level level;
	
	public Digimon(String name, Level level) {
		this.name = name;
		this.level = level;
	}
	
	
	public String nombre() {
		return "El nombre de este Digimon es: "+ this.name + ". Es de nivel "+ this.level;
	}
	
	
}	