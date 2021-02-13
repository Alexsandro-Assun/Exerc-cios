package POO;

public class FuncionarioMain {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.nome = "Cleide";
		f1.funcao = "Gerente";
		f1.turno = "Tarde";
		f1.salario = 2500;
		f1.presenca = false;
		f1.dados();
		f1.presenca();
	}

}
