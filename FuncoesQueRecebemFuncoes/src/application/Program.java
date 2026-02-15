package application;

import model.entities.Product;
import model.services.ProductService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

//        List<Product> list = new ArrayList<>();

//        list.add(new Product("Tv", 900.00));
//        list.add(new Product("Mouse", 50.00));
//        list.add(new Product("Tablet", 350.50));
//        list.add(new Product("HD Case", 80.90));
//
//        ProductService ps = new ProductService();
//
//        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
//
//        System.out.printf("Sum = %.2f%n", sum);

        List<Integer> list = Arrays.asList(70,20,28,50,39);
        Stream<Integer> stream1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(stream1.toArray()));

        System.out.println();
        Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(100    ).toArray()));
    }
}
