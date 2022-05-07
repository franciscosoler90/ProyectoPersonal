package facultad;

public class Principal {

	public static void main(String[] args) {

		Estudiante estudiante1 = new Estudiante("Fran","Soler","Soltero",1,"Bases de datos");
		
		estudiante1.nuevaMatricula("Programación");
		
		System.out.println( estudiante1.estudianteInfo() );

		
		System.out.println();
		
		
		Profesor profesor1 = new Profesor("Javier","Martinez","Casado",15,2014,415,"Lengua");
		
		profesor1.cambioEstadoCivil("Soltero");
		profesor1.cambioDepartamento("Historia");
		
		System.out.println( profesor1.profesorInfo() );

		System.out.println();				
		
		PersonalServicio serv1 = new PersonalServicio("Maria","Jimenez","Soltera",32,2017,124,"Conserjeria");
		
		serv1.cambioSeccion("Tutoria");
		
		System.out.println( serv1.personalServicioInfo() );

	}
}