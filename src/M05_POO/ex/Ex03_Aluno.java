package M05_POO;

import java.util.Locale;
import java.util.Scanner;

public class Ex03_Aluno {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Ex03_Classe aluno = new Ex03_Classe();

		System.out.println("Escreva o nome do aluno: ");
		aluno.nome = sc.next();
		System.out.println("Digite a nota do " + aluno.nome + " no 1° Semestre: (MÁX:30)");
		aluno.n1 = sc.nextDouble();
		System.out.println("Digite a nota do " + aluno.nome + " no 2° Semestre: (MÁX:35)");
		aluno.n2 = sc.nextDouble();
		System.out.println("Digite a nota do " + aluno.nome + " no 3° Semestre: (MÁX:35)");
		aluno.n3 = sc.nextDouble();

		System.out.println("Nota final: " + aluno.notaFinal());

		if (aluno.notaFinal() >= 60.0) {
			System.out.println("PASS (Aluno aprovado!)");
		} else {
			System.out.println("FAILED (Aluno reprovado!)");
			System.out.println();
			System.out.println("Faltou " + aluno.notaPrecisa() + " para ser aprovado :(");
		}

		sc.close();
	}
}