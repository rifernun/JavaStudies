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
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int year = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            vect[i] = new Person(name, year, height);
        }

        double sum = 0.0;
        for(int i = 0; i < vect.length; i++) {
            sum += vect[i].getHeight();
        }
        double avgHeights = sum / vect.length; //media das alturas!

        double nSixteen = 0.0;
        for(int i = 0; i < vect.length; i++) {
            if(vect[i].getYears() < 16) {
                nSixteen++;
            }
        }
        double pSixteen = nSixteen / vect.length * 100.0;
        System.out.printf("Altura média: %.2f%n", avgHeights);
        System.out.println("Pessoas com menos de 16 anos: " + pSixteen + "%");
        for(int i = 0; i < vect.length; i++) {
            if(vect[i].getYears() < 16) {
                System.out.println(vect[i].getName());
            }
        }



        sc.close();
    }
}
