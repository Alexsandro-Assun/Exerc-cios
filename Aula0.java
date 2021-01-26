package AulaJava;

import java.util.Scanner;

public class Aula0 {
	public static void main(String args [])
	{
		Scanner ler = new Scanner(System.in);
		int h,min,seg,d;
		
		System.out.println("Digite a duração do evento em segundos: ");
		d = ler.nextInt();
		h = (d/3600);
		min = (d%3600)/60;
		seg = (d%3600)%60;
		
		System.out.println("Convertendo: "+h+"h"+min+"m"+seg+"s");
		
		
		
	}

}
