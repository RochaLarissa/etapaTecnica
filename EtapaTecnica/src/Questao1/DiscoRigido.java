package Questao1;

public class DiscoRigido {
	
	private String capacidade;
	private int velocidade;
	private String tipo;
	
	public DiscoRigido (String capacidade, int velocidade, String tipo) {
		this.capacidade = capacidade;
		this.velocidade = velocidade;
		this.tipo = tipo;
	}

	public String getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
