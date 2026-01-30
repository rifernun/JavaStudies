package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Person[] vect = new Person[n];
        for(int i = 0; i < vect.length; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            double height = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            String gender = sc.next();
            vect[i] = new Person(height,gender);
        }
        double menorAltura = 0.0;
        double maiorAltura = 0.0;
        double avgMulheresHeight = 0.0;


        sc.close();
    }
}
