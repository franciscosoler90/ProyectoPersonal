package cabecera;

import java.io.Serializable;

public class Persona implements Serializable{
	
	    /**
	     * 
	 	*/
		private static final long serialVersionUID = 1L;
		public String nombre;
	    public String apellido;
	    public int edad;

	    public String toString()
	    {
	        return nombre + "," + apellido + "," + edad;
	    }
	
	    
	    
	    public Persona(String nombre, String apellido, int edad) {
	    	this.nombre = nombre;
	    	this.apellido = apellido;
	    	this.edad = edad;
	    }
	
	


}