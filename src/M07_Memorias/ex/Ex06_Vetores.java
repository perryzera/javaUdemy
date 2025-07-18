package M07_MemArLis;

import java.util.Locale;
import java.util.Scanner;

public class Ex06_Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];
		
		for (int i=0; i < n ; i++) {
			System.out.println("Digite os valores do vetor A: ");
			vectA[i] = sc.nextInt();
		}
		
		for (int i=0; i < n; i++) {
			System.out.print("Digite os valores do vetor B: ");
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("Vetor resultante: ");
		for (int i=0; i < n; i++) {
			// SOMA ENTRE DOIS VETORES
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
		
		
		sc.close();
	}
}