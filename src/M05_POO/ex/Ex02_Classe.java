package M05_POO;

public class Ex02_Classe {
	public String nome;
	public double salarioBruto, salarioLiquido, salarioFinal, aumento, imposto;

	public double salarioLiquido() {
		return salarioLiquido = (salarioBruto - (salarioBruto * imposto / 100.0));
	}

	public double salarioFinal() {
		return salarioFinal = (salarioBruto + aumento - (salarioBruto + aumento) * (imposto / 100.0));
	}

	public String toString() {
		return nome + String.format(" R$ %.2f", salarioFinal());
	}
}