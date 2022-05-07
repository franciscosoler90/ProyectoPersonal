package unidad7_persona;


public class Persona {
	private String nombre;
	private int edad;
	private int altura;
	private static int contador=0;
	
	public Persona(){
		this.nombre="Anonimo";
	}
	public Persona(String nombre, int edad, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura=altura;
		contador++;
	}
	public static Integer getContador() {
		return contador;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public Integer getAtltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void setEdad(Integer unaEdad) {
		if (checkEdadOK(unaEdad)){
			edad = unaEdad;
		}else{
			edad=0;
		}
	}
	private Boolean checkEdadOK(Integer edad){
		Boolean resultado=false;
		if(edad>=0){
			resultado=true;
		}
		return resultado;
	}
	public String hablar(String frase){
		return "soy " + nombre + ": " + frase;
	}

}