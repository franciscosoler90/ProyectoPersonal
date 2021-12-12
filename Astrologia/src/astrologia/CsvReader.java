package astrologia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CsvReader {
	
	public Line1[] leer() {
		
		String line = "";
		String fileName = "";
		String name = "";
		
		String[][] lineasArray = new String[2][2];

		String[] values;
		
		Line1[] Line1Array;
		Line1Array = new Line1[2];
		
		int year = 0;
		int month = 0;
		int day = 0;
		int hour = 0;
		int minute = 0;		
		int comprobacion = 0;
		
	    var pathName = Paths.get("C:\\Users\\Fran\\Downloads\\Ephemeris-CSV\\Ephemeris CSV");
		Scanner teclado = new Scanner(System.in);
		
		// --------------------------------------------------------------------------------------------------------------------		
		
		for(int i = 0; i < 2; i++) {
			
			comprobacion = 0;
				
			System.out.print("Nombre: ");		
			
            name = teclado.nextLine();			
			
			do {
                System.out.print("Año: ");
                while (!teclado.hasNextInt()) {
					System.out.println("Valor no válido");
					teclado.next();
					System.out.print("Año: ");                               
				}
                year = teclado.nextInt();
                if(year <= 1900 || year>= 2100){
					System.out.println("El número debe ser 1901 - 2099");                                           
				}
			} while (year <= 1900 || year>= 2100);   
            
            do {
                System.out.print("Mes: ");
                while (!teclado.hasNextInt()) {
					System.out.println("Valor no válido");
					teclado.next();
					System.out.print("Mes: ");                               
				}
                month = teclado.nextInt();
                if(month < 1 || month > 12){
					System.out.println("El número debe ser positivo y menor de 13");                                           
				}
			} while (month < 1 || month > 12);   
            
            do {
                System.out.print("Día: ");
                while (!teclado.hasNextInt()) {
					System.out.println("Valor no válido");
					teclado.next();
					System.out.print("Día: ");                               
				}
                day = teclado.nextInt();
                if(day < 1 || day > 31){
					System.out.println("El número debe ser positivo y menor de 32");                                           
				}
			} while (day < 1 || day > 31);        
            
            do {
                System.out.print("Horas: ");
                while (!teclado.hasNextInt()) {
					System.out.println("Valor no válido");
					teclado.next();
					System.out.print("Horas: ");                               
				}
                hour = teclado.nextInt();
                if(hour < 0 || hour > 23){
					System.out.println("El número debe ser positivo y menor de 24");                                           
				}
			} while (hour < 0 || hour > 23); 
            
            do {
                System.out.print("Minutos: ");
                while (!teclado.hasNextInt()) {
					System.out.println("Valor no válido");
					teclado.next();
					System.out.print("Minutos: ");                               
				}
                minute = teclado.nextInt();
                if(minute < 0 || minute > 59){
					System.out.println("El número debe ser positivo y menor de 60");                                           
				}
			} while (minute < 0 || minute > 59);             
            
    		// --------------------------------------------------------------------------------------------------------------------
			
		    DirectoryStream.Filter<Path> filter = file -> { return file.toString().endsWith(".csv"); };				
			
			try (DirectoryStream<Path> fileList = Files.newDirectoryStream(pathName, filter)) {
				
				for (Path file: fileList) {
					
					try(BufferedReader br = Files.newBufferedReader( Paths.get( file.toUri() ) ) ) {
						
						while( ( line = br.readLine() ) != null) {
							
							values = line.split(",");
							
							fileName = file.getFileName().toString();
							fileName = fileName.substring(0, fileName.length()-4);
						
							
							// Comprobar si coindice la misma fecha introducida, el nombre del archivo y el siguiente día
							if(fileName.equals(values[2]) && (values[2].equals(String.valueOf(year)) && values[3].equals(String.valueOf(month)) && values[4].equals(String.valueOf(day)) && comprobacion==0) || comprobacion==1) {
								
								lineasArray[i][comprobacion] = line;
								comprobacion++;
								
							}
						}
						
						br.close();
						
						}catch(FileNotFoundException e) {
						
						e.printStackTrace();
						
						}catch(IOException e) {
						
						e.printStackTrace();
						
					}	
					
				}
				
				
				if(comprobacion==0) {
					i--;
					System.out.println();
					System.out.print("Carta no encontrada");
					System.out.println();
				}
				
				} catch (IOException | DirectoryIteratorException ex) {
			    System.err.println(ex);
			}
			

	        Line1Array[i] = new Line1(lineasArray[i], hour, minute, name);
	        
			System.out.println();

			teclado.nextLine();
	
		}
		
		// --------------------------------------------------------------------------------------------------------------------
		        
		teclado.close();
		
		return Line1Array;
		
	}
}