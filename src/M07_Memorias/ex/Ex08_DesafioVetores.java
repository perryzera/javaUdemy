package M07_MemArLis;

import java.util.Locale;
import java.util.Scanner;

public class Ex08_DesafioVetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Ex08_Classes[] vet = new Ex08_Classes[10];
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("");
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			   
// 			Aqui estou instanciando o Objeto (name e email)
// 			E atribuindo a referência dele ao Vetor, na posição "Room"
			vet[room] = new Ex08_Classes(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vet[i] != null) {
				System.out.println(i + ": " + vet[i]);
			}
		}
		
		
		sc.close();
	}
}