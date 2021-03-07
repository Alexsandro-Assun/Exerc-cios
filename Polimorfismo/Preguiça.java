package Polimorfismo;

public class Preguiça extends Animal {

	
	public Preguiça() {
		super();
		this.getNome();
		this.getIdade();
	}
	
	@Override
	public void emitirSom(){
		System.out.println("Aaarg");
	}
	
	@Override
	public void movimento() {
		System.out.println("Sobe em árvore");
	}
	
}
