package M05_POO;

public class A03_TrianguloMetodo {
	public double a, b, c;
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
