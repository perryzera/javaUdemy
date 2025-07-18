package M01_ESTRUTURA_SEQUENCIAL;

public class A03_FuncoesMatematicas {
	public static void main(String[] args) {
		double x = 4.0;
		double y = 2.0;
		double z = -5.0;
		double A, B, C;

// Raíz Quadrada X²
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raíz quadrada de " + x + " = " + A);
		System.out.println("Raíz quadrada de " + y + " = " + B);
		System.out.println("Raíz quadrada de 25 = " + C);

// Potência X^Y
		A = Math.pow(x, y);
		B = Math.pow(x, 5.0);
		C = Math.pow(12.5, 6.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado a 5 = " + B);
		System.out.println("12.5 elevado a 6.0 = " + C);

// Valor Absoluto +X
		A = Math.abs(x);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + x + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
	}
}
