// INTEIRO OU NEGATIVO

package M02_EstruturaCondicional;
import java.util.Scanner;

public class Ex1_If_Else {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;

		System.out.println("Escreva um número: ");
		x = sc.nextInt();
		
		if (x > 0) {
			System.out.println("O número inserido é um Inteiro.");
		}
		else {
			System.out.println("O número inserido é Negatio.");
		}
		sc.close();
	}
}
