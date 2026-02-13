package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            int item = sc.nextInt();
            set.add(item);
        }
        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            int item = sc.nextInt();
            set.add(item);
        }
        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            int item = sc.nextInt();
            set.add(item);
        }

        System.out.println("Total students: " + set.size());

        sc.close();
    }
}
