package M05_POO;
	public class A04_Produto {

		public String name;
		public double price;
		public int quantity;

		public double totalValueInStock() {
			return price * quantity;
		}
		
		public void addProducts(int quantity) {
			this.quantity += quantity;
		}
		
		public void removeProducts(int quantity) {
			this.quantity -= quantity;
		}
		
		// TO STRING : converter a saída de um número, para string
		public String toString() {
			return name 
					+ ", $ " 
					+ String.format("%.2f", price) 
					+ ", " 
					+ quantity 
					+ " units, Total: $ " 
					+ String.format("%.2f", totalValueInStock());
		}
}
