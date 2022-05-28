package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SearchFiles {
	
	

	
	public static void search(int day, int month, int year, int minute, int hour) {
		
		
		if(day<0 || day >31 || month <0 || month >12 || year<1901 || year>2099 || minute<0 || minute>59 || hour<0 || hour>23) {
			
			GUI.mostrarError("Datos Incorrectos");
		
		}else {
			
			//Busca en el directorio
			var pathName = Paths.get("files\\db");
			DirectoryStream.Filter<Path> filter = file -> { return file.toString().endsWith(".csv"); };				
			
			//Comprueba
			try (DirectoryStream<Path> fileList = Files.newDirectoryStream(pathName, filter)) {
				
				String fileName = "", line = "", stringYear = String.valueOf( year );
				String[] lineasArray = new String[2];
				String[] values;
				
				@SuppressWarnings("unused")
				Boolean comprobacion = false;
				int contador = 0;
				
				//Recorre todo el directorio
				for (Path file: fileList) {
					
					
					fileName = file.getFileName().toString().substring(0, 4);
					
					//Si coincide con el año
					if (fileName.equals(stringYear)) {
					
						comprobacion = true;
						
						try(BufferedReader br = Files.newBufferedReader( Paths.get( file.toUri() ) ) ) {
							
							while( ( line = br.readLine() ) != null && contador < 2 ) {
							
							values = line.split(",");
							
							fileName = file.getFileName().toString();
							fileName = fileName.substring(0, fileName.length()-4);
							
							// Comprobar si coindice la misma fecha introducida, el nombre del archivo y el siguiente día
							if(fileName.equals(values[2]) && (values[2].equals(String.valueOf(year)) && values[3].equals(String.valueOf(month)) && values[4].equals(String.valueOf(day) )) ) {
								
								lineasArray[contador] = line;
								contador++;
								
								}
							}
							
								br.close();
							
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
