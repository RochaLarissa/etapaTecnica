
public class Memoria {
	
	int frequencia;
	String capacidade;
	String tipo;
	
	public Memoria (int frequencia, String capacidade, String tipo) {
		this.frequencia = frequencia;
		this.capacidade = capacidade;
		this.tipo = tipo;
	}

	public int getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}

	public String getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
}
