package M02_ESTRUTURA_CONDICIONAL;
import java.util.Scanner;


// Quando se tem várias condições de fluxo, é melhor usar o SwitchCase
// até para não ficar um código enorme cheio de if else

public class A02_SwitchCase {
	public static void main(String[] args) {
		
		System.out.println("Escreva o dia da semana");
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}
}