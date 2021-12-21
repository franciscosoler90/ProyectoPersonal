package astrologia;

public class GradoMinutoSigno {
	
	private int grado = 0;
	private int minuto = 0;
    private String signo = "";
    
	public int getGrado() {
		return grado;
	}
	
	public int getMinuto() {
		return minuto;
	}	
	
	public String getSigno() {
		return signo;
	}
    
    GradoMinutoSigno(int grado, int minuto, String signo)
    {
        this.grado = grado;
        this.minuto = minuto;        
        this.signo = signo;
	}
}