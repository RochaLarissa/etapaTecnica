import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Cadastrar cada um, imprimir cada um, implementar o método
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cadastro de Novo Hardware");
		System.out.println("Informe ID:");
		String id = sc.next();
		System.out.println("Informe descrição:");
		String descricao = sc.next();
		System.out.println("Informe valor:");
		double valor = sc.nextDouble();
		System.out.println("Informe fabricante:");
		String fabricante = sc.next();
		Hardware hardware1 = new Hardware(id, descricao, valor, fabricante);
		
		System.out.println("Cadastro de Nova CPU");
		System.out.println("Informe clock:");
		String clock = sc.next();
		System.out.println("Informe modelo:");
		String modelo = sc.next();
		CPU cpu1 = new CPU(clock, modelo);
		
		System.out.println("Cadastro de Nova Memoria");
		System.out.println("Informe frequencia:");
		int frequencia = sc.nextInt();
		System.out.println("Informe capacidade:");
		String capacidadeMemoria = sc.next();
		System.out.println("Informe tipo:");
		String tipoMemoria = sc.next();
		Memoria memoria1 = new Memoria(frequencia, capacidadeMemoria, tipoMemoria);
		
		System.out.println("Cadastro de Novo Disco Rigido");
		System.out.println("Informe capacidade:");
		String capacidadeDisco = sc.next();
		System.out.println("Informe velocidade:");
		int velocidade = sc.nextInt();
		System.out.println("Informe tipo:");
		String tipoDisco = sc.next();
		DiscoRigido discoRigido1 = new DiscoRigido(capacidadeDisco, velocidade, tipoDisco);
		
		System.out.println("Veja todos os equipamentos cadastrados:");
		System.out.println("Hardware1:");
		System.out.println("ID:" + hardware1.getId() + " Descricao: " + hardware1.getDescricao() +
				" Valor: " + hardware1.getValor() + " Fabricante: " + hardware1.getFabricante());
		System.out.println("CPU1:");
		System.out.println("Clock: " + cpu1.getClock() + " Modelo: " + cpu1.getModelo());
		System.out.println("Memoria:");
		System.out.println("Frequencia: " + memoria1.getFrequencia() + " Capacidade: " 
				+ memoria1.getCapacidade() + " Tipo: " + memoria1.getTipo());
		System.out.println("Disco Rigido:");
		System.out.println("Capacidade: " + discoRigido1.getCapacidade() + " Velocidade: " 
				+ discoRigido1.getVelocidade() + " Tipo: " + discoRigido1.getTipo());
		
		hardware1.getDetalhesHardware();
	}

}
