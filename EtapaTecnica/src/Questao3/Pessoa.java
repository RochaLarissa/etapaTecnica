package Questao3;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	private String nome;
	private String sexo;
	private String dataNascimento;
	
	public Pessoa (String nome, String sexo, String dataNascimento) {
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
		
	public void imprimeTempoVidaRestante () {
		
		DateFormat df = new SimpleDateFormat(“dd/MM/yyyy”);
		Date dt = df.parse(dataNascimento);
		
		if (sexo.equalsIgnoreCase("masculino")) {
			int idade = 2022 - dataNascimento.getYear();
			int anos = 73 - idade;
			System.out.println("Restam " + anos + " de vida.");
		}
		if (sexo.equalsIgnoreCase("feminino")) {
			int idade = 2022 - dataNascimento.getYear();
			int anos = 80 - idade;
			System.out.println("Restam " + anos + " de vida.");
		}
	}

}
