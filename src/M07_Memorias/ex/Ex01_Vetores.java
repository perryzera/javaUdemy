package M07_MemArLis;

import java.util.Locale;
import java.util.Scanner;

public class Ex01_Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de N (max. 10)");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i < n; i++) {
			System.out.println("Digite um numero (positivo ou negativo)");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println("Números negativos: ");
		for (int i=0; i < n; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}
}