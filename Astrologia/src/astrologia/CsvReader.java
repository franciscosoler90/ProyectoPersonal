package astrologia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class CsvReader {
	
	public Line1 searchCharts(Scanner teclado) {
		
		int year = 0;
		int month = 0;
		int day = 0;
		int hour = 0;
		int minute = 0;		
		
		String name = "";
		
		teclado.nextLine();
	    
		System.out.print("Nombre: ");		
		
		name = teclado.nextLine();			
		
		do {
			
			do {
				System.out.print("Año: ");
				while (!teclado.hasNextInt()) {
					System.out.println("Valor no válido");
					teclado.next();
					System.out.print("Año: ");                               
				}
				year = teclado.nextInt();
				if(year <= 1900 || year >= 2100){
					System.out.println("El número debe ser 1901 - 2099");                                           
				}
			} while (year <= 1900 || year >= 2100);   
			
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
	
	if( !comprobarFecha(day,month,year) ) {
	System.out.println("Fecha inválida");
	}
	
	}while( !comprobarFecha(day,month,year) );
	
	
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
	
	
	return searchFiles(name,day,month,year,hour,minute);      
	
	}
	
	public static Line1 searchFiles(String name, int year, int month, int day, int hour, int minute) {
	
	String line = "";
	String fileName = "";
	
	String[] lineasArray = new String[2];
	String[] values;
	
	int comprobacion = 0;
	
	Line1 linea;
	
	var pathName = Paths.get("C:\\Users\\Fran\\Downloads\\Ephemeris-CSV\\Ephemeris CSV");
	DirectoryStream.Filter<Path> filter = file -> { return file.toString().endsWith(".csv"); };				
	
	try (DirectoryStream<Path> fileList = Files.newDirectoryStream(pathName, filter)) {
	
	for (Path file: fileList) {
	
	try(BufferedReader br = Files.newBufferedReader( Paths.get( file.toUri() ) ) ) {
	
	while( ( line = br.readLine() ) != null && comprobacion < 2 ) {
	
	values = line.split(",");
	
	fileName = file.getFileName().toString();
	fileName = fileName.substring(0, fileName.length()-4);
	
	// Comprobar si coindice la misma fecha introducida, el nombre del archivo y el siguiente día
	if(fileName.equals(values[2]) && (values[2].equals(String.valueOf(year)) && values[3].equals(String.valueOf(month)) && values[4].equals(String.valueOf(day) )) ) {
	
	lineasArray[comprobacion] = line;
	comprobacion++;
	
	day = addDay(day,month,year)[0];
	month = addDay(day,month,year)[1];
	year = addDay(day,month,year)[2];
	
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
	System.out.println("Carta no encontrada");
	System.out.println();
	}
	
	} catch (IOException | DirectoryIteratorException ex) {
	System.err.println(ex);
	}
	
	linea = new Line1(lineasArray, hour, minute, name);
	
	return linea;
	
	}
	
	
    public static Line2 searchName(String name, Scanner teclado){
	
	Line1 carta = null;
	Line2 carta2 = null;
	
	try {
	
	File myObj = new File("Cartas.txt");
	@SuppressWarnings("resource")
	Scanner myReader = new Scanner(myObj);
	
	String confirmacion = "";
	String nameArray[];
	
	Boolean found = false;
	
	while ( myReader.hasNextLine() ) {
	
	String data = myReader.nextLine();
	
	nameArray = data.split(";");
	
	if( nameArray.length == 6 && name.equalsIgnoreCase( nameArray[0] ) ) {
	
	found = true;
	
	System.out.println("Se ha encontrado esta carta: ");
	
	for(int i = 0; i < 6; i++) {
	
	switch(i) {
	case 0:
	System.out.printf("\nNombre: %s", nameArray[i]);
	break;
	case 1:
	System.out.printf("\nAño: %s", nameArray[i]);
	break;
	case 2:
	System.out.printf("\nMes: %s", nameArray[i]);
	break;
	case 3:
	System.out.printf("\nDía: %s", nameArray[i]);
	break;
	case 4:
	System.out.printf("\nHora: %s", nameArray[i]);
	break;
	case 5:
	System.out.printf("\nMinuto: %s", nameArray[i]);
	break;
	}
	
	}
	
	System.out.println();
	System.out.println();

	confirmacion = teclado.nextLine();
	
	if (Main.confirmar(confirmacion)) {
	
		carta = searchFiles(name, Integer.parseInt(nameArray[1]), Integer.parseInt(nameArray[2]), Integer.parseInt(nameArray[3]), Integer.parseInt(nameArray[4]), Integer.parseInt(nameArray[5]) );
		carta2 = CalcularCartas.leer(carta); 
		break;
	
	}
	}
	}
	
	if( !found ) {
	System.out.println("No se han encontrado cartas");
	}
	
	} catch (FileNotFoundException e) {
	
	System.out.println("Ha ocurrido un error.");
	e.printStackTrace();
	
	}
	
	System.out.println("Ha ocurrido un error.");
	return carta2;   	
    }
	
	
	
	
    private static boolean comprobarFecha(int day, int month, int year){
	
	String date = day+"/"+month+"/"+year;
	
	boolean status = false;
	if (checkDate(date)) {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	dateFormat.setLenient(false);
	try {
	dateFormat.parse(date);
	status = true;
	} catch (Exception e) {
	status = false;
	}
	}
	return status;
	}
    
    private static boolean checkDate(String date) {
	String pattern = "(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/([0-9]{4})";
	boolean flag = false;
	if (date.matches(pattern)) {
	flag = true;
	}
	return flag;
	}
    
    private static Integer[] addDay(int day, int month, int year) {
	
	String dt = day+"/"+month+"/"+year;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Calendar c = Calendar.getInstance();
	try {
	c.setTime(sdf.parse(dt));
	} catch (ParseException e) {
	e.printStackTrace();
	}
	c.add(Calendar.DATE, 1);
	dt = sdf.format(c.getTime());
	
	String[] sArray = dt.split("/");
	
	Integer[] intArray = new Integer[sArray.length];
	
	for(int i = 0; i < sArray.length; i++) {
	
	intArray[i] = Integer.parseInt( sArray[i] );
	
	}
	
	
	return intArray;
	}
	
	
	
	
	}	