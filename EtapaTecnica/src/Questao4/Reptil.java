package Questao4;

public class Reptil extends Animal {
	
	public Reptil (String classe, String alimentacao, String habitat) {
		super (classe, alimentacao, habitat);
	}
	
	@Override
	public void locomover() {
		System.out.println("Nadar");
	}

}
