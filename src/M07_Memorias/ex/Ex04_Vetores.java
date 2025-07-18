package M07_MemArLis;

import java.util.Locale;
import java.util.Scanner;

public class Ex04_Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int pares = 0;
		
		int[] vect = new int[n];
		
		for (int i=0; i < vect.length; i++) {
			System.out.printf("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Números pares: ");
		for (int i=0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
				pares ++;
			}
		}
		System.out.println();
		System.out.print("Quantidade de numeros pares: " + pares);
		
		sc.close();
	}
}