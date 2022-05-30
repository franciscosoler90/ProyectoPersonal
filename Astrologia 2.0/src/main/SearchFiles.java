package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import utilidades.Fecha;
import utilidades.Hora;
import utilidades.Linea;
public class SearchFiles {
	
	

	
	public static void search(Fecha fecha, Hora hora) {
		

		if(fecha.getDay()<0 || fecha.getDay() >31 || fecha.getMonth() <0 || fecha.getMonth() >12 || fecha.getYear()<1901 || fecha.getYear()>2099 || hora.getMinute()<0 || hora.getMinute()>59 || hora.getHour()<0 || hora.getHour()>23) {
			
			GUI.mostrarError("Datos Incorrectos");
		
		}else {
			
			//Busca en el directorio
			var pathName = Paths.get("files\\db");
			DirectoryStream.Filter<Path> filter = file -> { return file.toString().endsWith(".csv"); };				
			
			//Comprueba
			try (DirectoryStream<Path> fileList = Files.newDirectoryStream(pathName, filter)) {
				
				String fileName = "", line = "", stringYear = String.valueOf( fecha.getYear() );
				String[] lineasArray = new String[2];
				String[] values = null;
				
				@SuppressWarnings("unused")
				Boolean comprobacion = false;
				int contador = 0;
				
				//Recorre todo el directorio
				for (Path file: fileList) {
					
					
					fileName = file.getFileName().toString().substring(0, 4);
					
					//Si coincide con el a�o
					if (fileName.equals(stringYear)) {
					
						comprobacion = true;
						
						try(BufferedReader br = Files.newBufferedReader( Paths.get( file.toUri() ) ) ) {
							
							while( ( line = br.readLine() ) != null && contador < 2 ) {
							
							values = line.split(",");
							
							fileName = file.getFileName().toString();
							fileName = fileName.substring(0, fileName.length()-4);
							
							// Comprobar si coindice la misma fecha introducida, el nombre del archivo y el siguiente d�a
							if(fileName.equals(values[2]) && (values[2].equals(String.valueOf( fecha.getYear() )) && values[3].equals(String.valueOf( fecha.getMonth() )) && values[4].equals(String.valueOf( fecha.getDay() ))) || contador == 1) {
								
								lineasArray[contador] = line;
								contador++;
								}
							}
							
							br.close();
							
							Linea lineas = new Linea(lineasArray[0], lineasArray[1], hora);
								
							GUI.escribirMensaje( lineas.SunToString() + "\n" + lineas.MoonToString() + "\n" + lineas.MercuryToString() + "\n" + lineas.VenusToString() + "\n" + lineas.MarsToString() + "\n" + lineas.JupiterToString() + "\n" + lineas.SaturnToString() );


							}catch(FileNotFoundException e) {
							
								e.printStackTrace();
							
							}catch(IOException e) {
							
								e.printStackTrace();
							
							}	
					
					
					}
					
					
				}
				
				
				
				
			}catch (IOException | DirectoryIteratorException ex) {
				System.err.println(ex);
			}
			

			
		}


		
		
		
	}
	
	
	
	
	
	
	

}
