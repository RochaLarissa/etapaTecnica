package Questao4;

public class Anfibio extends Animal {
	
	public Anfibio (String classe, String alimentacao, String habitat) {
		super (classe, alimentacao, habitat);
	}
	
	@Override
	public void locomover() {
		System.out.println("Nadar");
	}
	
	

}
