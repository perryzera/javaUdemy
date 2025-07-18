package M04_OUTROS_TOPICOS;

import java.util.Scanner;

// import java.util.Scanner;

public class A04_Funcoes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 3 números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// Chama a função MAX para definir o maior valor entre A, B e C 
		int higher = max(a, b, c);

		// Chama a função HIGHER para exibir na tela a mensagem do maior valor
		showResult(higher);
		
		sc.close();
	}

	// Funcão para resultar o maior valor entre X, Y e Z
	public static int max(int x, int y, int z) {
		int aux;

		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		
		return aux;
	}
	
	// Função para exibir na tela a mensagem
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
