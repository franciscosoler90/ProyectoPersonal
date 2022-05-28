package principal;

import java.io.File;

public class NuevaClase {

	public static void main(String[] args) {

		
		
		File archivo = new File("C:\\Users\\aluDAM\\MiDespensa");
		
		
		String ruta = archivo.getAbsolutePath();
		
		System.out.println( ruta );
		
		
		if( archivo.exists() ) {
		
			String[] mostrar = archivo.list();
			
			
			System.out.println();
			System.out.println( "Mostrando lista de archivos: ");
			System.out.println();
			
			for(int i = 0; i < mostrar.length; i++) {
			
				System.out.println(mostrar[i]);
				
			}
		
		}else {
			
			System.out.println( "La ruta no existe");
			
		}
		
		
		

	}

}
