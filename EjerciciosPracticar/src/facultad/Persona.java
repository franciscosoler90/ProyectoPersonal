package facultad;

public class Persona {
	
	
	private String nombre, apellidos, estado;
	private int id;
	
	Persona(String nombre, String apellidos, String estado, int id){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.estado = estado;
		this.id = id;
	}
	
	
	
	public void cambioEstadoCivil(String estado){
		this.estado = estado;
	}
	
	
	public String mostrarPersonaInfo() {
		return "\nNombre: "+ nombre + "\nApellidos: "+ apellidos + "\nEstado civil: "+estado + "\nNúmero identificacion: " + id;
	}
	
	

}
