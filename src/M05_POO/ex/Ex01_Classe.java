package M05_POO;

import java.util.Locale;
import java.util.Scanner;

public class Ex01_Classe {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Ex01_Retangulo retangulo = new Ex01_Retangulo();
		
		System.out.println("Digite a Altura do retângulo: ");
		retangulo.hR = sc.nextDouble();
		System.out.println("Digite a Largura do retângulo: ");
		retangulo.lR = sc.nextDouble();
		
		System.out.printf("Area = " + retangulo.areaRet());
		System.out.println();
		System.out.printf("Perimetro = " + retangulo.perimRet());
		System.out.println();
		System.out.printf("Diagonal = " + retangulo.diagRet());
		
		sc.close();
	}
}