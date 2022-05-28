package cabecera;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class MyObjectOutputStream extends ObjectOutputStream{
	
	public MyObjectOutputStream(FileOutputStream out) throws IOException, SecurityException {
		super(out);
	}
	
	
	@Override
	protected void writeStreamHeader() throws IOException{
		
		// No se hace nada
		
	}
}