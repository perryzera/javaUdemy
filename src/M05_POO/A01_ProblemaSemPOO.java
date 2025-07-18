package M05_POO;

import java.util.Locale;
import java.util.Scanner;

public class A01_ProblemaSemPOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC, aX, aY, pX, pY;
		
		System.out.println("Escreva os lados do triangulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Escreva os lados do triângulo Y");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		pX = (xA + xB + xC) / 2.0;
		pY = (yA + yB + yC) / 2.0;
		
		aX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
		aY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));
		
		System.out.println("Área do triângulo X: " + aX);
		System.out.println("Área do triângulo Y: " + aY);
		
		if (aX > aY) {
			System.out.println("Área maior: X");
		} else {
			System.out.println("Área maior : Y");
		}
		sc.close();
	}
}
