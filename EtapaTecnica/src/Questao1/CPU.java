package Questao1;

public class CPU {
	
	private String clock;
	private String modelo;
	
	public CPU(String clock, String modelo) {
		this.clock = clock;
		this.modelo = modelo;
	}

	public String getClock() {
		return clock;
	}

	public void setClock(String clock) {
		this.clock = clock;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

}
