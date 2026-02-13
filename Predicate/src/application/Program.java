package application;

import model.entities.Product;
import util.ProductPredicate;
import util.UpdatePrice;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

//        PREDICATE
//        Predicate<Product> pred = product -> product.getPrice() >= 100;
//        list.removeIf(new ProductPredicate());
//        list.removeIf(Product::staticProductPredicate);
//        list.removeIf(Product::nonStaticProductPredicate);
//        list.removeIf(pred);
//        list.removeIf(p -> p.getPrice() >= 100);

//        CONSUMER
//        list.forEach(new UpdatePrice());
//        list.forEach(Product::staticPriceUpdate);
//        list.forEach(Product::nonStaticPriceUpdate);
//        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
//        list.forEach(cons);
//        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

//        Function
//        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
//        List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
//        List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
//        Function<Product, String> func = p -> p.getName().toUpperCase();
//        List<String> names = list.stream().map(func).collect(Collectors.toList());
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);


//        for (Product p : list) {
//            System.out.println(p);
//        }
    }
}
