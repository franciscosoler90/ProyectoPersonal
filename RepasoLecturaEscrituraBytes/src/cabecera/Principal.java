package cabecera;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;

import utilidades.Leer;

public class Principal {
	
	
	private static String ruta = "archivo.dat";

	public static void main(String[] args) {

		
		//pedirPersonas();
		
		System.out.println();
		
		//leerPersonas();
		

		borrarArchivo();
		
		//mostrarArchivos();

	}
	
	
	public static void pedirPersonas() {
		
		String nombre = "", apellido = "";
		int edad = 0;

		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		
		while(Leer.pedirEntero("--> Introduciendo persona (0 para salir)") != 0) {
			
			nombre = Leer.pedirCadena("Introduce el nombre de la persona");
			apellido = Leer.pedirCadena("Introduce el apellido de la persona");
			edad = Leer.pedirEntero("Introducce la edad de la persona");
			
			Persona persona = new Persona(nombre,apellido,edad);
			
			personas.add(persona);
			
		}
		
		escribirPersonas(personas);

		
	}
	
	public static void leerPersonas() {
		
		File archivo = new File(ruta);
		FileInputStream fis = null;
		ObjectInputStream objLeer = null;
		
		
		boolean hayDatos = true;
		Persona persona;
		
		
		try {
			
			fis = new FileInputStream(archivo);
			objLeer = new ObjectInputStream( fis );
			
			while(hayDatos) {
				
				try {
					
					persona = (Persona) objLeer.readObject();
					System.out.println( persona.toString() );
					
				} catch(EOFException e) {
					
					hayDatos = false;
					
				}
				
			}
			
			fis.close();
			objLeer.close();
			
		}catch (FileNotFoundException e) {
			
			System.out.println("Error. Fichero no encontrado");
			
		} catch (StreamCorruptedException e) {
			
			System.out.println("Stream corrupto: " + e.getMessage());
			
		} catch (IOException e) {
			
       	 System.out.println("Error de entrada/salida: " + e.getMessage());
       	 
		} catch (ClassNotFoundException e) {
			
			System.out.println("La clase no existe: " + e.getMessage());
			
		} finally {
			
           try {
               if(fis!=null) {
                   fis.close();
               }
               if (objLeer!=null) {
            	   objLeer.close();
               }
              
           } catch (IOException ex) {
        	   
           	 System.out.println("Error al cerrar fichero: " + ex.getMessage());
           	 
           }

       }
		
	}
		
	public static void escribirPersonas(ArrayList<Persona> personas) {
		
		borrarArchivo();
		
		File archivo = new File(ruta);
		FileOutputStream fos = null;
		
		
		
		MyObjectOutputStream oosSinCab = null;
		ObjectOutputStream oos = null;
		
		
		
		try {
			fos = new FileOutputStream(archivo,true);
			
			if( archivo.length() > 0 ) {
				
				oosSinCab=new MyObjectOutputStream(fos);
				for(Persona persona : personas) {
					oosSinCab.writeObject(persona);
				}
				oosSinCab.close();
				
				
			}else {
				
				oos = new ObjectOutputStream(fos);
				for(Persona persona : personas) {
					oos.writeObject(persona);
				}
				oos.close();				
				
			}

			fos.close();

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				
				if(fos!=null) {
					fos.close();
				}
				
				if(oos!=null) {
					oos.close();
				}
				
				if(oosSinCab!=null) {
					oosSinCab.close();
				}				
				
			} catch (IOException e) {
				System.out.println("Error al cerrar el archivo");
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	public static void borrarArchivo() {
		
		File archivo = new File(ruta);

		if( archivo.isFile() && archivo.exists() ) {
			
			System.out.println("Es un archivo y existe");
			
			archivo.delete();
			
			System.out.println("Archivo borrado");
			
		}

	}
	
	
	public static void mostrarArchivos() {
		
		File directorio = new File("src");
		
		if( directorio.isDirectory() ) {
			
			String lista[] = directorio.list();
			
			for(String linea: lista) {
				System.out.println(linea);
			}
			
		}else {
			
			System.out.println("No es un directorio");
			
		}
		

		
		
	}

}
