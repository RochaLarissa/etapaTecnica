package Questao4;

public class Ave extends Animal {
	
	public Ave (String classe, String alimentacao, String habitat) {
		super (classe, alimentacao, habitat);
	}
	
	@Override
	public void locomover() {
		System.out.println("Voar");
	}
	
	

}
