package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        for(int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        int sum = 0;
        int nPares = 0;
        for(int i = 0; i < vect.length; i++) {
            if(vect[i] % 2 == 0) {
                sum += vect[i];
                nPares++;
            }
        }
        if(nPares == 0) {
            System.out.print("NENHUM NUMERO PAR");
        }else {
            System.out.printf("MEDIA DOS PARES = %.1f", (double)(sum / nPares));
        }
        sc.close();
    }
}
