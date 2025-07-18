package M04_OUTROS_TOPICOS;

import java.util.Scanner;

public class A02_Op_Bitwise {
		
		Scanner sc = new Scanner(System.in);
		int mask = 0b100000;
		int n = sc.nextInt();{
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false");
		}
		sc.close();
	}
}