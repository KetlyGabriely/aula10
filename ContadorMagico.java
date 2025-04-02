package aula10;

import java.util.Scanner;

public class ContadorMagico {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Contagem crescente: ");
		for (int i= 1; i <= 10 ; i++) {
			System.out.println(i);
		}
		
		System.out.println("Contagem decrescente: ");
		for (int i= 10; i >= 1 ; i--) {
			System.out.println(i);
		}
		
		ler.close();
	}

}