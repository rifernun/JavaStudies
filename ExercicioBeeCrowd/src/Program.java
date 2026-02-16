import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double value = sc.nextDouble();

        System.out.println(Integer.parseInt(value / 100.0));


        sc.close();
    }
}
