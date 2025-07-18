package M06_CPSE;

public class Ex02_Classe {
	private int conta;
	private String nome;
	private double saldo;
	
	public Ex02_Classe(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}

	public Ex02_Classe(int conta, String nome, double depInicial) {
		this.conta = conta;
		this.nome = nome;
		deposito(depInicial);
	}

	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito (double qtd) {
		saldo += qtd;
	}
	
	public void saque (double qtd) {
		saldo -= qtd + 5;
	}
	
	public String toString() {
		return "Conta "
				+ conta
				+ ", Titular: "
				+ nome
				+ ", Saldo: "
				+ String.format("%.2f", saldo);
	}
}



