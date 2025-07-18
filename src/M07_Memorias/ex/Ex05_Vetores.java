package M07_MemArLis;

import java.util.Scanner;

public class Ex05_Vetores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números você vai digitar?");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		int maior = 0;
		int posicaoMaior = 0;
		
		for (int i=0; i < n; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		for (int i=0; i < vect.length; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posicaoMaior = i;
			}
		}
		System.out.print("Maior valor = " + maior);
		System.out.println();
		System.out.printf("Posição do maior valor = " + posicaoMaior);
		
		sc.close();
	}
}