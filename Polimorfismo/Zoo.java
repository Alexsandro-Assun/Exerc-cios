package Polimorfismo;

public class Zoo {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		Cavalo h = new Cavalo();
		Preguiça p = new Preguiça();
		
		c.setNome("Cachorro");
		System.out.println(c.getNome());
		c.setIdade(15);
		System.out.println(c.getIdade());
		c.emitirSom();
		c.movimento();
		System.out.println();
		h.setNome("Cavalo");
		System.out.println(h.getNome());
		h.setIdade(10);
		System.out.println(h.getIdade());
		h.emitirSom();
		h.movimento();
		System.out.println();
		p.setNome("Preguiça");
		System.out.println(p.getNome());
		p.setIdade(8);
		System.out.println(p.getIdade());
		p.emitirSom();
		p.movimento();
	}

}
