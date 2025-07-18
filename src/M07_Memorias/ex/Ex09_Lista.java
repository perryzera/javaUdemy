package M07_MemArLis;

import java.util.ArrayList;
import java.util.List;
// import java.util.Locale;
import java.util.Scanner;

public class Ex09_Lista{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Locale.setDefault(Locale.US);
		
		List<Ex09_Classes> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i ++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salario = sc.nextDouble();
			
			// Instanciando dentro da memória, um novo (obj emp) = Funcionario
			// com os dados (id, nome e salario)
			// e por fim, adicionar elemento na lista (obj emp)
			Ex09_Classes emp = new Ex09_Classes(id, name, salario);
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		
		if (idsalary)
		System.out.print("Enter the percentage: ");
		int percent = sc.nextDouble();
		
		list.get(idsalary);
		
		
		
		
		
		
		
		sc.close();
	}
}