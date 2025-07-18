package M07_MemArLis;

public class Ex09_Classes {
		private Integer id;
		private String name;
		private Double salario;
		
		public Ex09_Classes(int id, String name, double salario) {
			this.id = id;
			this.name = name;
			this.salario = salario;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getSalario() {
			return salario;
		}

		public void setSalario(Double salario) {
			this.salario = salario;
	}
}
