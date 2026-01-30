package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        Person[] vect = new Person[n];
        for(int i= 0; i < vect.length; i++) {
            int number = i+1;
            System.out.println("Dados da " + number + "a pessoa:");
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int yearsOld = sc.nextInt();
            vect[i] = new Person(name, yearsOld);
        }
        int maisVelho = 0;
        int pMV = 0;
        for(int i= 0; i < vect.length; i++) {
            if(vect[i].getYearsOld() > maisVelho) {
                maisVelho = vect[i].getYearsOld();
                pMV = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + vect[pMV].getName());
        sc.close();
    }
}
