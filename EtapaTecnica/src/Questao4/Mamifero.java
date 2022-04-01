package Questao4;

public class Mamifero extends Animal {
	
	public Mamifero (String classe, String alimentacao, String habitat) {
		super (classe, alimentacao, habitat);
	}
	
	@Override
	public void locomover() {
		System.out.println("Andar");
	}
	
	

}
