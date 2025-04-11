package aula10;

import java.util.Scanner;

public class TorneioNumeros {
	public static void main (String [] args) {
		
		int num = 0;
		int par = 0;
		int impar = 0;
		int neutro = 0;
		
		Scanner ler = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Informe um número: ");
			num = ler.nextInt();
			
			if (num == 0){
				neutro++;
			}
			else if (num % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		
		System.out.println(par + " números são pares");
		System.out.println(impar + " números são ímpares");
		System.out.println(neutro + " números são neutros");
		
		if (par > impar) {
			System.out.println("Par é o vencedor");
		}
		
		else if (par == impar) {
			System.out.println("Empate");
		}
		else {
		System.out.println("Impar é o vencedor");
		}
		
		ler.close();
	}

}
