package M07_MemArLis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A04_Listas {
	public static void main(String[] args) {
		
		// DECLARAR UMA LISTA
		List<String> list = new ArrayList<>();
		
		// 1. ADICIONAR
		//
		// 		1.1 ADICIONAR ELEMENTOS A UMA LISTA
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("José");
		list.add("Antonio");
		//
		// 		1.2 ADICIONAR ELEMENTO EM UMA POSIÇÃO ESPECÍFICA
		list.add(2, "Marco");
		list.add(3, "Anderson");
		
		// 2. EXIBIR
		//
		// 		2.1 EXIBIR O TAMANHO DA LISTA
		System.out.println("Tamanho da Lista: " + list.size());
		
		for (String x : list) {
			System.out.println(x);
		} System.out.println("================================================");
		//
		// 		2.2 EXIBIR ELEMENTO DE UMA POSIÇÃO ESPECÍFICA
		System.out.println("Elemento na posição 0: " + list.get(0));
		for (String x : list) {
			System.out.println(x);
		} System.out.println("================================================");
		//
		// 		2.3 EXIBIR A POSIÇÃO DE UM ELEMENTO
		System.out.println("Elemento 'Bob' está na posição: " + list.indexOf("Bob"));
		System.out.println("Elemento 'José' está na posição: " + list.indexOf("José"));
		System.out.println("================================================");
		
		// 3. REMOVER
		//
		// 		3.1 REMOVER ELEMENTO PELO VALOR
		list.remove("Anna");
		System.out.println("Remover o elemento 'Ana': /");
		for (String x : list) {
			System.out.println(x);
		} System.out.println("================================================");
		//
		// 		3.2 REMOVER PELA POSIÇÃO
		list.remove(1);
		System.out.println("Remover o elemento da posição 1: ");
		for (String x : list) {
			System.out.println(x);
		} System.out.println("================================================");
		//
		// 		3.3 REMOVE OS ELEMENTOS QUE INICIAM COM A LETRA "M"
		//
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println("Remover elementos que iniciam com a letra M: ");
		for (String x : list) {
			System.out.println(x);
		} System.out.println("================================================");
		
		// 4. FILTRAR
		//
		// 		4.1 FILTRAR TODOS OS ELEMENTOS COM A INICIAL "A"
		//
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println("Filtrar elementos que iniciam com a letra A");
		for (String x : result) {
			System.out.println(x);
		} System.out.println("================================================");
		//
		// 		4.2 FILTRAR O PRIMEIRO ELEMENTO COM A INICIAL "A"
		//
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println("Filtrar apenas o primeiro elemento com a letra A");
		System.out.println(name);
	}
}

