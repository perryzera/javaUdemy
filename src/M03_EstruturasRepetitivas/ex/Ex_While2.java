package M03_EstruturasRepetitivas;
import java.util.Scanner;

public class Ex_While2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("AUT-POSTO PERRY");
		System.out.println("1. Álcool");
		System.out.println("2. Gasolina");
		System.out.println("3. Diesel");

		System.out.println("Digite o número correspondente ao combustível ");
		int combustivel = sc.nextInt();

		int a = 0;
		int g = 0;
		int d = 0;

		while (combustivel != 4) {
			switch (combustivel) {
			case 1:
				a++;
				break;
			case 2:
				g++;
				break;
			case 3:
				d++;
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
			combustivel = sc.nextInt();

		}

		System.out.println("MUITO OBRIGADO");
		System.out.printf("Álcool: %d%n", a);
		System.out.printf("Gasolina: %d%n", g);
		System.out.printf("Diesel: %d%n", d);

		sc.close();
	}
}
