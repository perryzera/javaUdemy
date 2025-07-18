package M04_OUTROS_TOPICOS;

public class A01_Convencoes {
	private String holder;
	private Double balance;

	public A01_Convencoes(String holder, Double balance) {
		this.holder = holder;
		this.balance = balance;
	}

	public String getHolder() {
		return holder;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}
}