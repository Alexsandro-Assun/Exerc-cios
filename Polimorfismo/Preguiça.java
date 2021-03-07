package Polimorfismo;

public class Pregui�a extends Animal {

	
	public Pregui�a() {
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
		System.out.println("Sobe em �rvore");
	}
	
}
