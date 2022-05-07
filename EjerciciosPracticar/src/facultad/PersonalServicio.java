package facultad;

public class PersonalServicio extends Empleado{
	
	private String seccion;
	
	PersonalServicio(String nombre, String apellidos, String estado, int id, int anio_inc, int num_despacho, String seccion){
		super(nombre, apellidos, estado, id, anio_inc, num_despacho);
		this.seccion = seccion;
	}
	
	public void cambioSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String personalServicioInfo() {
		return "Personal de Servicio: " + mostrarPersonaInfo() + mostrarEmpleadoInfo() + "\nSección: "+ seccion;
	}
	

}