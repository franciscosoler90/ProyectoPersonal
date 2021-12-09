package astrologia;

public class Main {

	public static void main(String[] args) {
	
        System.out.print("---------- INICIO DEL PROGRAMA ----------");
        System.out.println();
        
        CsvReader lector = new CsvReader();
        Line1[] Line1Array = lector.leer();
        
        //----------------------------------------------------------------------

        Line2 cartas[] = new Line2[2];
        cartas = CalcularCartas.leer(Line1Array);

        //----------------------------------------------------------------------       
        
        CalcularAspectos.infoCarta(cartas);
        CalcularAspectos.sinastria(cartas);
        
        //----------------------------------------------------------------------
        
        System.out.println();
        System.out.println();
        System.out.print("---------- FIN ----------");
        
        
        // Fin del programa
        
	}
}