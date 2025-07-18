package M05_POO;

import java.util.Locale;
import java.util.Scanner;

public class A03_Metodo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		A03_TrianguloMetodo x, y;
		x = new A03_TrianguloMetodo ();
		y = new A03_TrianguloMetodo ();
		
		System.out.println("Escreva os lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Escreva os lados do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Área do triângulo X: %.4f%n", areaX);
		System.out.printf("Área do triângulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Área maior: X");
		} else {
			System.out.println("Área maior : Y");
		}
		sc.close();
	}
}

