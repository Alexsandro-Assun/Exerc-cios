package AulaJava;

import java.util.Scanner;

public class exercicioJava3 {

	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int idade,meses,dias,total;
		
		System.out.println("Digite sua idade em anos, meses e dias");
		System.out.println("\nDigite quantos anos você tem: ");
		idade = ler.nextInt();
		System.out.println("Digite os meses: ");
		meses = ler.nextInt();
		System.out.println("Digite os dias: ");
		dias = ler.nextInt();
		total = (idade*365)+(meses*30)+dias;
		
		System.out.println("Seus dias de vida são aproximadamente: "+total+" dias");
	}

}
