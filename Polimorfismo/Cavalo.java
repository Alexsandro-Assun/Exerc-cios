package Polimorfismo;

public class Cavalo extends Animal {

	
	public Cavalo() {
		super();
		this.getNome();
		this.getIdade();
	}
	
	@Override
	public void emitirSom(){
		System.out.println("Hihihin");
	}
	
	@Override
	public void movimento() {
		System.out.println("Corre");
	}
	
}
