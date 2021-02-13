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
		System.out.println("Avião decolando");
		}
		else {
			System.out.println("Avião em repouso na pista");
		}
	}
}
