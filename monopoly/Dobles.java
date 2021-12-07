package monopoly;
import java.util.Random;

public class Dobles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random();
		int dado1 = 0;
		int dado2 = 0;
		int dobles = 0;
		
		
		for(int i = 0; i < 100; i++) {	
			
			dado1 = ran.nextInt(6) + 1;
			dado2 = ran.nextInt(6) + 1;

			System.out.printf("\n%d - %d", dado1,dado2);
			
			if(dado1 == dado2) {
				dobles++;
			} else {
				dobles = 0;
			}
			
			if(dobles >= 3) {
				System.out.print(" <--------------------------------------------------------------------");
				dobles = 0;
			}
			
			
		}

	}

}
