package M07_MemArLis;

import java.util.Scanner;
import java.util.Locale;

public class A01_Vetores{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor de N: ");
		int n = sc.nextInt();
		
		// DECLARAÇÃO DE VETOR
		double[] vect = new double[n];
		
		// INSERE UM VALOR A CADA POSIÇÃO DO VETOR
		for (int i = 0; i < n; i ++) {
			System.out.println("Digite o " + i + " elemento do Vetor: ");
			vect[i] = sc.nextDouble();
		}
		
		// CALCULA A MÉDIA DOS VALORES DO VETOR
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}
		
		double avg = soma / n;
		
		System.out.println("Média dos valores dos vetores: " + avg);
		
		
		sc.close();
	}
}