package M06_CPSE;

	public class A01_Classe {

		private String name;
		private double price;
		private int quantity;


//		public A01_Classe(String name, double price, int quantity) {
//			this.name =  name;
//			this.price = price;
//			this.quantity = quantity;
//		}
		
		// MÉTODO SET NAME, para setar o nome
//		public void setName(String name) {
//			this.name = name;
//		}
		// MÉTODO GET NAME, para pegar o nome setado
//		public String getName() {
//			return name;
//		}
		// MÉTODO SET PRICE, para setar o preço
//		public void setPrice(double price) {
//			this.price = price;
//		}
		// MÉTODO GET PRICE, para pegar o preço setado
//		public double getPrice() {
//			return price;
//		}
		
		
		public A01_Classe(String name, double price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getQuantity() {
			return quantity;
		}

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
