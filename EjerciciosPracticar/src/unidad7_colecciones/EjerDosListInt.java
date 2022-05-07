package unidad7_colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class EjerDosListInt {

	public static void main(String[] args) {
		
		//int longArray = (int) (Math.random() * (10) + 1);
		
		
		int longArray = (int) (10);
		int numeros[] = new int[longArray];

		System.out.printf("Se van a generar %d datos.%nInsertando:%n", numeros.length);
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * (4) + 1);
			System.out.printf("[%d] ", numeros[i]);
		}

		ArrayList<Integer> objArrayList = new ArrayList<>();
		LinkedList<Integer> objLinkedList = new LinkedList<>();
		for (int i = 0; i < numeros.length; i++) {
			objArrayList.add(numeros[i]);
			objLinkedList.add(numeros[i]);
		}

		System.out.println("\n\nValores de objHashSet:");
		for (Integer numero : objArrayList) {
			System.out.printf("%d ", numero);
		}

		System.out.println("\n\nValores de objLinkHashSet:");
		for (Integer numero : objLinkedList) {
			System.out.printf("%d ", numero);
		}

		Iterator<Integer> itArrayList = objArrayList.iterator();
		Iterator<Integer> itLinkedList = objLinkedList.iterator();
		System.out.println("\n\nCon iterador:" + "\nValores de objHashSet:");
		while (itArrayList.hasNext()) {
			System.out.printf("%d ", itArrayList.next());
		}

		System.out.println("\n\nValores de objLinkHashSet:");
		while (itLinkedList.hasNext()) {
			System.out.printf("%d ", itLinkedList.next());
		}

		System.out.printf("%n%nValores de objHashSet: %s%n", objArrayList.toString());
		System.out.printf("Valores de objLinkHashSet: %s%n", objLinkedList.toString());
	}

}