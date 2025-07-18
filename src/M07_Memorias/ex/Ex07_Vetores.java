package M07_MemArLis;

import java.util.Locale;
import java.util.Scanner;

public class Ex07_Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;

        // Calcular soma dos elementos
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i];
        }

        // Calcular média corretamente
        double media = soma / vect.length;

        // Exibir média com 3 casas decimais
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);

        // Mostrar elementos abaixo da média
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < media) {
                System.out.printf("%.1f%n", vect[i]);
            }
        }

        sc.close();
    }
}
