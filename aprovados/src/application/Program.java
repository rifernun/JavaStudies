package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        Student[] vect = new Student[n];
        for(int i = 0; i < vect.length; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            sc.nextLine();
            String name = sc.nextLine();
            double firstNote = sc.nextDouble();
            double secondNote = sc.nextDouble();
            vect[i] = new Student(name,firstNote,secondNote);
        }
        //media ate 6
        System.out.println("Alunos aprovados:");
        for(int i = 0; i < vect.length; i++) {
            double sum = vect[i].getFirstNote() + vect[i].getSecondNote();
            if(sum / 2 >= 6.0) {
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
