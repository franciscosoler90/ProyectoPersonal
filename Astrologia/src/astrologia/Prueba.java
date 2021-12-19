package astrologia;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Prueba {
	
	public static class DateValidation {
		
	    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	    public static void main(String[] args) {
	        

			System.out.printf("\n%d", addDay(26,3,1990)[2] );
			
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
	
}