package unidad7_pila;

public class Principal {

	public static void main(String[] args) {
		Pila pila = new Pila();
		String[] menu = {"Salir", "Apilar en la cima",
				"Desapilar de la cima", "Número de elementos apilados",
		"Visualización de elementos de la pila"};

		gestionMenu(pila, menu);
	}

	
	/**
	 * gestionMenu metodo que gestionara las opciones del menu que le pasamos.
	 * @param pila 
	 * @param menu
	 */
	private static void gestionMenu(Pila pila, String[] menu) {
		int op;
		int numero;
		do {
			Leer.mostrarEnPantalla("\nOpciones");
			op = Leer.pedirEntero(menu);

			switch (op) {
			case 1: //Apilar en la cima
				do {
					numero = Leer.pedirEntero("Introduzca numero para apilar(-1 para salir)");
					if(numero !=-1) {
						pila.apilar(numero);
					}
				}while(numero!=-1);
				break;

			case 2://Desapilar de la cima
				System.out.println(	pila.desapilar());

				break;

			case 3://Número de elementos apilados

				System.out.println(	pila.tamanyoPila());

				break;

			case 4://Visualización de elementos de la pila.
				pila.visualizarTodos();
			}

		}while(op!=0);
	}




}