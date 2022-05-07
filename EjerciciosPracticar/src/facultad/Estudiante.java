package facultad;

public class Estudiante extends Persona{
	
	
	private String curso;
	
	Estudiante(String nombre, String apellidos, String estado, int id, String curso){
		super(nombre,apellidos,estado,id);
		this.curso = curso;
	}
	
	
	public void nuevaMatricula(String curso) {
		this.curso = curso;
	}
	
	
	public String estudianteInfo() {
		return "Estudiante: "+ mostrarPersonaInfo() + "\nCurso: "+curso;
	}

}