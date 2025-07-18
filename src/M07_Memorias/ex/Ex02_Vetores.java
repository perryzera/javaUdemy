package M07_MemArLis;

import java.util.Locale;
import java.util.Scanner;

public class Ex02_Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escreva o valor de N: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i < n; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i=0; i < n; i++) {
			soma += vect[i];
		}
		
		double media = soma / n;
		
		System.out.println("Valores: " + n);
		System.out.println("Soma dos vetores: " + soma);
		System.out.println("Media dos vetores: " + media);
		
		sc.close();
	}
}