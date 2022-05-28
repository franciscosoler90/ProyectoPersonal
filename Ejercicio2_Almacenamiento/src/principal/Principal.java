package principal;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.EOFException;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Principal {

	public static void main(String[] args) {
		
		EscribirDatos();
		LecturaDatos();
		
	}
	
	
	public static void EscribirDatos() {
		
		Punto2D p = new Punto2D(2,5);

		ObjectOutputStream fichEscribir = null;

		try { // escribimos el objeto en el fichero

			FileOutputStream fos = new FileOutputStream("ficheroPuntos.dat");

			fichEscribir = new ObjectOutputStream(fos);
			fichEscribir.writeObject(p);

		} catch (FileNotFoundException e) {
			System.out.println("Error, no se encuentra el fichero");
		} catch (IOException ex) {
			System.out.println("Error al cerrar el fichero: " + ex.getMessage());

		} finally {

			try {

				if (fichEscribir != null) {
					fichEscribir.close();
				}

			} catch (IOException ex) {
				System.out.println("Error al cerrar el fichero: " + ex.getMessage());
			}

		} // finally
			
	}
	
	
	
	public static void LecturaDatos() {
		
		ObjectInputStream fichLeer = null;

		try { // leemos el fichero de objetos

			boolean hayaDatos = true;
			Punto2D punto;

			fichLeer = new ObjectInputStream(new FileInputStream("ficheroPuntos.dat"));

			System.out.println("\nLos datos de los puntos recuperados del fichero son: ");

			while (hayaDatos) {
				try {
					punto = (Punto2D) fichLeer.readObject();
					System.out.println(punto);
				} catch (EOFException e) {
					hayaDatos = false; // Salimos del bucle al terminar de recorrer el fichero
				}
			}

			System.out.println("Fichero recorrido completamente");

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		} catch (IOException e) {

			System.out.println(e.getMessage());

		} finally {

			try {

				fichLeer.close();

			} catch (IOException e) {

				System.out.println(e.getMessage());

			}

		}

	}
	
	//Cabeceras
	protected void writeStreamHeader() throws IOException{
		return;
	}
	
	public void MyObjectOutputStream(FileOutputStream fos) throws IOException, SecurityException{
		
		//return super(fos);
	}
	
	
	

}
