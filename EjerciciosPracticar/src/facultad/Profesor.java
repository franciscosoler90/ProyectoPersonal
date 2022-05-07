package facultad;

public class Profesor extends Empleado {
	
	private String departamento;
	
	Profesor(String nombre, String apellidos, String estado, int id, int anio_inc, int num_despacho, String departamento){
		super(nombre, apellidos, estado, id, anio_inc, num_despacho);
		this.departamento = departamento;
	}
	
	
	public void cambioDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String profesorInfo() {
		return "Profesor: " + mostrarPersonaInfo() + mostrarEmpleadoInfo() + "\nDepartamento: "+ departamento;
	}

}