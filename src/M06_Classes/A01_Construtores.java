package M06_CPSE;

import java.util.Locale;
import java.util.Scanner;

public class A01_Construtores {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		System.out.println();
		
		A01_Classe product = new A01_Classe(name, price, quantity);
		
		// PUXA o NOME do Objeto, dentro da Classe
		product.setName("Computer");
		// Exibe na tela o NOME do Objeto puxado
		System.out.println("Updated name: " + product.getName());
	
		// PUXA o PREÇO do Objeto, dentro da Classe
		product.setPrice(140.00);
		// Exibe na tela o PREÇO do Objeto puxado
		System.out.println("Updated price: " + product.getPrice());
		
		System.out.println("Product data: " + product);
		System.out.println();

		
		// ADICIONAR produtos
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		
		System.out.println("Updated data: " + product);
		System.out.println();
		
		// REMOVER produtos
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}
}