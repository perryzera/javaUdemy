// MÚLTIPLOS OU NÃO

package M02_EstruturaCondicional;

import java.util.Scanner;

public class Ex3_If_Else {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y;

		System.out.println("Digite um número: ");
		x = sc.nextInt();

		System.out.println("Digite outro número: ");
		y = sc.nextInt();

		if (x % y == 0) {
			System.out.println("Os números " + x + " e " + y + " SÃO múltiplos.");
		} else {
			System.out.println("Os números " + x + " e " + y + " NÃO são múltiplos.");
		}
		sc.close();
	}
}
