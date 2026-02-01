package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for(int i = 1;i <= n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or Company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(ch == 'i') {
                System.out.print("Health Expenditures: ");
                double healthExpenditures = sc.nextDouble();
                TaxPayer taxPayer = new Individual(name,anualIncome,healthExpenditures);
                list.add(taxPayer);
            }
            if (ch == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                TaxPayer taxPayer = new Company(name,anualIncome,numberOfEmployees);
                list.add(taxPayer);
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer payers : list) {
            System.out.printf("%s: $ %.2f%n", payers.getName(), payers.tax());
        }
        double totalTaxes = 0.0;
        for (TaxPayer payers : list) {
            totalTaxes += payers.tax();
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: %.2f", totalTaxes);

        sc.close();
    }
}
