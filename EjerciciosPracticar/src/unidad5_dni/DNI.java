package unidad5_dni;

public class DNI {
	private int numero;
	private char letra;

	public DNI(String dni) throws LetraIncorrecta {
		this.numero = Integer.parseInt(dni.substring(0, 8));
		this.letra = dni.charAt(8);
		
		this.letra = Character.toUpperCase(this.letra);
		
		if (!correcto()) {
			throw new LetraIncorrecta();
		}else {
			System.out.println("DNI Correcto");
		}

	}

	public char calculaLetra() {
		char[] letrasDni = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };

		return letrasDni[this.numero % 23];
	}

	public boolean correcto() {
		if (calculaLetra() == this.letra)
			return true;
		else
			return false;
	}

	public String toString() {
		return this.numero + "-" + this.letra;

	}

}