package AulaJava;

import java.util.Scanner;

public class exercicioJava1 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int n1,n2,n3,p1=2,p2=3,p3=5;
		float media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = ler.nextInt();
		System.out.println("Digite a segunda nota: ");
		n2 = ler.nextInt();
		System.out.println("Digite a terceira nota: ");
		n3 = ler.nextInt();
		media = ((n1*p1)+(n2*p2)+(n2*p3))/(p1+p2+p3);
		System.out.println("A média é foi de: "+media);
				
	}
}
