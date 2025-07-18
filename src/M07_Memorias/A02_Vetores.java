package M07_MemArLis;

import java.util.Locale;
import java.util.Scanner;

//  ALOCAÇÃO DE VETORES COM MAIS DE UMA VARIAVEL, EX: NOME E PREÇO
//  O VECT.LENGTH É O TAMANHO DO VETOR, NÃO SENDO NECESSÁRIO O USO DA VAR N

public class A02_Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		int n = sc.nextInt();
		
		// IMPORTANDO A CLASSE
		A02_Classes[] vect = new A02_Classes[n];
		
		// INSERE UM VALOR A CADA POSIÇÃO DO VETOR
		for (int i= 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new A02_Classes(name, price);
		}
		
		// SOMA O PREÇO DOS ELEMENTOS DO VETOR
		double soma = 0.0;
		for (int i= 0; i < vect.length; i++) {
			soma += vect[i].getPrice();
		}
		
		// CALCULA A MÉDIA
		double avg = soma / vect.length;
		
		System.out.println("Media preço = " + avg);
		
		sc.close();
	}
}