package M03_EstruturasRepetitivas;
import java.util.Scanner;

public class Ex_For1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor");
		
		int x = sc.nextInt();
		int soma = 0;
			
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}


/*
Recomenda-se usar quando não se sabe previamente a quantidade de repetições

V: executa e volta
F: pula fora

*/