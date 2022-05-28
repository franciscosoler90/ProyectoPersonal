package juego;

import java.util.Random;

public class Juego {
	
	private Integer oportunidades = 0, numeroAleatorio = 0, numeroSeleccionado = 0, nivel = 1;
	private String nombre = null;
	private Boolean finPartida = false;
	
	//Constructor
	public Juego() {
		nivel1();
	}
	
	public Boolean getFinPartida() {
		return finPartida;
	}

	public void setFinPartida(Boolean finPartida) {
		this.finPartida = finPartida;
	}
	
	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
	public Integer getOportunidades() {
		return oportunidades;
	}
	public void setOportunidades(Integer oportunidades) {
		this.oportunidades = oportunidades;
	}
	public Integer getNumeroAleatorio() {
		return numeroAleatorio;
	}
	public void setNumeroAleatorio(Integer numeroAleatorio) {
		this.numeroAleatorio = numeroAleatorio;
	}
	public Integer getNumeroSeleccionado() {
		return numeroSeleccionado;
	}
	public void setNumeroSeleccionado(Integer numeroSeleccionado) {
		this.numeroSeleccionado = numeroSeleccionado;
	}

	
	public void nivel1(){
		Random aleatorio = new Random();
		this.numeroAleatorio = aleatorio.nextInt(100) + 1;
		this.nivel = 1;
		setOportunidades(5);
	}
	
	public void nivel2(){
		Random aleatorio = new Random();
		this.numeroAleatorio = aleatorio.nextInt(1000) + 1;
		this.nivel = 2;
		setOportunidades(10);
	}
	
	
	
	public void subirNivel() {
		
		if(this.nivel == 1) {
			nivel2();
		}else {
			this.finPartida = true;
		}

	}
	
	
	public void restarOportunidades() {
		if( this.oportunidades > 0 ) {
			oportunidades--;
		}		
	}
	
	public void cargarJuego(String nombre, Integer nivel, Integer oportunidades, Integer numeroAleatorio, Integer numeroSeleccionado, Boolean finPartida) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.oportunidades = oportunidades;
		this.numeroAleatorio = numeroAleatorio;
		this.numeroSeleccionado = numeroSeleccionado;
		this.finPartida = finPartida;
	}
	
	public String toString() {
		return nombre + "," + nivel + "," + oportunidades + "," + numeroAleatorio + "," + numeroSeleccionado + "," + finPartida;
	}
	

}