package M06_CPSE;

import java.util.Locale;
import java.util.Scanner;

public class Ex02_Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Ex02_Classe banco;
		
		System.out.println("Digite o Numero da Conta: ");
		int conta = sc.nextInt();
		System.out.println("Digite o Nome do Titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("Deseja fazer um depósito inicial? (S/N)");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.println("Qual o valor do deposito?");
			double depInicial = sc.nextDouble();
			banco = new Ex02_Classe(conta, nome, depInicial);
		} else {
			banco = new Ex02_Classe(conta, nome);
		}
		
		System.out.println("Dados da Conta: ");
		System.out.println(banco);
		
		System.out.println();
		System.out.println("Insira o valor de deposito: ");
		double valDeposito = sc.nextDouble();
		banco.deposito(valDeposito);
		
		System.out.println("Insira o valor de saque: ");
		double valSaque = sc.nextDouble();
		banco.saque(valSaque);
		
		System.out.println("Dados Bancários atualizados: ");
		System.out.println(banco);
		
		
		sc.close();
	}
}