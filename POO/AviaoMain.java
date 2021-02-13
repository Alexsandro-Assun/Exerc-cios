package POO;

public class AviaoMain {

	public static void main(String[] args) {
		
		Aviao av1 = new Aviao();
		av1.nome = "Embraer EMB 120";
		av1.alcance = 1000;
		av1.capacidade = 30;
		av1.veloMax = 585;
		av1.decolando = false;
		
		System.out.println("Nome: "+av1.nome);
		System.out.println("Alcance máximo: "+av1.alcance+" km de altitude");
		System.out.println("Velocidade máxima: "+av1.veloMax+" km/h");
		System.out.println("Assentos: "+av1.capacidade);
		av1.estado();

	}

}
