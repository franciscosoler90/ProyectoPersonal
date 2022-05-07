package unidad7_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListString {

	public static void main(String[] args) {
		ArrayList<String> prueba = new ArrayList<String>();

		
		prueba.add("Agumon");
		prueba.add("Gabumon");
		prueba.add("Biyomon");		
		prueba.add("Tentomon");		
		prueba.add("Palmon");
		prueba.add("Gomamon");
		prueba.add("Patamon");
		prueba.add("Gatomon");
		
		
		//Ordenar la lista
		Collections.sort(prueba);

		System.out.println("Demostración");
		System.out.println();
		System.out.println(prueba);
		System.out.println();
		

		
		System.out.println("Iterador");		
		System.out.println();
	    for (String i : prueba) {
	        System.out.println(i);
	      }
		
		
	}

}