package facultad;

public class Empleado extends Persona{
	
	private int anio_inc, num_despacho;
	
	Empleado(String nombre, String apellidos, String estado, int id, int anio_inc, int num_despacho){
		super(nombre,apellidos,estado,id);
		this.anio_inc = anio_inc;
		this.num_despacho = num_despacho;
	}
	
	
	public String mostrarEmpleadoInfo() {
		return "\nAño de incorporación: " + anio_inc + "\nNúmero de despacho: " + num_despacho;
	}
	
	
	public int getAnio_inc() {
		return anio_inc;
	}


	public int getNum_despacho() {
		return num_despacho;
	}

}
