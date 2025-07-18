package M07_MemArLis;

public class A03_forEach {
	public static void main(String[] args) {
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		/*
		MODA ANTIGA
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		*/
		
		// MODO FOR EACH
		// "Para cada objeto 'OBJ' contido em VECT, faça:"
		for (String obj : vect) {
		System.out.println(obj);
		}
	}
}