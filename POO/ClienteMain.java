package POO;

public class ClienteMain {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente() ;
		
	c1.nome = "Alexsandro";
	c1.cpf = "12312345645";
	c1.tel = "70707070";
	c1.cadastro = true;
		
	System.out.println("Nome do cliente: "+c1.nome);
	System.out.println("CPF: "+c1.cpf);
	System.out.println("Telefone: "+c1.tel);
	c1.cadastrado();
	c1.desconto();	
	}
}
