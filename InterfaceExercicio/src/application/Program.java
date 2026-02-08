package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), dtf);
        System.out.print("Valor do contrato: ");
        double contractValue = sc.nextDouble();

        Contract obj = new Contract(number, date, contractValue);

        System.out.print("Entre com o numero de parcelas: ");
        int installments = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(obj, installments);

        System.out.println("Parcelas:");
        for (Installment installment : obj.getList()) {
            System.out.println(installment.getDate().format(dtf) + " - " + String.format("%.2f", installment.getAmount()));
        }

        sc.close();
    }
}
