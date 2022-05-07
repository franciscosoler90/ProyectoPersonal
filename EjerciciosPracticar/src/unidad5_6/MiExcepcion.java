package unidad5_6;

public class MiExcepcion extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MiExcepcion() {
		
		super("No has introducido una edad entre 18 y 65 años.");
		
	}

}
