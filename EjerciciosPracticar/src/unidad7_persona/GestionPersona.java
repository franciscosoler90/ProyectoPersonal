package unidad7_persona;

public class GestionPersona {

	public static void main(String[] args) {
		Persona persona1, persona2, persona3;
		persona1 = new Persona("Pilar", 23,160);
		persona2 = new Persona("Luis", 17,170);
		persona3 = new Persona("Pilar", 23,158);
		
		System.out.println("Datos de persona1: " + persona1.getNombre() + " ** " + persona1.getEdad());
		System.out.println("Datos de persona2: " + persona2.getNombre() + " ** " + persona2.getEdad());
		System.out.println("Datos de persona3: " + persona3.getNombre() + " ** " + persona3.getEdad());
		
		if(persona1 == persona3){
			System.out.println("persona1 es igual que persona3");
		}else {
			System.out.println("persona1 y persona3 son distintas");
		}
		
		System.out.println("Hay "+Persona.getContador()+" personas");
	}
}