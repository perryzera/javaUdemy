package M03_ESTRUTURAS_REPETITIVAS;
import java.util.Scanner;

/*
Leia um valor inteiro X (1 <= X <= 1000). 
Em seguida mostre os ímpares de 1 até X, um valor por linha, 
inclusive o X, se for o caso.
*/


public class A02_For {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de repetições: ");

		int X = sc.nextInt();
		int soma = 0;
		
		for (int i = 0 ; i < X ; i++) {
			int y = sc.nextInt();
			soma += y;
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}
