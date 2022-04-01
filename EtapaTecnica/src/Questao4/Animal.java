package Questao4;

public abstract class Animal implements AcoesAnimal {
	
	//classe (anfíbios, répteis, aves e mamíferos),
	//alimentacao (herbívoro, 	onívoros ou carnívoros)
	//habitat (aéreos, terrestres, 	aquáticos ou multi habitat).

	private String classe;
	private String alimentacao;
	private String habitat;
		
	public Animal (String classe, String alimentacao, String habitat) {
		this.classe = classe;
		this.alimentacao = alimentacao;
		this.habitat = habitat;
	}
	
	
	
	public String getClasse() {
		return classe;
	}



	public void setClasse(String classe) {
		this.classe = classe;
	}



	public String getAlimentacao() {
		return alimentacao;
	}



	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}



	public String getHabitat() {
		return habitat;
	}



	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}



		
	@Override
	public void alimentar() {
		if (alimentacao.equalsIgnoreCase("carnivoro")) {
			System.out.println("Alimentar com carne");
		} else if (alimentacao.equalsIgnoreCase("herbivoro")) {
			System.out.println("Alimentar com vegetais");
		} else if (alimentacao.equalsIgnoreCase("onivoro")) {
			System.out.println("Alimentar com mix de Carne e Vegetais");
			
		}
	}
		
	
	
}
