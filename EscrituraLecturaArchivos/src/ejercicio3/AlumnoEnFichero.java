package ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AlumnoEnFichero {

	public static void main (String[] args) throws IOException  {
	
		Scanner teclado= new Scanner(System.in);
		ArrayList<Alumno> alumnos= new ArrayList<Alumno>();
		String respuesta="";
		int contador=1;							//Variables contadores y demas
		String nombre="";
		int edad=9999;
		double nota=9999;
		
		System.out.println("Vamos a añadir un alumno");	
		while(!respuesta.equals("0")) {
			if(contador>1) {
				System.out.println("Vamos a añadir al alumno "+contador);	
			}
			
			try {
				System.out.println("Como se llama?");
				nombre=teclado.next();
				System.out.println("Que edad tiene?");		//Menu para crear el alumno
				edad=teclado.nextInt();
				System.out.println("Que nota tiene?");
				nota=teclado.nextDouble();
			}catch(InputMismatchException e) {
				System.out.println("Valor añadido incorrecto");
			}
			if(edad!=9999 && nota!=9999){				//Comprobación de que se haya creado bien
				Alumno alumno= new Alumno(nombre, edad, nota);
				alumnos.add(alumno);
				contador++;
				System.out.println(alumno.toString());
				System.out.println("Alumno añadido, si quieres parar pulsa 0, sino cualquier otra tecla");
				respuesta=teclado.next();
			}else {
				System.out.println("Alumno no añadido, si quiere parar pulse 0, sino cualquier otra tecla");
				respuesta=teclado.next();
				respuesta=teclado.next();
			}
			nombre="";
			edad=9999;
			nota=9999;
		}
		teclado.close();
		
		String alumnosCadena="FICHERO DE ALUMNOS\n\n";
		for(Alumno alumno: alumnos) {					//Hacemos el String para los alumnos
			alumnosCadena+=alumno.toString()+"\n";			
		}
		
		
		
        String path = "FileAlumnos.txt";
		
		
		File destino = new File(path);
		//destino.delete();
		
		if(destino.exists()) {
			
	        try {
		        Files.write(Paths.get(path), alumnosCadena.getBytes());
	        }catch(FileNotFoundException e) {
	        	System.out.println(e.getMessage());
	        }catch(IOException e) {
	        	System.out.println(e.getMessage());
	        }
	        
			
		}else {
			
			System.out.println("El archivo no existe. Fallo de escritura");
			
		}


      
}

	
}