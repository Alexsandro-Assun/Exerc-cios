package POO;

public class Cliente {

	String nome;
	String cpf;
	String tel;
	boolean cadastro;

	
	void cadastrado()
	{
		if(cadastro == true)
		{
		System.out.println("Cliente cadastrado");	
		}
		else {
			System.out.println("Cliente não cadastrado");	
		}
		 
		
	}
	
	void desconto()
	{
		if(cadastro = true)
		{
			System.out.println("Cliente com 15% de desconto em qualquer compra");	
		}
		else {
			System.out.println("Cliente sem desconto");	
		}
	}
	
	
}


