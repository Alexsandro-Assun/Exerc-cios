package POO;

public class Aviao {

	String nome;
	int capacidade;
	int veloMax;
	float alcance;
	boolean decolando;
	
	void estado() {
		if (decolando == true)
		{
		System.out.println("Avi�o decolando");
		}
		else {
			System.out.println("Avi�o em repouso na pista");
		}
	}
}
