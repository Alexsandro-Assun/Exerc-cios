package POO;

public class Funcionario {

	String nome ;
	String turno;
	String funcao;
	float salario;
	boolean presenca;
	
	void dados() {
		System.out.println("Nome do(a) funcinário(a): "+this.nome);
		System.out.println("Turno: "+this.turno);
		System.out.println("Função: "+this.funcao);
		System.out.println("Salário: "+this.salario);
		
	}
	
	void presenca() {
		if(this.presenca == true) {
			System.out.println("O/A funcinário(a) "+this.nome+" está em serviço");
		}
		else {
			System.out.println("Funcionário ausente");
		}
	}
	
	
	
	
}	

