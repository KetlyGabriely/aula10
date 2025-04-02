package aula10;

import java.util.Scanner;

public class DesafioTabuada {
	public static void main (String [] args) {
		Scanner ler = new Scanner (System.in);
		int numero, resultado;
		
		System.out.println("Informe um número: ");
		numero = ler.nextInt();
		
		System.out.println("A tabuada é: ");
		for (int i= 1; i <= 10; i++) {
			resultado = numero*i;
		
		System.out.println(i + " X " + numero + " = " + resultado);
		}
		
		ler.close();
	}

}

