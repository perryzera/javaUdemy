package M05_POO;

import java.util.Locale;
import java.util.Scanner;

public class Ex02_Funcionario {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Ex02_Classe funcionario = new Ex02_Classe();

		System.out.println("Insira o nome do funcionário: ");
		funcionario.nome = sc.next();
		System.out.println("Insira o salário bruto do funcionário: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.println("Insira a porcentagem do imposto aplicado sobre o salário bruto: ");
		funcionario.imposto = sc.nextDouble();

		System.out.println("Colaborador: " + funcionario.nome + ", " + "R$ " + funcionario.salarioLiquido());
		System.out.println();

		System.out.println("Insira a porcentagem de aumento sobre o salário bruto: ");
		funcionario.aumento = sc.nextDouble();

		System.out.println();
		System.out.println("Updated data: " + funcionario);

		sc.close();
	}
}