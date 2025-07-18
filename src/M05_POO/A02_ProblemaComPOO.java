package M05_POO;

import java.util.Locale;
import java.util.Scanner;

public class A02_ProblemaComPOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		A02_TrianguloEntidade x, y;
		x = new A02_TrianguloEntidade ();
		y = new A02_TrianguloEntidade ();
		
		System.out.println("Escreva os lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Escreva os lados do triângulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double pX = (x.a + x.b + x.b) / 2.0;
		double pY = (y.a + y.b + y.c) / 2.0;
		
		double aX = Math.sqrt(pX * (pX - x.a) * (pX - x.b) * (pX - x.c));
		double aY = Math.sqrt(pY * (pY - y.a) * (pY - y.b) * (pY - y.c));
		
		System.out.println("Área do triângulo X: %.4f%n" + aX);
		System.out.println("Área do triângulo Y: %.4f%n" + aY);
		
		if (aX > aY) {
			System.out.println("Área maior: X");
		} else {
			System.out.println("Área maior : Y");
		}
		sc.close();
	}
}

