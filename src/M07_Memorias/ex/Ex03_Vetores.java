package M07_MemArLis;

import java.util.Locale;
import java.util.Scanner;

public class Ex03_Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Ex03_Classes[] vect = new Ex03_Classes[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine(); 
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Ex03_Classes(name, idade, altura);
		}

		double soma = 0.0;
		int contMenores16 = 0;

		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getAltura();
		}

		double media = soma / vect.length;

		System.out.printf("Altura média: %.2f%n", media);

		// Contar menores de 16 e mostrar nomes
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				contMenores16++;
			}
		}

		double porcentagem = ((double) contMenores16 / vect.length) * 100.0;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getName());
			}
		}

		sc.close();
	}
}
