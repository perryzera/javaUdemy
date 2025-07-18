package M05_POO;

public class Ex03_Classe {
	public String nome;
	public double n1, n2, n3, nf, np;

	public double notaFinal() {
		return nf = n1 + n2 + n3;
	}

	public double notaPrecisa() {
		if (notaFinal() < 60.0) {
			return 60.0 - nf;
		} else {
			return 0.0;
		}
	}

}