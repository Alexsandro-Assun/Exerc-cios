package POO;

public class Pessoa {
	
	private String nome;
	private String telefone;
	private String endere�o;
	
	public  Pessoa(String nome) {
		this.nome = nome;

	}
	
	public  Pessoa() {
		
	}
	
	public  Pessoa(String nome,String tel,String end){
		this.nome = nome;
		this.telefone = tel;
		this.endere�o = end;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	
	
}
