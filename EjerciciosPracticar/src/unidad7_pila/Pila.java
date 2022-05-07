package unidad7_pila;

import java.util.ArrayList;
import java.util.List;

public class Pila {

	private List<Integer> pila;


	public Pila() {
		pila = new ArrayList<>();
	}
	
	/**
	 * apilar metodo que añade numeros a un ArrayList
	 * @param num
	 */
	public void apilar(Integer num) {
		pila.add(num);
	}
	
	/**
	 * Metodo que borra el ultimo elemento añadido a nuestro ArrayList si hemos insertado datos previamente.
	 * @return
	 */
	public String desapilar() {		
		Integer numero = null;
		if(pila.size()!=0) {
			numero = pila.get(pila.size() - 1);
			pila.remove(pila.size() - 1);
			return "Elemento " + numero;
		}
		return "No hay ningun elemento";
	}
	
	/**
	 * tamanyoPila metodo que muestra el tamaño del ArrayList.
	 * @return
	 */
	public int tamanyoPila() {
		return pila.size();
	}

	/**
	 * visualizarTodos metodo que muestra los elementos del ArrayList y los eliminea posteriormente.
	 */
	public void visualizarTodos() {

		int tamanyoPila = pila.size();

		System.out.println("\nElementos de la pila");
		for (int i = 1; i <= tamanyoPila; i++) {
			System.out.print(desapilar() + ", ");
		}

	}

}

