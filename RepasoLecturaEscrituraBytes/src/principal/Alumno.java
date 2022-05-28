package principal;

public class Alumno {

	private String nombre;
	private int edad;
	private double nota;
	
	public Alumno(String nombre, int edad, double nota) {
		this.nombre=nombre;
		this.edad=edad;
		this.nota=nota;
	}

	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", nota=" + nota + "]";
	}
	
	
}