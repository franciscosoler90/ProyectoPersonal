package ejercicios;

public class CuentaCorriente {
	
	public Integer getNumCuenta() {
		return numCuenta;
	}

	public Double getSaldo() {
		return saldo;
	}


	public String getCliente() {
		return cliente;
	}


	private Integer numCuenta = 0;
	private Double saldo = 0.0;
	private String cliente = "";
	private static Integer numSiguiente = 0;
		
	//GETTERS AND SETTERS
	public static Integer getNumSiguiente() {
		return numSiguiente;
	}

	public static void setNumSiguiente(Integer numSiguiente) {
		CuentaCorriente.numSiguiente = numSiguiente;
	}
	
	// CONSTRUCTOR
	public CuentaCorriente(double cantidad, String cliente){
		super();
		this.saldo = cantidad;
		this.cliente = cliente;
		numSiguiente++;
		this.numCuenta = numSiguiente;
	}
	
	public CuentaCorriente() {
		this.saldo = 0.00;
		this.cliente = "";

	}
	
	public void ingresaEfectivo(double cantidad) {
		this.saldo+= cantidad;
		System.out.printf("Saldo actual: %.2f", this.saldo);
		System.out.println();
	}	
	
	public Boolean retiraEfectivo(double cantidad) {
		
		if( (this.saldo-cantidad) >= 0) {
			this.saldo-= cantidad;
			System.out.printf("Saldo actual: %.2f", this.saldo);
			System.out.println();
			return true;
		}else {
			System.out.printf("No se puede realizar ninguna operación");
			System.out.println();
			return false;
		}

	}

	public void visualiza() {
		System.out.printf("Cliente: %s - Número de cuenta: %d - Saldo: %.2f", this.cliente, this.numCuenta, this.saldo);
		System.out.println();
	}
	

}