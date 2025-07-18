package M02_ESTRUTURA_CONDICIONAL;
import java.util.Scanner;

// Estrutura usada quando deseja decidir um VALOR com base
// em uma condicional

// (condição) ? valor_se_verdade : valor_se_falso


public class A04_CondicionalTernaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		System.out.println(desconto);
		
		sc.close();
		
	}

}
