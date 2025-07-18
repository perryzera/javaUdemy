// PAR OU ÍMPAR

package M02_EstruturaCondicional;
import java.util.Scanner;

public class Ex2_If_Else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("Número PAR");
		} else {
			System.out.println("Número ÍMPAR");
		}
		sc.close();
	}
}

