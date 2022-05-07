package equals;

import java.util.HashSet;

public class Principal {
	public static void main(String[] args) {
		
		
		
		
		Persona persona1 = new Persona();
		persona1.setNombre("Juan");
		
		Persona persona2 = new Persona();
		persona2.setNombre("Ana");
		
		
		
		
		HashSet<Persona> conjunto = new HashSet<Persona>();
		
		
		
		conjunto.add(persona1);
		conjunto.add(persona2);
		
		
		
		System.out.println(conjunto.contains(persona1));
		
		
		
		
		
		
		
		
		
	}
}