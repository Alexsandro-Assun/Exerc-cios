package POO;

public class Funcionario {

	String nome ;
	String turno;
	String funcao;
	float salario;
	boolean presenca;
	
	void dados() {
		System.out.println("Nome do(a) funcin�rio(a): "+this.nome);
		System.out.println("Turno: "+this.turno);
		System.out.println("Fun��o: "+this.funcao);
		System.out.println("Sal�rio: "+this.salario);
		
	}
	
	void presenca() {
		if(this.presenca == true) {
			System.out.println("O/A funcin�rio(a) "+this.nome+" est� em servi�o");
		}
		else {
			System.out.println("Funcion�rio ausente");
		}
	}
	
	
	
	
}	

