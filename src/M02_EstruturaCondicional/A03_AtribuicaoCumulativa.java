package M02_ESTRUTURA_CONDICIONAL;

import java.util.Locale;
import java.util.Scanner;

public class A03_AtribuicaoCumulativa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um valor de minutos");
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if (minutos > 100) {
// Esse é o modo com que se escreve uma atribuição cumulativa
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();
		
	}

}
