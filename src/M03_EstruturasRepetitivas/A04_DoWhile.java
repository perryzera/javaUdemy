package M03_ESTRUTURAS_REPETITIVAS;

import java.util.Locale;
import java.util.Scanner;

public class A04_DoWhile {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp;
		do {
			System.out.println("Escreva uma temperatura em °C: ");
			double tempoc = sc.nextDouble();
			double tempof = ((9.00 * tempoc) / 5.00) + 32.00;
			System.out.printf("Temperatura em °F: %.1f%n", tempof);
			System.out.println("Deseja inserir outro valor? (S/N)");
			resp = sc.next().charAt(0);
		} while (resp != 'N');
		
		sc.close();
	}
}