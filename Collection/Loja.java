package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Collection<String> produtos = new ArrayList<>();
		int op;

		produtos.add("Trakinas");
		produtos.add("Plugados");
		produtos.add("Tortinha");
		produtos.add("Passatempo");
		produtos.add("Balducco");

		do {

			System.out.println("\nMenu");
			System.out.println("1 - Estoque");
			System.out.println("2 - Adicionar ao estoque");
			System.out.println("3 - Remover do estoque");
			System.out.println("4 - Substituir produto");
			System.out.println("0 - Sair");

			op = ler.nextInt();

			switch (op) {
			case 1:
				System.out.println(produtos);
				break;

			case 2:
				ler.nextLine();
				System.out.println("Digite o produto que deseja adicionar");
				String add = ler.nextLine();
				produtos.add(add);
				break;

			case 3:
				ler.nextLine();
				System.out.println("Digite o produto que deseja remover");
				String remover = ler.nextLine();
				if(produtos.contains(remover)) {
					produtos.remove(remover);
				} else {
					System.out.println("Produto não existe no estoque");
				}
				break;

			case 4:
				ler.nextLine();
				System.out.println("Digite o produto que deseja substituir");
				String att = ler.nextLine();
				if(produtos.contains(att)) {
					produtos.remove(att);
					System.out.println("Digite o produto que deseja colocar no lugar");
					String sub = ler.nextLine();
					produtos.add(sub);
				} else {
					System.out.println("Produto não existe no estoque");
				}
				break;

			default:
				System.out.println("Encerrado");
			}
		} while (op != 0);

	}

}
