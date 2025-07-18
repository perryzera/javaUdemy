package M03_EstruturasRepetitivas;
import java.util.Scanner;

/*
Leia um valor inteiro N. Este valor será a quantidade de 
valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] 
e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, 
e "out" para fora do intervalo).
*/

public class Ex_For2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite quantos números inteiros serão lidos: ");
		int N = sc.nextInt();


		int in = 0;
		int out = 0;

		for (int i = 0; i < N; i++) {
			System.out.println("Digite um número inteiro: ");
			int X = sc.nextInt();
			
			if (X >= 10 && X <= 20) {
				in += 1;
			} else {
				out += 1;
			}

		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		

		sc.close();
	}

}
