package Polimorfismo;

public class Cachorro extends Animal{

	public Cachorro () {
		super();
		this.getNome();
		this.getIdade();
	}
	
	@Override
	public void emitirSom(){
		System.out.println("Au au");
	}
	
	@Override
	public void movimento() {
		System.out.println("Corre");
	}
}
