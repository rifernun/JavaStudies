package application;

import model.entities.ImportedProduct;
import model.entities.Product;
import model.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if(ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = sc.next();
                LocalDate manufactureDateFormatted = LocalDate.parse(manufactureDate, dtf);
                Product product = new UsedProduct(name, price, manufactureDateFormatted);
                list.add(product);
            }
            if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customsFee);
                list.add(product);
            } else {
                Product product = new Product(name, price);
                list.add(product);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for(Product item : list) {
            System.out.println(item.priceTag());
        }

        sc.close();
    }
}
